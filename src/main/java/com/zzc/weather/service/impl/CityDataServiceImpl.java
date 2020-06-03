package com.zzc.weather.service.impl;

import com.zzc.weather.entity.City;
import com.zzc.weather.entity.CityList;
import com.zzc.weather.service.CityDataService;
import com.zzc.weather.util.XmlBuilderUtil;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * @author zzc
 * @create 2020-06-01 15:12
 */
@Service
public class CityDataServiceImpl implements CityDataService {
    @Override
    public List<City> listCity() throws Exception {
        // 读取XML文件
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader in = new BufferedReader(new InputStreamReader(resource.getInputStream(), "utf-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while (null != (line = in.readLine())) {
            buffer.append(line);
        }
        in.close();
        // XML转换为对象
        CityList cityList = (CityList)XmlBuilderUtil.xmlStrToObject(buffer.toString(), CityList.class);
        return cityList.getCityList();
    }
}
