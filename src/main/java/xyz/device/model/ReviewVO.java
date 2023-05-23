package xyz.device.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReviewVO {
    private Integer id;
    private Integer dev_id;
    private String uname;
    private String content;
    private String pwd;
    private Integer rating;
    private LocalDateTime reg_date;
}
