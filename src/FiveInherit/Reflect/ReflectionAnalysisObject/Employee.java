package FiveInherit.Reflect.ReflectionAnalysisObject;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 12:57
 * @Version 1.0
 */

public class Employee {
    private  String name;
    private  Integer a;
    private  Integer b;
    private  Integer c;
    private  Integer d;

    public Employee() {
    }

    public Employee(String name, Integer a, Integer b, Integer c, Integer d) {
        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
