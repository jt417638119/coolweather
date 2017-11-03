package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HJT on 2017/11/2.
 */

public class Forecast {
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
