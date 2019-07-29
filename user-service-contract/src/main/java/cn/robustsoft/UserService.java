package cn.robustsoft;

import cn.robustsoft.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : gb 2019/7/24
 */
public interface UserService {

    /**
     * 获取用户
     * @param userId 用户id
     * @return
     */
    @GetMapping("/user/get")
    UserDto get(@RequestParam(value = "userId") int userId);

    /*
    // 会出现问题
    // 指定为GET请求
    @RequestMapping(value="/user/testGet",method = RequestMethod.GET)
    public UserDto testGetUser(UserDto user);

    // 替代方案
    @RequestMapping(value="/user/testGet",method = RequestMethod.GET)
    public UserDto testGetUser2(@RequestParam("id")Integer id,
                             @RequestParam("name")String name,
                             @RequestParam("age")Integer age,
                             @RequestParam("address")String address,
                             @RequestParam("phone")String phone);
*/
}
