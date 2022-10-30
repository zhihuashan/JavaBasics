package ThreeProgramStructure.InputAndOutput;

import java.util.Scanner;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 18:02
 * @Version 1.0
 */

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 输入
        System.out.println("What is your name");
        String name = in.nextLine();

        // 输入
        System.out.println("How old are you");
        int age = in.nextInt();

        System.out.println("Hell, "+ name+". Next year,you'll be "+(age+1));

    }
}
