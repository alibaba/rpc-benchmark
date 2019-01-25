region            = "cn-shenzhen"
availability_zone = "cn-shenzhen-b"
private_key_file  = "rpc_alicloud.pem"
key_name          = "key-pair-for-terraform-rpc"
image_id          = "centos_7_04_64_20G_alibase_201701015.vhd"

instance_types = {
  "server"        = "ecs.se1.xlarge" #4c16g
  "client"        = "ecs.se1.xlarge" #4c16g
}

num_instances = {
  "server"        = 1
  "client"        = 1
}
