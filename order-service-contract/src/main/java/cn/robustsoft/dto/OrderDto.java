package cn.robustsoft.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author : gb 2019/7/24
 */
@Data
public class OrderDto {
    private int id;
    private int userId;
    private String no;
    private LocalDateTime createTime;
}
