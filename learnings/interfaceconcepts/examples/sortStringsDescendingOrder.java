package learnings.interfaceconcepts.examples;

import org.junit.Test;

import java.io.*;
import java.util.*;

//Ebay question daweii (San jose team) . got called for onsite.


public class sortStringsDescendingOrder {

    String[] stringSplited;
    BufferedReader bufferedReader;

    public void sortStrings(String inputFile, String outPutFile) throws IOException {

        String stringsTobeStorted;
        bufferedReader = new BufferedReader(new FileReader(inputFile));
        Map<String, String> fileContent = new TreeMap<>();

        while ((stringsTobeStorted = bufferedReader.readLine()) != null) {

            fileContent.put("line1", stringsTobeStorted);
            stringSplited = stringsTobeStorted.split(",");
            Arrays.sort(stringSplited, Collections.reverseOrder());
            for (int i = 0; i < stringSplited.length; i++)
                System.out.println("Sorted String: " + stringSplited[i]);
        }

        FileWriter writer = new FileWriter(outPutFile);
        for (String val : stringSplited) {
            writer.write(val);
            writer.append(",");

        }
        bufferedReader.close();
        writer.close();
    }


    //I ignored /n character in the input csv file. Read the question pls.
    //In the output I am getting one extra ,


    @Test
    public void readFile() throws IOException {

        sortStrings("/Users/pboopathi/Documents/backup-mac/playground/java/root/input.csv", "/Users/pboopathi/Documents/backup-mac/playground/java/root/output1.csv");
    }
}


