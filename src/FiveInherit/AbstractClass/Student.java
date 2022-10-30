package FiveInherit.AbstractClass;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/1 14:48
 * @Version 1.0
 */

public class Student extends Person{
    private String major;

    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "a student majoring in" + major;
    }
}
