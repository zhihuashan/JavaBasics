package FiveInherit.Reflect.ReflectGenericArray;

import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/24 16:25
 * @Version 1.0
 */

public class testGenericArray{
    @Test
    public  void testGoodCopyOf(){
        CopyOf CO = new CopyOf();
        int[] a = {1,2,3,4};
        a= (int[]) CO.goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));
        // 支持多种类型进行数组拓展
        String[] b = {"Tom","Dick","Harry"};
        b= (String[]) CO.goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));
        System.out.println("The following call will generate an exception.");
//        Object无法转化为String类型
//        b = (String[]) CO.badCopyOf(b,10);
    }


}
