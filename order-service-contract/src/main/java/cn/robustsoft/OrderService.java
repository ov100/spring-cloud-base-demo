package cn.robustsoft;

import cn.robustsoft.dto.OrderDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author : gb 2019/7/24
 */
public interface OrderService {

    @GetMapping("/order/list")
    List<OrderDto> list(@RequestParam(value = "userId") int userId);
}
