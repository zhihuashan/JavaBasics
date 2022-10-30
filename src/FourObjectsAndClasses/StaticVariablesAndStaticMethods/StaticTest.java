package FourObjectsAndClasses.StaticVariablesAndStaticMethods;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 14:51
 * @Version 1.0
 */
//静态方法和静态变量
public class StaticTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom",4000);
        staff[1] = new Employee("Hom",5000);
        staff[2] = new Employee("Lom",6000);
        for(Employee e:staff){
            e.setId();
            System.out.println("name:"+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
        int n = Employee.getNextId();
        System.out.println("next available id="+n);

    }
}
