package com.coolweather.android.gson;

/**
 * Created by Jasper on 2017/3/29.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
