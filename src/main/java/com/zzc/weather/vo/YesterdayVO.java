package com.zzc.weather.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * 昨日天气
 *
 * @author zzc
 * @create 2020-06-01 17:11
 */
@Data
public class YesterdayVO implements Serializable {
    private static final long serialVersionUID = -806309024676977591L;
    private String date;
    private String high;
    private String fx;
    private String low;
    private String fl;
    private String type;
}
