# springcloud-mall
学习搭建 springcloud 商城基础框架
<br />
依赖项目: https://github.com/litzhou/springcloud-mall-starter
## 说明
- register-server eureka注册中心
- service-goods 商品相关服务
- service-user 用户相关服务
- api-gateway api网关、熔断、负载均衡
- app-monitor 监控中心
- app-test 测试程序包

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
docker-compose -f docker-compose.before.yml up -d // 启动mysql、redis、rabbitmq
docker-compose up -d // 启动商城
```

## 测试

- 注册中心：http://localhost:8080
- 监控中心：http://localhost:9001
- 服务网关：http://localhost:8088
    - 测试用户服务：http://localhost:8088/api/user
    - 测试商品服务：http://localhost:8088/api/goods
    - 测试redis: 
        - http://localhost:8088/api/test/redis/count // 记录访问次数程序为例
    - 测试mysql: 
        - http://localhost:8088/api/test/user/list // 返回用户列表
        - http://localhost:8088/api/test/user/add?name=zhangsan // 新增用户测试
        - http://localhost:8088/api/test/user/delete?id=1 // 删除id为1的用户
        - http://localhost:8088/api/test/user/update?id=2&name=lisi // 修改id为2的用户
    - 测试rabbitmq: 
        - http://localhost:8088/api/test/rabbitmq/send?message=hello // 结果请查看控制台日志
    
## 截图
### 架构图
![img](/images/p2.png)

