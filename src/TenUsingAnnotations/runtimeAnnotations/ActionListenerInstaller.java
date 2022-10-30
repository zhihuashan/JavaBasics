package TenUsingAnnotations.runtimeAnnotations;

import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/29 18:30
 * @Version 1.0
 */

public class ActionListenerInstaller {
    // 对给定对象添加所有的actionListener
    // 枚举出某个对象接收的所有的方法。对于每个方法,先获取ActionListenerFor注解对象，然后对它进行处理。
    public static void processAnnotations(Object obj){
        try{
            Class<?> cl = obj.getClass();
            for(Method m :cl.getDeclaredMethods()){
                ActionListenerFor a= m.getAnnotation(ActionListenerFor.class);
                if(a !=null){
                    // 获取注解的类的变量
                    Field f = cl.getDeclaredField(a.source());
                    // 打开权限
                    f.setAccessible(true);
                    addListener(f.get(obj),obj,m);
                }
            }
        }catch (ReflectiveOperationException e){
            e.printStackTrace();
        }
    }

    public static void addListener(Object source,final Object param,final Method method)throws  ReflectiveOperationException{
        // 通过method 添加行为listener
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(param);
            }
        };
        Object listener = Proxy.newProxyInstance(null,new Class[]{java.awt.event.ActionListener.class},handler);
        Method adder = source.getClass().getMethod("addActionListener", ActionListener.class);
        adder.invoke(source,listener);
    }

}
