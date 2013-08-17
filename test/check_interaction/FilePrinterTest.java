package check_interaction;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.Arrays;

import static org.mockito.Mockito.*;

public class FilePrinterTest {

    private FileLineReader fileLineReader;
    private final static String something = "Something";
    private final static String somethingElse = "Something Else";
    private PrintStream printStream;
    private FilePrinter filePrinter;

    @Before
    public void setUp() throws Exception {
        fileLineReader = mock(FileLineReader.class);
        printStream = mock(PrintStream.class);
        filePrinter = new FilePrinter(fileLineReader, printStream);
    }

    @Test
    public void shouldPrintSomethingWhenThereIsSomethingInTheFile(){
        // Given a filePrinter and a file with single string in it
        fileContains(something);

        // When I print the file
        filePrinter.print();

        // Then I print the string from the file
        verify(printStream).println(something);
    }

    @Test
    public void shouldPrintTwoLinesWhenThereAreTwoLinesInTheFile(){
        // Given a filePrinter and a file with single string in it
        fileContains(something, somethingElse);

        // When I print the file
        filePrinter.print();

        // Then I print the string from the file
        verify(printStream).println(something);
        verify(printStream).println(somethingElse);
    }

    private void fileContains(String... lines) {
        when(fileLineReader.lines()).thenReturn(Arrays.asList(lines));
    }
}
