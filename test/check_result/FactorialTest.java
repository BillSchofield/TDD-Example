package check_result;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    public void shouldReturnOneWhenNumberIsOne(){
        // Arrange our objects
        Factorial factorial = new Factorial();

        // Action happens (we call the method that we are testing)
        Integer actual = factorial.compute(1);

        // Assert that the correct thing happened as a result compute the action
        assertThat(actual, is(1));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo(){
        // More concise (and readable) version
        // Note that we extracted our object under test into a field
        assertThat(factorial.compute(2), is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial.compute(0), is(1));
    }

    @Test
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(factorial.compute(3), is(6));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldReturnWhenNumberIsNegative(){
        factorial.compute(-1);
    }
}
