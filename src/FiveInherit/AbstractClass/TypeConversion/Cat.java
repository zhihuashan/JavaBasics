package FiveInherit.AbstractClass.TypeConversion;

/**
 * @Author: shanzhihua
 * @Date: 2023/2/11 10:26
 * @Version 1.0
 */
// 继承
public class Cat extends Animal{
    public String name = "Cat: 猫";
    public String str = "Cat: 可爱的小猫";
    public static String staticName = "Dog：我是喵星人";

    // 重写
    @Override
    public void eat() {
        System.out.println("Cat：吃饭");
    }
    public static void staticEat() {
        System.out.println("Cat：猫在吃饭");
    }
    public void eatMethod() {
        System.out.println("Cat：猫喜欢吃鱼");
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        Cat cat = (Cat) animal; // 向下转型
        System.out.println(animal.name); // 输出Animal类的name变量
        System.out.println(animal.staticName); // 输出Animal类的staticName变量
        animal.eat(); // 输出Cat类的eat()方法
        animal.staticEat();  // 输出Animal类的staticEat()方法
        System.out.println(cat.str); // 调用Cat类的str变量
        cat.eatMethod(); // 调用Cat类的eatMethod()方法
    }

    //  动态绑定  实例方法与引用变量实际引用的对象的方法进行绑定.animal.eat();
    // 静态绑定  静态方法与引用变量所声明的类型的方法绑定  编译阶段已经做了绑定.animal.staticEat() 是将 staticEat() 方法与 Animal 类进行绑定
    // http://c.biancheng.net/view/6503.html
    // 静态绑定  成员变量（包括静态变量和实例变量）与引用变量所声明的类型的成员变量绑定。  animal.name 和 animal.staticName 都是与 Animal 类进行绑定。


}
