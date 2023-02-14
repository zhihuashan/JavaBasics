package Exception.ExceptionTraceStack;

import Exception.CustomException.MyException;

import java.io.Closeable;
import java.io.IOException;
import java.util.*;

/**
 * @Author: shanzhihua
 * @Date: 2023/2/11 21:07
 * @Version 1.0
 */

public class SelfException extends RuntimeException implements Closeable {
    public SelfException() {
    }

    public SelfException(String message) {
        super(message);
    }

    @Override
    public void close() throws IllegalFormatException {
         HashSet<MyException> ab = new HashSet<MyException>();
         TreeSet<MyException> bd = new TreeSet<MyException>();
         ab.forEach(obj->{System.out.println(obj);});
         new HashMap<>();
        Collection objs = new HashSet();
        objs.add("C语言中文网Java教程");
        objs.add("C语言中文网C语言教程");
        objs.add("C语言中文网C++教程");
        String str = "Hello";
// 2. 通过对象的getClass()方法
        Class clz1 = String.class;
        Class clz2 = str.getClass();
        // 获取objs集合对应的迭代器
        Iterator it = objs.iterator();
        new ArrayList<>();
        objs.removeIf(ele -> ((String) ele).length() < 12);
        // 使用Lambda表达式（目标类型是Comsumer）来遍历集合元素
        it.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));
    }
}
