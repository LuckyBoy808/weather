package com.zzc.weather.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 天气信息
 *
 * @author zzc
 * @create 2020-06-01 17:05
 */
@Data
public class WeatherVO implements Serializable {
    private static final long serialVersionUID = 4089597935549696545L;
    private String city;
    private String ganmao;
    private String wendu;
    private YesterdayVO yesterday;
    private List<ForecastVO> forecast;
}
