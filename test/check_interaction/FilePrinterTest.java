package check_interaction;

import org.junit.Test;

import java.io.PrintStream;

import static com.google.common.collect.Lists.newArrayList;
import static org.mockito.Mockito.*;

public class FilePrinterTest {

    @Test
    public void shouldWriteSomethingToTheConsoleWhenThereIsSomethingInTheFile(){
        // Given a filePrinter and a file with single string in it
        FileLineReader fileLineReader = mock(FileLineReader.class);
        String something = "Something";
        when(fileLineReader.lines()).thenReturn(newArrayList(something));
        PrintStream printStream = mock(PrintStream.class);
        FilePrinter filePrinter = new FilePrinter(fileLineReader, printStream);

        // When I print the file
        filePrinter.print();

        // Then I print the string from the file
        verify(printStream).println(something);
    }
}
