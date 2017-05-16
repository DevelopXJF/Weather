package com.example.devil.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Devil on 2017/5/15.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}
