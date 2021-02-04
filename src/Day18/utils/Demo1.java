package Day18.utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a.txt");
        FileWriter fileWriter = new FileWriter("b.txt");
        IOutils.close(fileWriter,fileReader);
    }
}
