package SixInterfaceAndInnerClass.InnerClass;


import javax.swing.*;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/3 11:08
 * @Version 1.0
 */

public class InnerClassTest {
    public static void main(String[] args) {
        TalkingClock clock = new TalkingClock(1000,true);
        clock.start();
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }
}
