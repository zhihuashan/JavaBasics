package SixInterfaceAndInnerClass.InterfaceAndCallback;

import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/3 10:26
 * @Version 1.0
 * 回调函数
 */

class TimerTest {
    public static void main(String[] args) {

        ActionListener listener = new TimePrinter();
        // 构建一个时间回调监听器
        // 每1秒钟执行一次
        Timer t = new Timer(1000,listener);
        t.start();
        JOptionPane.showMessageDialog(null,"Quit program");
        System.exit(0);
    }

}

