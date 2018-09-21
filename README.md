# springcloud-mall
学习搭建 springcloud 商城基础框架
## 说明
- register-server eureka注册中心
- service-goods 商品相关服务
- service-user 用户相关服务
- api-gateway api网关、熔断、负载均衡
- app-monitor 监控中心

## run
#### step0
```json
git clone https://github.com/litzhou/springcloud-mall.git
cd ~/springcloud-mall
```
#### step1
```
mvn clean package
```
#### step2

```
docker-compose up -d
```

## 测试

- 注册中心：http://localhost:8080
- 监控中心：http://localhost:9000
- 服务网关：http://localhost:8088
    - 调用用户服务： http://localhost:8088/api/user
    - 调用商品服务： http://localhost:8088/api/goods
    
## 截图
### 架构图
![img](/images/p2.png)

