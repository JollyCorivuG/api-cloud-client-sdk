# API 接口云 SDK
> 项目地址：https://github.com/JollyCorivuG/api-cloud

# SDK 架构模式
![](https://github.com/JollyCorivuG/api-cloud-client-sdk/blob/main/docs/%E6%9E%B6%E6%9E%84%E5%9B%BE.png)

# SDK 使用步骤
## 引入依赖
```
<dependency>
    <groupId>bupt.edu.jhc</groupId>
    <artifactId>apicloud-client-sdk</artifactId>
    <version>0.0.1</version>
</dependency>
```
## 设置网关地址
```
apicloud:
  client:
    gateway-host: localhost:8090
```
## 创建 ApiCloudClient
### 第一种方式：代码中指定 ak/sk
```
ApiCloudClient apiCloudClient = new ApiCloudClient(userInfo.getAccessKey(), userInfo.getSecretKey());
```
### 第二种方式：配置文件中指定 ak/sk

## 设置参数并得到响应
```
// 构造请求
SDKCommonReq sdkReq = new SDKCommonReq();
sdkReq.setPath(apiInterface.getHost() + apiInterface.getUrl());
sdkReq.setMethod(apiInterface.getMethod());
sdkReq.setRequestParams(req.getUserReqParams());
// 得到响应
SDKCommonResp sdkResp = apiService.request(apiCloudClient, sdkReq);
```
