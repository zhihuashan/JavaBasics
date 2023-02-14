package Enum;

import java.io.File;

/**
 * @Author: shanzhihua
 * @Date: 2023/2/13 13:30
 * @Version 1.0
 */

public class Test {
    public enum Color {
        RED("红色",1),GREEN("绿色",2),WHITE("白色",3),YELLOW("黄色",4);
        private String name;
        private Integer index;

        private Color(String name, Integer index) {
            this.name = name;
            this.index = index;
        }

        @Override
        public String toString() {
            return this.index + "_" + this.name;
        }
    }

    public static void main(String[] args) {
//        System.out.println(Color.RED.toString());
        System.out.println(System.getProperty("file.encoding"));
    }
}
