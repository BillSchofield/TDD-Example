package check_result;

import org.junit.Test;

import static check_result.Factorial.factorial;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    @Test
    public void shouldReturnOneWhenNumberIsOne(){
        assertThat(factorial(1), is(1));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo(){
        assertThat(factorial(2), is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial(0), is(1));
    }
}
