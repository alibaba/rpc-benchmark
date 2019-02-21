# Define variables

variable "region" {}
variable "private_key_file" {}
variable "key_name" {}
variable "image_id" {}
variable "availability_zone" {}
variable "instance_types" {
  type = "map"
}

variable "num_instances" {
  type = "map"
}

# Configure the Alicloud Provider
provider "alicloud" {
  region     = "${var.region}"
}


#create rpc-server
resource "alicloud_instance" "rpc-server" {
  provider          = "alicloud"
  image_id          = "${var.image_id}"
  availability_zone          = "${var.availability_zone}"
  internet_charge_type  = "PayByBandwidth"
  instance_type        = "${var.instance_types["server"]}"
  security_groups      = ["${alicloud_security_group.default.id}"]
  instance_name        = "rpc-server"
  internet_max_bandwidth_out = "1"
  system_disk_category = "cloud_ssd"
  system_disk_size = "64"
  count = "${var.num_instances["server"]}"
  key_name = "${alicloud_key_pair.key_pair.id}"
  description  = "developer_native_compare=rpc"
}

#create rpc-client
resource "alicloud_instance" "rpc-client" {
  provider          = "alicloud"
  image_id          = "${var.image_id}"
  availability_zone          = "${var.availability_zone}"
  internet_charge_type  = "PayByBandwidth"
  instance_type        = "${var.instance_types["server"]}"
  security_groups      = ["${alicloud_security_group.default.id}"]
  instance_name        = "rpc-client"
  internet_max_bandwidth_out = "1"
  system_disk_category = "cloud_ssd"
  system_disk_size = "64"
  count = "${var.num_instances["client"]}"
  key_name = "${alicloud_key_pair.key_pair.id}"
  description  = "developer_native_compare=rpc"
}

# Create security group
resource "alicloud_security_group" "default" {
  name        = "default"
  provider    = "alicloud"
 description  = "developer_native_compare=rpc"
}

resource "alicloud_security_group_rule" "allow_all_tcp" {
  type              = "ingress"
  ip_protocol       = "tcp"
  nic_type          = "internet"
  policy            = "accept"
  port_range        = "1/65535"
  priority          = 1
  security_group_id = "${alicloud_security_group.default.id}"
  cidr_ip           = "0.0.0.0/0"
}

resource "alicloud_key_pair" "key_pair" {
  key_name = "${var.key_name}"
  key_file = "${var.private_key_file}"
}

output "rpc-server" {
  value = "${alicloud_instance.rpc-server.*.private_ip}"
}

output "rpc-client" {
  value = "${alicloud_instance.rpc-client.*.private_ip}"
}
