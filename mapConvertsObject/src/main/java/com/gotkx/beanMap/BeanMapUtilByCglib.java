package com.gotkx.beanMap;

import net.sf.cglib.beans.BeanMap;

import java.util.HashMap;
import java.util.Map;

/**
 * cglib 中的 BeanMap 实现
 * @author HuangKai
 */
public class BeanMapUtilByCglib {

    /**
     * 对象转Map
     * @param object
     * @return
     */
    public static Map beanToMap(Object object){
        Map<String, Object> map = new HashMap<String, Object>();
        if (object != null) {
            BeanMap beanMap = BeanMap.create(object);
            for (Object key : beanMap.keySet()) {
                map.put(key+"", beanMap.get(key));
            }
        }
        return map;
    }

    /**
     * map转对象
     * @param map
     * @param beanClass
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T mapToBean(Map map, Class<T> beanClass) throws Exception {
        T bean = beanClass.newInstance();
        BeanMap beanMap = BeanMap.create(bean);
        beanMap.putAll(map);
        return bean;
    }

}
