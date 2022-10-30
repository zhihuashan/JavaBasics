package TwelveGenericProgramming.DefineSimpleGenericClasses;

import java.io.Serializable;
import java.util.Comparator;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 13:20
 * @Version 1.0
 */
// 泛型方法
public class Interval<T extends Comparable & Serializable> implements Serializable{
    private T lower;
    private T upper;

    public Interval(T first, T second) {
        if(first.compareTo(second)<=0){
            lower = first;
            upper = second;
        }else {
            upper = first;
            lower = second;
        }
    }
}
