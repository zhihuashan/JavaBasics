package FourObjectsAndClasses.StaticVariablesAndStaticMethods;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/30 9:48
 * @Version 1.0
 */

public class Manager extends Employee{
    private double bonus;
    private int years;

    public Manager(String name, double salary, int id,int  years, double bonus) {
        super(name, salary, id);
        this.years = years;
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
