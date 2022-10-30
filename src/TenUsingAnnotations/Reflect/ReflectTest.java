package TenUsingAnnotations.Reflect;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/9 10:30
 * @Version 1.0
 */

public class ReflectTest {
    @Reflect
    public static  void sayHello(final String name){
        System.out.println("==>Hi, "+ name +"[sayHello]");
    }
    @Reflect
    public static void sayHelloToSomeone(final String name){
        System.out.println("==>Hi, "+ name + "[sayHelloToSomeOne]");
    }

    public static void main(String[] args) throws Exception {
        final  ReflectProcessor reflectProcessor = new ReflectProcessor();
        reflectProcessor.paresMethod(ReflectTest.class);
    }
}
