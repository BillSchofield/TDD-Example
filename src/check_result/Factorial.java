package check_result;

public class Factorial {
    public Integer compute(Integer number) {
        if (number < 0){
            throw new IllegalArgumentException();
        }
        if (number == 0){
            return 1;
        }
        return number * compute(number - 1);
    }
}
