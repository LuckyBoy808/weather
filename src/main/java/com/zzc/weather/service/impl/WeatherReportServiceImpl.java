package com.zzc.weather.service.impl;

import com.zzc.weather.service.WeatherDataService;
import com.zzc.weather.service.WeatherReportService;
import com.zzc.weather.vo.WeatherResponseVO;
import com.zzc.weather.vo.WeatherVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zzc
 * @create 2020-06-01 16:09
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {

    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public WeatherVO getDataByCityId(String cityId) {
        WeatherResponseVO responseVO = weatherDataService.getDataByCityId(cityId);
        return responseVO.getData();
    }
}
