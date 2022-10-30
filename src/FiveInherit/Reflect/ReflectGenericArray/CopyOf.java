package FiveInherit.Reflect.ReflectGenericArray;

import java.lang.reflect.Array;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 16:20
 * @Version 1.0
 */

public class CopyOf {
    // 使用反射编写泛型数组
    public static   Object goodCopyOf(Object a,int newLength){
        Class cl= a.getClass();
        if(!cl.isArray()){
            return null;
        }
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }

    public static Object[] badCopyOf(Object[] a,int newLength){
        Object[] newArray = new Object[newLength];
        System.arraycopy(a,0,newArray,0,Math.min(a.length,newLength));
        return  newArray;
    }
}
