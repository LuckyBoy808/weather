package com.zzc.weather.controller;

import com.zzc.weather.service.WeatherDataService;
import com.zzc.weather.vo.WeatherResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zzc
 * @create 2020-05-31 10:16
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    private WeatherDataService weatherDataService;

    @GetMapping("/cityId/{cityId}")
    public WeatherResponseVO getWeatherByCityId(@PathVariable("cityId") String cityId) {
        return weatherDataService.getDataByCityId(cityId);
    }

    @GetMapping("/cityName/{cityName}")
    public WeatherResponseVO getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return weatherDataService.getDataByCityName(cityName);
    }
}