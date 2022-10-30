package FiveInherit.Reflect.ReflectionAnalysis;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 10:56
 * @Version 1.0
 */

public class ReflectionTest {
    public static void main(String[] args) {
        // 从命令行或用户输入读取类名
        String name;
        if(args.length>0){
            name = args[0];
        }else {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter class name(e.g java.util.Date):");
            name = in.next();
        }
        try{
            // 打印类名和super class
            Class cl = Class.forName(name);
            Class supercl = cl.getSuperclass();
            String modifies = Modifier.toString(cl.getModifiers());
            if(modifies.length()>0){
                System.out.println(modifies+"");
            }
            System.out.println("class "+name);
            if(supercl!=null&&supercl!=Object.class){
                System.out.println("extends"+supercl.getName());
            }
            System.out.println("\n{\n");
            printConstructors(cl);
            System.out.println();
            printMethods(cl);
            System.out.println();
            printFields(cl);
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
    // 打印一个类的所有构造器
    // 类
    public  static  void printConstructors(Class cl){
        Constructor[] constructors = cl.getDeclaredConstructors();
        for(Constructor c:constructors){
            String name = c.getName();
            System.out.println("  ");
            // 打印修饰符号 public 分析getModifiers
            String modifies = Modifier.toString(c.getModifiers());
            if(modifies.length()>0){
                System.out.println(modifies+"");
            }
            System.out.println(name+"(");
            // 打印参数类型
            Class[] paramTypes = c.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++){
                if(j>0){
                    System.out.print(", ");
                }
                System.out.println(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    // 打印所有方法一个类
    // 参数类
    public static void printMethods(Class cl){
        Method[] methods = cl.getDeclaredMethods();
        for(Method m:methods){
            Class reType = m.getReturnType();
            String name = m.getName();
            System.out.println(" ");
            // 打印modifies 返回类型和参数名称
            String modifiers = Modifier.toString(m.getModifiers());
            if(modifiers.length()>0){
                System.out.println(modifiers+" ");
            }
            System.out.println(reType.getName()+" "+name+"(");

            // 打印参数类型
            Class[] paramTypes = m.getParameterTypes();
            for(int j=0;j<paramTypes.length;j++){
                if(j>0){
                    System.out.println(", ");
                }
                System.out.println(paramTypes[j].getName());
            }
            System.out.println(");");
        }
    }
    // 打印所有的fields 一个类的
    // 参数一个类
    public  static  void printFields(Class cl){
        Field[]fields = cl.getDeclaredFields();
        for(Field f:fields){
            Class type = f.getType();
            String name = f.getName();
            System.out.println("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if(modifiers.length()>0){
                System.out.println(modifiers+" ");
            }
            System.out.println(type.getName()+" "+name+";");
        }
    }
}
