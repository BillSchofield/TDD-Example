package check_interaction;

import java.io.*;

public class FilePrinter {
    private final BufferedReader reader;
    private final PrintStream printStream;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        new FilePrinter(reader, System.out).print();
    }

    public FilePrinter(BufferedReader reader, PrintStream printStream) {
        this.reader = reader;
        this.printStream = printStream;
    }

    public void print() throws IOException {
        String line;
        while((line = reader.readLine()) != null){
            printStream.println(line);
        }
    }
}
