package cn.robustsoft.client;

import cn.robustsoft.UserService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author : gb 2019/7/24
 */
@FeignClient("user-service")
public interface UserFeignClient extends UserService {
}
