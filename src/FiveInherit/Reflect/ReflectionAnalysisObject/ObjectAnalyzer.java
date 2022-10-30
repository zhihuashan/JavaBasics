package FiveInherit.Reflect.ReflectionAnalysisObject;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 15:03
 * @Version 1.0
 */
// 获取所有的变量,并设置变量是可以访问的,获取变量的名和值
public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();
    //将类对象内变量转化成string表示
    public String toString(Object obj){
        if(obj ==null){
            return "null";
        }
        if(visited.contains(obj)){
            return "...";
        }
        visited.add(obj);
        Class cl = obj.getClass();
        if(cl ==String.class){
            return (String) obj;
        }
        if(cl.isArray()){
            String r = cl.getComponentType()+"[]{";
            for(int i=0;i< Array.getLength(obj);i++){
                if(i>0){
                    r+=",";
                }
                // 获取变量的值
                Object val= Array.get(obj,i);
                if(cl.getComponentType().isPrimitive()){
                    r+=val;
                }else {
                    r+=toString(val);
                }
            }
            return r+"}";
        }
        String r = cl.getName();
        // 检查类和super类的变量
        do{
            r +="[";
            Field[] fields = cl.getDeclaredFields();
            // 设置变量是否可以访问
            AccessibleObject.setAccessible(fields,true);
            // 获取所有变量的值
            for(Field f:fields){
                if(!Modifier.isStatic(f.getModifiers())){
                    if(!r.endsWith("[")){
                        r+=",";
                    }
                    r+=f.getName()+"=";
                    try {
                        Class t = f.getType();
                        Object val =f.get(obj);
                        if(t.isPrimitive()){
                            r+=val;
                        }else {
                            r+=toString(val);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r+="]";
            cl = cl.getSuperclass();
        }while (cl!=null);
        return r;
    }
    public String toString(){
        return new ObjectAnalyzer().toString(this);
    }
}
