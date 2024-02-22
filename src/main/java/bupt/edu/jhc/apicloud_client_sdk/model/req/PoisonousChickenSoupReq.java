package bupt.edu.jhc.apicloud_client_sdk.model.req;

import bupt.edu.jhc.apicloud_client_sdk.common.domain.enums.ReqMethodEnum;
import bupt.edu.jhc.apicloud_client_sdk.model.params.PoisonousChickenSoupParams;
import bupt.edu.jhc.apicloud_client_sdk.model.resp.PoisonousChickenSoupResp;

/**
 * @Description: 毒鸡汤请求
 * @Author: <a href="https://github.com/JollyCorivuG">JollyCorivuG</a>
 * @CreateTime: 2023/10/12
 */
public class PoisonousChickenSoupReq extends BaseReq<PoisonousChickenSoupParams, PoisonousChickenSoupResp> {
    @Override
    public String getMethod() {
        return ReqMethodEnum.GET.getValue();
    }

    @Override
    public String getPath() {
        return "localhost:8082/api/poisonousChickenSoup";
    }

    @Override
    public Class<PoisonousChickenSoupResp> getResponseClass() {
        return PoisonousChickenSoupResp.class;
    }
}
