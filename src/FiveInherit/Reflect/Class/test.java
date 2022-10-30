package FiveInherit.Reflect.Class;

import java.util.Date;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 10:04
 * @Version 1.0
 */

public class test {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        //3种获取类对象的方法
        temp temp = new temp();
        System.out.println(temp.getClass().getName());
        String className = "java.util.Date";
        System.out.println(Class.forName(className));
        System.out.println(Date.class);
        // 虚拟机为每个类型管理了一个class对象
        // 比较两个类对象是否相同
        if(temp.getClass()== FiveInherit.Reflect.Class.temp.class)
        // 根据类对象,快速创建类对象实例 使用无参构造函数
        temp.getClass().newInstance();
        Class.forName(className).newInstance();
    }
}
