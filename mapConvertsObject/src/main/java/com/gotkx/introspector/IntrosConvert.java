package com.gotkx.introspector;

import com.alibaba.fastjson.JSON;
import com.gotkx.introspector.pojo.Role;
import com.gotkx.introspector.pojo.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntrosConvert {

    public static void main(String[] args) {
        User user = new User();
        HashMap<Object, Object> map = new HashMap<>();
        map.put("userId","123");
        map.put("userName","黄凯");

        List<Role> roleList = new ArrayList<>();
        roleList.add(new Role("1", "技术经理"));
        roleList.add(new Role("2", "信息主任"));
        map.put("roleList",roleList);
        try {
            user = BeanMapUtilByIntros.mapToBean(map, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSONString(user));
    }

}
