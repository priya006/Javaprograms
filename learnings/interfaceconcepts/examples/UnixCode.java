/*
package learnings.interfaceconcepts.examples;

import java.io.*;

public class UnixCode {


    public UnixCode() throws IOException {


        File fileToBeModified = new File("filePath");
        String newContent;


        //  Initialize oldContent with an empty string.
        // This String object will hold all the old content of the input text file.

        String oldContent = "";


        BufferedReader reader = new BufferedReader(new FileReader(fileToBeModified));

        // Read all the lines of input text file one by one and append it to oldContent.

        String line = reader.readLine();

        while (line != null)

        {
            oldContent = oldContent + line + System.lineSeparator();
            line = reader.readLine();
        }

        //Replace all the occurrences of oldString with newString using replaceAll() method. You will get a newContent.

        newContent = oldContent.replaceAll(oldContent, newContent);


        FileWriter writer = new FileWriter(fileToBeModified);


        writer.write(newContent);
        reader.close();
        writer.close();

    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader in = new BufferedReader(new FileReader("group.txt"));
        String line = "";
        while ((line = in.readLine()) != null) {
            String parts[] = line.split(":");
            StringBuilder eachLine = new StringBuilder();
            int count = 0;
            for (String part : parts) {
                count ++;
                if (count == 1)
                    continue;
                eachLine.append(part);
            }
            map.put(parts[0], eachLine.toString());
        }
        in.close();
        System.out.println(map.toString());

    }


}
*/
