package xyz.device.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Data
public class ReviewVO {
    public Integer id;
    public Integer dev_id;
    public String uname;
    public String content;
    public Integer rating;
    public LocalDateTime reg_date;
}
