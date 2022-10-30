package FiveInherit.AbstractClass;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/1 14:42
 * @Version 1.0
 */

public class Employee extends Person{
    private double salary;
    private Date  hireDay;

    public Employee(String name, double salary, int year,int month,int day) {
        super(name);
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year,month-1,day);
        hireDay = calendar.getTime();
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    @Override
    public String getDescription() {
        return String.format("an example with a salary of $%.2f",salary);
    }

    private void raiseSalary(double byPercent){
        double raise = salary*byPercent/100;
        salary +=raise;
    }
}
