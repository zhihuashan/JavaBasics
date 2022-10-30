package SixInterfaceAndInnerClass.InnerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/3 11:18
 * @Version 1.0
 * 内部类对于外部类中方法和属性有访问权限
 * outer的指向外部类
 */

class TalkingClock{
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    // starts the clock
    public void start(){
        ActionListener listener = new TimePrinter();
        // 类似于加了一个outer的指针指向外部的interval
        Timer t = new Timer(interval,listener);
        t.start();
    }

    public class  TimePrinter implements  ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Date now = new Date();
            System.out.println("At the tone,the time is"+now);
            // 类似于加了一个outer的指针指向外部的beep
            if(beep){
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
}
