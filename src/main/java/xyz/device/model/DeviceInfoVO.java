package xyz.device.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeviceInfoVO {
    private Integer id;
    private String name;
    private String category;
    private String company;
    private int price;
    private String spec;
    private String photo_name;
    private String photo_path;
    private Double rating_avg;
}
