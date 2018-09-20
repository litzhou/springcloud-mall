# springcloud-mall
springcloud商城基础框架

### run
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

#### step3

- 注册中心： http://localhost:8080
- 服务网关测试：http://localhost:8088/api/user, http://localhost:8088/api/goods



