package FiveInherit.AbstractClass.TypeConversion;

/**
 * @Author: shanzhihua
 * @Date: 2023/2/11 10:23
 * @Version 1.0
 */

public class Animal {
    public String name = "Animal：动物";
    public static String staticName = "Animal：可爱的动物";

    public Animal() {
    }

    public void eat() {
        System.out.println("Animal: 吃饭");
    }

    public static void staticEat() {
        System.out.println("Animal: 动物在吃饭");
    }
}
