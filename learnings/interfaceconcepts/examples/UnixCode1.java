package learnings.interfaceconcepts.examples;

        import java.io.*;
        import java.util.HashMap;
        import java.util.Map;

public class UnixCode1 {

    public static void main(String[] args) throws Exception, IOException {
        Map<String, String> map = new HashMap<String, String>();
        BufferedReader in = new BufferedReader(new FileReader("/Users/pboopathi/Desktop/jeetcopy"));
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

        File log= new File("/Users/pboopathi/Desktop/jeet.txt");
        FileReader fr = new FileReader(log);
        String s;
        BufferedReader br = new BufferedReader(fr);

        while ((s = br.readLine()) != null) {
            for (Map.Entry<String,String> entry: map.entrySet())
            {
                if (s.contains(entry.getValue()))
                    s.replaceAll(entry.getValue(), entry.getKey());
            }
            System.out.println("Output line : " + s);
        }
    }
}
