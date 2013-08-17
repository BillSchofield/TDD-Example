package check_interaction;

import java.io.PrintStream;

public class FilePrinter {
    private final FileLineReader fileLineReader;
    private final PrintStream printStream;

    public FilePrinter(FileLineReader fileLineReader, PrintStream printStream) {
        this.fileLineReader = fileLineReader;
        this.printStream = printStream;
    }

    public void print() {
        printStream.println(fileLineReader.lines().get(0));
    }
}
