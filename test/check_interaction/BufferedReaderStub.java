package check_interaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class BufferedReaderStub extends BufferedReader {

    private static class FakeReader extends Reader {
        public int read(char[] cbuf, int off, int len) throws IOException {
            return 1;
        }
        public void close() throws IOException {}
    }

    List<String> lines;

    public BufferedReaderStub(List<String> lines) {
        super(new FakeReader());
        this.lines = lines;
    }

    public String readLine(){
        if (lines.size() > 0){
            return lines.remove(0);
        }
        return null;
    }

}
