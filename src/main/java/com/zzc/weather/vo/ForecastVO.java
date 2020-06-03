package com.zzc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 预报天气信息
 *
 * @author zzc
 * @create 2020-05-30 20:27
 */
@Data
public class ForecastVO implements Serializable {
    private static final long serialVersionUID = 1686655601208573654L;
    private String date;
    private String high;
    private String fengli;
    private String low;
    private String fengxiang;
    private String type;
}
