package check_interaction;

import java.io.PrintStream;

public class PrintStreamStub extends PrintStream {

    public String lastPrintlnParameter;

    public PrintStreamStub() {
        super(new FakeOutputStream());
        lastPrintlnParameter = null;
    }

    public void println(String string){
        lastPrintlnParameter = string;
    }

}
