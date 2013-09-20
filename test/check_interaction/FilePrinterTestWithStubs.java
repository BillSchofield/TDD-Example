package check_interaction;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FilePrinterTestWithStubs {

    private BufferedReader reader;
    private final static String something = "Something";
    private final static String somethingElse = "Something Else";
    private PrintStreamStub printStream;
    private FilePrinter filePrinter;
    private List<String> linesToReturn;

    @Before
    public void setUp() throws Exception {
        linesToReturn = newArrayList();
        reader = new BufferedReaderStub(linesToReturn);
        printStream = new PrintStreamStub();
        filePrinter = new FilePrinter(reader, printStream);
    }

    @Test
    public void shouldPrintSomethingWhenThereIsSomethingInTheFile() throws IOException {
        linesToReturn.addAll(newArrayList(something, null));
        filePrinter.print();
        assertThat(printStream.lastPrintlnParameter, is(something));
    }

    @Test
    public void shouldPrintTwoLinesWhenThereAreTwoLinesInTheFile() throws IOException {
        linesToReturn.addAll(newArrayList(something, somethingElse, null));
        filePrinter.print();
        assertThat(printStream.lastPrintlnParameter, is(somethingElse));
    }
}
