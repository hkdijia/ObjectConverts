package com.gotkx.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

/**
 * FastJSON 进行转换
 * @author HuangKai
 */
public class BeanMapUtilByFastJson {

    /**
     * 对象转Map
     * @param object
     * @return
     */
    public static Map beanToMap(Object object){
        return JSONObject.parseObject(JSON.toJSONString(object),Map.class);
    }

    /**
     * map转对象
     * @param map
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T mapToBean(Map map, Class<T> beanClass){
        return JSONObject.parseObject(JSON.toJSONString(map),beanClass);
    }

}
