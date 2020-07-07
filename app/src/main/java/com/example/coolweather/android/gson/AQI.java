package com.example.coolweather.android.gson;

/**
 * Created by 黄俊汕 on 2020/7/7.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;

        public String pm25;
    }
}
