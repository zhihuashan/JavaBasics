package ThreeProgramStructure.InputAndOutput;

/**
 * @Author: shanzhihua
 * @Date: 2022/7/2 18:33
 * @Version 1.0
 * 命令行参数
 */

public class Message {
    public static void main(String[] args) {
        // 需要通过命令行进行运行
        // java Message -g cruel word
        args =new String[]{"-g","cruel","word"};
        if(args[0].equals("-h")){
            System.out.println("Hello,");
        }else if(args[0].equals("-g")){
            System.out.print("Goodbye,");
        }
        for(int i=1;i<args.length;i++){
            System.out.print(" "+args[i]);
        }
        System.out.print("!");
    }
}
