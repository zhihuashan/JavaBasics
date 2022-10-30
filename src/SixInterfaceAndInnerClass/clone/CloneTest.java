package SixInterfaceAndInnerClass.clone;

import java.util.Date;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 22:31
 * @Version 1.0
 * 浅拷贝怎么做
 */

public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee("john",500);
            original.setHireDay(new Date(2000,1,1));
            Employee copy = (Employee) original.clone();
            copy.raiseSalary(10);
            copy.setHireDay(new Date(2002,12,31));
            System.out.println("original="+original);
            System.out.println("copy="+copy);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
