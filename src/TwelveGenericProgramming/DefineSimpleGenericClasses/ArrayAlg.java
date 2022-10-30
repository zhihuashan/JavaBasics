package TwelveGenericProgramming.DefineSimpleGenericClasses;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 9:59
 * @Version 1.0
 */

public class ArrayAlg {
    // 获取最大最小值
    // 泛型限定
    // 限定T只能是实现了Comparable接口的类
    public static  <T extends Comparable> Pair<T> minmax(T[] a){
        if(a==null ||a.length == 0){
            return null;
        }
        T min = a[0];
        T max = a[0];
        for(int i=1;i<a.length;i++){
            if(min.compareTo(a[i])>0){
                min = a[i];
            }
            if(max.compareTo(a[i])<0){
                max = a[i];
            }
        }
        return new Pair<T>(min,max);
    }
    // 泛型方法返回值<T> 由输入进行推断
    public static <T> T getMiddle(T[] a){
        return a[a.length/2];
    }

}
