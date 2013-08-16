package check_result;

public class Factorial {
    public static Integer factorial(Integer number) {
        if (number < 2){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
