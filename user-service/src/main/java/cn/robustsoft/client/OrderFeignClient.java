package cn.robustsoft.client;

import cn.robustsoft.OrderService;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author : gb 2019/7/24
 */
@FeignClient("order-service")
public interface OrderFeignClient extends OrderService {
}
