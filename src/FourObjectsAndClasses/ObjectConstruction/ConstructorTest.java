package FourObjectsAndClasses.ObjectConstruction;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 18:50
 * @Version 1.0
 */

class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("he",4000);
        staff[1] = new Employee(400);
        staff[2] = new Employee();

        // 遍历输出
        for(Employee e: staff){
            System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
        }
    }
}
