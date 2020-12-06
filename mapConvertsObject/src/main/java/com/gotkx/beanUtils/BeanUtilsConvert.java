package com.gotkx.beanUtils;

import com.gotkx.pojo.Role;
import com.gotkx.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanUtilsConvert {

    public static void main(String[] args) {
        User user = new User();

        Map<String, Object> map = new HashMap<>();
        map.put("userId","123");
        map.put("userName","黄凯");
        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role("1", "技术经理"));
        roleList.add(new Role("2", "信息主任"));
        map.put("roleList",roleList);

        try {
            // map 转对象
            user = BeanMapUtilByApache.mapToBean(map, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 打印对象
        System.out.println(user);
        // 对象又重新转map
        System.out.println(BeanMapUtilByApache.beanToMap(user));
    }

}
