package cn.robustsoft.controller;

import cn.robustsoft.OrderService;
import cn.robustsoft.client.UserFeignClient;
import cn.robustsoft.dto.OrderDto;
import cn.robustsoft.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController implements OrderService {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/order/create")
    public String create() {
        UserDto user = userFeignClient.get(1);

        return "用户:"+user.getName()+"创建订单成功";
    }


    @Override
    public List<OrderDto> list(int userId) {
        OrderDto order = new OrderDto();
        order.setId(1);
        order.setUserId(1);
        order.setNo("100001");
        order.setCreateTime(LocalDateTime.now());

        List<OrderDto> list = new ArrayList<>();
        list.add(order);
        return list;
    }
}
