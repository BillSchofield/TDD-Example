package check_result;

public class Factorial {
    public Integer of(Integer number) {
        if (number < 2){
            return 1;
        }
        return number * of(number - 1);
    }
}
