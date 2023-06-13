package June_10th_2023;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class RuntimeToCustomException {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            try {
                throw new CustomException("Custom Exception: Division by zero is not vaild`");
            } catch (CustomException ce) {
                System.out.println(ce.getMessage());
            }
        }
    }
}
