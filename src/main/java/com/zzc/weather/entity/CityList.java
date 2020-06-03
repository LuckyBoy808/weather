package com.zzc.weather.entity;

import lombok.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author zzc
 * @create 2020-06-01 15:02
 */
@Data
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {
    @XmlElement(name = "d")
    private List<City> cityList;
}
