package com.leo.coolweather.util;

/**
 * Created by ThinkPad on 2016/4/3.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
