package check_interaction;

import java.io.IOException;
import java.io.OutputStream;

public class FakeOutputStream extends OutputStream {
    public void write(int b) throws IOException {}
}