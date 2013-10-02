package check_result;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {

    private final Factorial factorial = new Factorial();

    @Test
    public void shouldReturnOneWhenNumberIsOne(){
        // Arrange our objects
        int expected = 1;
        Factorial factorial = new Factorial();

        // Action happens (we call the method that we are testing)
        Integer actual = factorial.of(1);

        // Assert that the correct thing happened as a result of the action
        assertThat(actual, is(expected));
    }

    @Test
    public void shouldReturnTwoWhenNumberIsTwo(){
        // More concise (and readable) version
        // Note that we extracted our object under test into a field
        assertThat(factorial.of(2), is(2));
    }

    @Test
    public void shouldReturnOneWhenNumberIsZero(){
        assertThat(factorial.of(0), is(1));
    }

    @Test
    public void shouldReturnSixWhenNumberIsThree(){
        assertThat(factorial.of(3), is(6));
    }
}
