package bupt.edu.jhc.apicloud_client_sdk.model.params;

import lombok.Data;

/**
 * @Description: 天气请求参数
 * @Author: <a href="https://github.com/JollyCorivuG">JollyCorivuG</a>
 * @CreateTime: 2023/10/18
 */
@Data
public class WeatherParams {
    private String ip;
    private String city;
    private String type;
}
