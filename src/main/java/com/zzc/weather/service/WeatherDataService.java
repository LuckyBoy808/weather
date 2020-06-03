package com.zzc.weather.service;

import com.zzc.weather.vo.WeatherResponseVO;

/**
 * @author zzc
 * @create 2020-05-30 20:42
 */
public interface WeatherDataService {
    /**
     * 根据城市id查询天气数据
     *
     * @param cityId
     * @return
     */
    WeatherResponseVO getDataByCityId(String cityId);

    /**
     * 根据城市名称查询天气数据
     *
     * @param cityName
     * @return
     */
    WeatherResponseVO getDataByCityName(String cityName);

    /**
     * 根据城市id来同步天气
     *
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
