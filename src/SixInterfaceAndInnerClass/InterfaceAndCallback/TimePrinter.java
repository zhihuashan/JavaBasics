package SixInterfaceAndInnerClass.InterfaceAndCallback;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/3 10:27
 * @Version 1.0
 */

class TimePrinter implements ActionListener {
    public void actionPerformed(ActionEvent event){
        Date now = new Date();
        System.out.println("At the tone,the time is"+now);
        Toolkit.getDefaultToolkit().beep();
    }
}
