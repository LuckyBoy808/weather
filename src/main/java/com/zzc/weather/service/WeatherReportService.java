package com.zzc.weather.service;

import com.zzc.weather.vo.WeatherVO;

/**
 * @author zzc
 * @create 2020-06-01 16:08
 */
public interface WeatherReportService {
    /**
     * 根据城市ID查询天气信息
     *
     * @param cityId
     * @return
     */
    WeatherVO getDataByCityId(String cityId);
}
