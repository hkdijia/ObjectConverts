package com.gotkx.beanUtils;

import java.util.Map;

/**
 * Apache 中的 BeanUtils 实现
 * @author HuangKai
 */
public class BeanMapUtilByApache {

    /**
     * 对象转Map
     * @param object
     * @return
     */
    public static Map beanToMap(Object object){
        return new org.apache.commons.beanutils.BeanMap(object);
    }

    /**
     * map转对象
     * @param map
     * @param beanClass
     * @param <T>
     * @return
     */
    public static <T> T mapToBean(Map map, Class<T> beanClass) throws Exception {
        T object = beanClass.newInstance();
        org.apache.commons.beanutils.BeanUtils.populate(object, map);
        return object;
    }

}
