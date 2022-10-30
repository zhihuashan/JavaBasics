package TenUsingAnnotations.Reflect;

import java.lang.reflect.Method;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/9 10:26
 * @Version 1.0
 */

public class ReflectProcessor {
    public void paresMethod(final Class<?> clazz) throws Exception{
        final Object obj = clazz.getConstructor(new Class[] {}).newInstance(new Object[]{});
        final Method[] methods = clazz.getDeclaredMethods();
        for(final Method method:methods){
            final  Reflect my = method.getAnnotation(Reflect.class);
            if(null != my){
                method.invoke(obj,my.name());
            }
        }
    }
}
