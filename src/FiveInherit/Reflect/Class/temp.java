package FiveInherit.Reflect.Class;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 10:04
 * @Version 1.0
 */

public class temp {
    private int a;

    public temp() {
    }

    public temp(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "temp{" +
                "a=" + a +
                '}';
    }
}
