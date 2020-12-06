package com.gotkx.beanMap;

import com.gotkx.pojo.Role;
import com.gotkx.pojo.User;
import com.gotkx.reflect.BeanMapUtilByReflect;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanMapUtilConvert {
    public static void main(String[] args) {
        User user = new User();
        Map beanToMap = null;

        Map<String, Object> map = new HashMap<>();
        map.put("userId","123");
        map.put("userName","黄凯");
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role("1", "技术经理"));
        roleList.add(new Role("2", "信息主任"));
        map.put("roleList",roleList);

        try {
            // map 转对象
            user = BeanMapUtilByCglib.mapToBean(map, User.class);
            beanToMap = BeanMapUtilByCglib.beanToMap(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 打印对象
        System.out.println(user);
        // 对象又重新转map
        System.out.println(beanToMap);
    }

}
