package TwelveGenericProgramming.DefineSimpleGenericClasses;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/26 9:57
 * @Version 1.0
 */

public class PairTest1 {
    public static void main(String[] args) {
        String[] words= {"Mary","had","a","little","lamb"};
        // 获取字符串数组中的最大最小值,并使用Pair进行返回
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min="+mm.getFirst());
        System.out.println("max="+mm.getSecond());

        // 泛型方法
        String middle = ArrayAlg.getMiddle(words);
        System.out.println(middle);
    }
}
