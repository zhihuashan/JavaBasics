package FiveInherit.AbstractClass;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/1 14:39
 * @Version 1.0
 * 抽象类
 */

public abstract class Person {
    public  abstract  String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
