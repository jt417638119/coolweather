package com.coolweather.android.gson;

/**
 * Created by HJT on 2017/11/2.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
