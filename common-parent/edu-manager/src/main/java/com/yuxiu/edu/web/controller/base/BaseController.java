package com.yuxiu.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public  abstract class BaseController<T> {

    public static String MANAGER_PAGE; // 管理页面
    public static String INFO_PAGE;  // 列表页面
    public static String EDIT_PAGE; // 编辑页面

    public BaseController(){

        try {
            // 获取泛型的真实类型
            ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
            Type[] types = pt.getActualTypeArguments();
            //2.把type类型赋值给Class类型
            Class<T> clz = (Class<T>) types[0];
            //3.定义页面的静态变量
            String modelName = clz.getSimpleName().toLowerCase();
            EDIT_PAGE = modelName + "/edit";
            INFO_PAGE = modelName + "/info";
            MANAGER_PAGE = modelName + "/manage";
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
