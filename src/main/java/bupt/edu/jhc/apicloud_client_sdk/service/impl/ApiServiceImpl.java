package bupt.edu.jhc.apicloud_client_sdk.service.impl;

import bupt.edu.jhc.apicloud_client_sdk.client.ApiCloudClient;
import bupt.edu.jhc.apicloud_client_sdk.common.exception.SDKException;
import bupt.edu.jhc.apicloud_client_sdk.model.req.PoisonousChickenSoupReq;
import bupt.edu.jhc.apicloud_client_sdk.model.req.WeatherReq;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.PoisonousChickenSoupResp;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.WeatherResp;
import bupt.edu.jhc.apicloud_client_sdk.service.BaseService;

/**
 * @Description: api 服务实现类
 * @Author: <a href="https://github.com/JollyCorivuG">JollyCorivuG</a>
 * @CreateTime: 2023/10/11
 */
public class ApiServiceImpl extends BaseService {
    @Override
    public PoisonousChickenSoupResp getPoisonousChickenSoup() throws SDKException {
        PoisonousChickenSoupReq req = new PoisonousChickenSoupReq();
        return super.request(req);
    }

    @Override
    public PoisonousChickenSoupResp getPoisonousChickenSoup(ApiCloudClient apiCloudClient) throws SDKException {
        PoisonousChickenSoupReq req = new PoisonousChickenSoupReq();
        return super.request(apiCloudClient, req);
    }

    @Override
    public WeatherResp getWeatherInfo(ApiCloudClient apiCloudClient, WeatherReq req) throws SDKException {
        return super.request(apiCloudClient, req);
    }

    @Override
    public WeatherResp getWeatherInfo(WeatherReq req) throws SDKException {
        return super.request(req);
    }
}
