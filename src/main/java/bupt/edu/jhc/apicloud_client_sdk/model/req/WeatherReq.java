package bupt.edu.jhc.apicloud_client_sdk.model.req;

import bupt.edu.jhc.apicloud_client_sdk.common.domain.enums.ReqMethodEnum;
import bupt.edu.jhc.apicloud_client_sdk.model.params.WeatherParams;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.WeatherResp;

/**
 * @Description: 天气请求
 * @Author: <a href="https://github.com/JollyCorivuG">JollyCorivuG</a>
 * @CreateTime: 2023/10/18
 */
public class WeatherReq extends BaseReq<WeatherParams, WeatherResp> {
    @Override
    public String getMethod() {
        return ReqMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return "localhost:8082/api/weather";
    }

    @Override
    public Class<WeatherResp> getResponseClass() {
        return WeatherResp.class;
    }
}
