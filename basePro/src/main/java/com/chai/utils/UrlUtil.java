package com.chai.utils;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class UrlUtil {
    /**
     * 获取请求完整url
     */
    public static String getRequestUrl(HttpServletRequest request) {
        StringBuffer baseUrlBuffer = request.getRequestURL();
        Map<String, String[]> requestParams = request.getParameterMap();
        if (requestParams.size() > 0) {
            baseUrlBuffer.append("?");
            for (String key : requestParams.keySet()) {
                String[] values = requestParams.get(key);
                for (String value : values) {
                    baseUrlBuffer.append(key);
                    baseUrlBuffer.append("=");
                    baseUrlBuffer.append(value);
                }
                baseUrlBuffer.append("&");
            }
        }
        if(baseUrlBuffer.lastIndexOf("&")>-1){
            baseUrlBuffer.deleteCharAt(baseUrlBuffer.lastIndexOf("&"));
        }
        return baseUrlBuffer.toString();
    }

}
