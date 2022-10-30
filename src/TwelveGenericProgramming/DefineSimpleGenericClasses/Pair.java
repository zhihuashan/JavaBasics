package TwelveGenericProgramming.DefineSimpleGenericClasses;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 9:50
 * @Version 1.0
 */

// 泛型类：可以根据输入的类型进行调整返回类型或局部变量类型
public class Pair<T>{
    private T first;
    private T second;
    public Pair(){
        this.first = null;
        this.second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
