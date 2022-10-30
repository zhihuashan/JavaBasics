package FourObjectsAndClasses.StaticVariablesAndStaticMethods;

import java.util.Objects;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 14:52
 * @Version 1.0
 */

public class Employee {
//    静态变量只属于该类,而不是类变量
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }
    // 静态方法,只能使用本类的静态变量且不能使用this.调用类内信息.
    // 只有使用类名.进行调用
    public static int getNextId() {
        return nextId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = nextId;
        nextId++;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
    // 这个静态方法不需要调用,直接使用,对类进行单元测试
    public static void main(String[] args) {
        Employee e = new Employee("ha",50000);
        System.out.println(e.getName()+" "+e.getSalary());
        System.out.println(e);
    }
}
