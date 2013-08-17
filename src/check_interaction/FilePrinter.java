package check_interaction;

import java.io.PrintStream;
import java.util.List;

public class FilePrinter {
    private final FileLineReader fileLineReader;
    private final PrintStream printStream;

    public FilePrinter(FileLineReader fileLineReader, PrintStream printStream) {
        this.fileLineReader = fileLineReader;
        this.printStream = printStream;
    }

    public void print() {
        List<String> lines = fileLineReader.lines();
        for (String line : lines){
            printStream.println(line);
        }
    }
}
