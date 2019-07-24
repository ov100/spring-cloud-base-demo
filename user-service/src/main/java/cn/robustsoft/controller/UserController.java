package cn.robustsoft.controller;

import cn.robustsoft.UserService;
import cn.robustsoft.client.OrderFeignClient;
import cn.robustsoft.dto.OrderDto;
import cn.robustsoft.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UserController implements UserService {
    private static List<UserDto> users = new ArrayList<>();

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Override
    public UserDto get(int userId) {
        return users.get(userId-1);
    }

    @GetMapping("/user/orders")
    public List<OrderDto> orders(int userId){
        return orderFeignClient.list(userId);
    }

    static{
        for (int i = 0; i < 5; i++) {
            UserDto user = new UserDto();
            user.setId(i+1);
            user.setName("test"+user.getId());
            users.add(user);
        }
    }
}
