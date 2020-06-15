### 运行风控服务：
空算法体风控算法接口。

> java -jar rest-service-0.0.1-SNAPSHOT.jar

> 端口：8080

### 请求方法和参数
 
1. post

2. 输入参数为json，只有一个：token，值必须为
> GVT2020VALID

示例：
>curl -i -H "Accept: application/json;charset:utf-8" -H "Content-Type:application/json" -X POST --data "{\\"token\": \\"GVT2020VALID\\"}"  "http://localhost:8080/ana-risk"

### 输出
1. 输出为json：
> {"riskLevel":0.0,"result":"ACCEPT","code":"200","msg":"成功"}
>
>或者
>
>{"riskLevel":0.0,"result":null,"code":"201","msg":"没有访问权限"}
2. 参数说明
>riskLevel代表风险值；
>
>result为ACCEPT或REFUSE，代表接受信贷申请或拒绝信贷申请；
>
>code为200代表成功，201代表没有接口权限，暂无其他值

