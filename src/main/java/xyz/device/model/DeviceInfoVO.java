package xyz.device.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
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
}
