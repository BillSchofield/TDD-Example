package interaction_example;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class CarTest {

    @Test
    public void shouldIncreaseThrottleWhenWeAccelerate(){
        Engine engine = mock(Engine.class);
        new Car(engine, "Buick").accelerate();

        verify(engine).increaseThrottle();
    }
}
