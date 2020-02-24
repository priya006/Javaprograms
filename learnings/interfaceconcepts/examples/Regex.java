package learnings.interfaceconcepts.examples;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Regex {


    //var name = name.replace(/[^a-zA-Z ]/g, "");

    static void removeSpecialCharacters(String S){

    String stringWithoutSpecialCharacter  =   S.replaceAll("[^a-zA-Z ]","");
    String[]  stringArray =     stringWithoutSpecialCharacter.split("//s");
    System.out.println(stringArray);

    }


    public static void main(String[] args){

        removeSpecialCharacters("Perfect perfect. ksjksjkdfswin!@!#2");

    }
}
