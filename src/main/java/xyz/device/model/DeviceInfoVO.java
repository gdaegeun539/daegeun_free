package xyz.device.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeviceInfoVO {
    public Integer id;
    public String name;
    public String category;
    public String company;
    public int price;
    public String spec;
    public String photo_name;
    public String photo_path;
    public Double rating_avg;
}
