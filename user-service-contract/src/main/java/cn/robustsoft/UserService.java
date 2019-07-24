package cn.robustsoft;

import cn.robustsoft.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
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

}
