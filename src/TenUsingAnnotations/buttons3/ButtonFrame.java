package TenUsingAnnotations.buttons3;

import TenUsingAnnotations.runtimeAnnotations.ActionListenerFor;
import TenUsingAnnotations.runtimeAnnotations.ActionListenerInstaller;

import javax.swing.*;
import java.awt.*;

/**
 * @Author: shanzhihua
 * @Date: 2022/6/29 19:34
 * @Version 1.0
 */

public class ButtonFrame extends JFrame {
    private static  final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;
    private JPanel panel;
    private JButton yellowButton;
    private JButton blueButton;
    private JButton redButton;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
        panel = new JPanel();
        add(panel);
        yellowButton = new JButton("Yellow");
        blueButton = new JButton("Blue");
        redButton = new JButton("Red");
        panel.add(yellowButton);
        panel.add(blueButton);
        panel.add(redButton);
        ActionListenerInstaller.processAnnotations(this);
    }

    @ActionListenerFor(source = "yellowButton")
    public void yellowBackground(){
        panel.setBackground(Color.YELLOW);
    }

    @ActionListenerFor(source = "blueButton")
    public void blueBackground(){
        panel.setBackground(Color.BLUE);
    }

    @ActionListenerFor(source = "redButton")
    public void redButton(){
        panel.setBackground(Color.RED);
    }
}
