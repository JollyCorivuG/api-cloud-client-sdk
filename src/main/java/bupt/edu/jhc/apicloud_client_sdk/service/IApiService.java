package bupt.edu.jhc.apicloud_client_sdk.service;

import bupt.edu.jhc.apicloud_client_sdk.client.ApiCloudClient;
import bupt.edu.jhc.apicloud_client_sdk.common.domain.resp.SDKCommonResp;
import bupt.edu.jhc.apicloud_client_sdk.common.exception.SDKException;
import bupt.edu.jhc.apicloud_client_sdk.model.req.BaseReq;
import bupt.edu.jhc.apicloud_client_sdk.model.req.WeatherReq;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.PoisonousChickenSoupResp;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.WeatherResp;

/**
 * @Description: api 服务接口
 * @Author: <a href="https://github.com/JollyCorivuG">JollyCorivuG</a>
 * @CreateTime: 2023/10/11
 */
public interface IApiService {
    /**
     * 通用请求
     * @param req
     * @return
     * @param <O>
     * @param <T>
     * @throws SDKException
     */
    <O, T extends SDKCommonResp> T request(BaseReq<O, T> req) throws SDKException;

    /**
     * 通用请求
     * @param apiCloudClient
     * @param req
     * @return
     * @param <O>
     * @param <T>
     * @throws SDKException
     */
    <O, T extends SDKCommonResp> T request(ApiCloudClient apiCloudClient, BaseReq<O, T> req) throws SDKException;

    /**
     * 随机毒鸡汤
     * @return
     * @throws SDKException
     */
    PoisonousChickenSoupResp getPoisonousChickenSoup() throws SDKException;

    /**
     * 随机毒鸡汤
     * @param apiCloudClient
     * @return
     * @throws SDKException
     */
    PoisonousChickenSoupResp getPoisonousChickenSoup(ApiCloudClient apiCloudClient) throws SDKException;

    /**
     * 天气信息
     * @param apiCloudClient
     * @param req
     * @return
     * @throws SDKException
     */
    WeatherResp getWeatherInfo(ApiCloudClient apiCloudClient, WeatherReq req) throws SDKException;

    /**
     * 天气信息
     * @param req
     * @return
     * @throws SDKException
     */
    WeatherResp getWeatherInfo(WeatherReq req) throws SDKException;
}
