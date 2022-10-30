package FourObjectsAndClasses.ObjectConstruction;

import java.util.Random;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 18:51
 * @Version 1.0
 */

class Employee {
    private static int nextId;

    private int id;
    private String name = "";
    private double Salary;
    //静态初始化 只会执行一次
    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    // 对象初始化 每次创建该对象是会执行一次
    {
        id = nextId;
        nextId++;
    }

    public Employee(String name, double salary) {
        this.name = name;
        Salary = salary;
    }

    public Employee(double salary) {
        Salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }
}
