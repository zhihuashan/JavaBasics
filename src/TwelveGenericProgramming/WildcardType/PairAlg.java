package TwelveGenericProgramming.WildcardType;

import TwelveGenericProgramming.DefineSimpleGenericClasses.Pair;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/30 10:07
 * @Version 1.0
 */

public class PairAlg {
    // 通配符 测试pair是否包含null引用
    public static boolean hasNulls(Pair<?> p){
        return p.getFirst() ==null|| p.getSecond() ==null;
    }

    public static void  swap(Pair<?> p){
        swapHelper(p);
    }
    // 泛型方法 返回的数据类型和输入的数据类型是一致的
    public static  <T> void swapHelper(Pair<T> p){
        // ?不能作为类型变量 T可以
        T t = p.getFirst();
        p.setFirst(p.getSecond());
        p.setSecond(t);
    }
}

