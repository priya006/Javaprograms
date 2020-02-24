package learnings.interfaceconcepts.examples;

public class OccurenceOfCharacter {

    public static void main(String[] args) {

        String str = "anandh";
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a')
                count ++;
        }

        System.out.print(count+ "\t");

    }

}
