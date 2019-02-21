### rpc-benchmark

提供主流RPC框架性能评测方案

## 准备

- 安装ansible

- 安装terraform
 
- brew install terraform-inventory

## 购买机器
 
 - 配置AK／SK
 
   ` export ALICLOUD_ACCESS_KEY="XXXX"
 `
 
   ` export ALICLOUD_SECRET_KEY="XXXX"`
 - 购买机器
 
   `terraform init`
 
   `terraform apply`
 ## 初始化环境
 - 安装JDK,MVN,代码部署
  
   
   ansible-playbook initEnv.yaml --inventory=\`which terraform-inventory\`  -u root
   

 ## 执行测试
 
   ansible-playbook initEnv.yaml --inventory=\`which terraform-inventory\`  -u root
 
  
