package Exception.CustomException;

/**
 * @Author: shanzhihua
 * @Date: 2023/2/11 20:34
 * @Version 1.0
 */

public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
