package SixInterfaceAndInnerClass.interfaces;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 21:26
 * @Version 1.0
 * 为arrays。sort对对象进行排序 实现接口Comparable接口使用泛型Comparable<T>>
 *     实现compareTo方法
 */

class Employee implements Comparable<Employee>{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary +=raise;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return Double.compare(salary,o.salary);
    }
}
