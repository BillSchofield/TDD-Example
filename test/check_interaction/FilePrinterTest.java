package check_interaction;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class FilePrinterTest {

    private BufferedReader reader;
    private final static String something = "Something";
    private final static String somethingElse = "Something Else";
    private PrintStream printStream;
    private FilePrinter filePrinter;

    @Before
    public void setUp() throws Exception {
        reader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        filePrinter = new FilePrinter(reader, printStream);
    }

    @Test
    public void shouldPrintSomethingWhenThereIsSomethingInTheFile() throws IOException {
        when(reader.readLine())
                .thenReturn(something)
                .thenReturn(null);

        filePrinter.print();

        verify(printStream).println(something);
    }

    @Test
    public void shouldPrintTwoLinesWhenThereAreTwoLinesInTheFile() throws IOException {
        when(reader.readLine())
                .thenReturn(something)
                .thenReturn(somethingElse)
                .thenReturn(null);

        filePrinter.print();

        verify(printStream).println(something);
        verify(printStream).println(somethingElse);
    }
}
