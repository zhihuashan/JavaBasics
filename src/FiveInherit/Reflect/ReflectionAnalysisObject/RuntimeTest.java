package FiveInherit.Reflect.ReflectionAnalysisObject;


import org.testng.annotations.Test;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 12:59
 * @Version 1.0
 */

public class RuntimeTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Employee harry = new Employee("Harry Hacker",35000,10,1,1989);
        Class cl = harry.getClass();

        Field f = cl.getDeclaredField("name");
        // 由于name是私有的变量
        // field 是所有数据域
        // 没有权限只能查看对象有那些域，而不能读取值
        // 通过setAccessible()设置变量是否可以访问
//        AccessibleObject.setAccessible(f,true);
        // 设置为可以读取的
        f.setAccessible(true);
        System.out.println(cl.getName());
        Object v = f.get(harry);

    }
    @Test
    public void testObjectAnalyzer(){
        ArrayList<Integer> squares = new ArrayList<>();
        for(int i=1;i<=5;i++){
            squares.add(i*i);
        }
        ObjectAnalyzer a= new ObjectAnalyzer();
        System.out.println(a.toString(squares));
    }
}
