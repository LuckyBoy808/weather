package com.zzc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 天气信息
 *
 * @author zzc
 * @create 2020-05-30 17:14
 */
@Data
public class WeatherResponseVO implements Serializable {
    private static final long serialVersionUID = -8483256225271502962L;
    private WeatherVO data;
    private Integer status;
    private String desc;
}