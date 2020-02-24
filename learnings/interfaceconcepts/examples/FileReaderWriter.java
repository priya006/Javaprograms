package learnings.interfaceconcepts.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriter {

    public static void main(String[] args) throws IOException {

        int c;
        FileReader fileReader = new FileReader("/Users/pboopathi/Desktop/jeet.txt");
        FileWriter fileWriter = new FileWriter("/Users/pboopathi/Desktop/jeetcopy.txt");


            //-1 means empty
        while((c = fileReader.read()) != -1){
                char c1 = (char)c;
                fileWriter.write(c);

        }




    }
}
