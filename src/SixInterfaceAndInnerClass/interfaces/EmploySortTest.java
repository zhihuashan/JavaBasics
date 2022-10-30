package SixInterfaceAndInnerClass.interfaces;


import java.util.Arrays;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 21:26
 * @Version 1.0
 */

class EmploySortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("he",4000);
        staff[1] = new Employee("hei",400);
        staff[2] = new Employee("hew",800);
        Arrays.sort(staff);
        for(Employee e:staff){
            System.out.println(e);
        }
    }
}
