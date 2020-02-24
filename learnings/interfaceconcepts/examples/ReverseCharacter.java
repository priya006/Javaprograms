package learnings.interfaceconcepts.examples;

public class ReverseCharacter {
    public static void main(String[] args) {

      char[] s = {'h','e','l','l','o'};





        int inputCharLength = s.length;
        char[] tmp = new char[1];

        for(int i = 0; i < inputCharLength; i++){

            for(int j= inputCharLength-1; j>=0; j--){

                tmp[0]  =  s[i];
                s[i]  =  s[j];
                s[j] = tmp[0];

            }
        }

        for(char c : s)
            System.out.println(c);

    }

/*
        String inputString = "pr";
        char[] characterArray = inputString.toCharArray();
        int inputStringLength = inputString.length();


        char[] tmp = new char[1];


        for (int i = 0; i < inputStringLength; i++) {

            for (int j = inputStringLength - 1; j >= 0; j--) {

                tmp[0] = characterArray[i];
                characterArray[i] = characterArray[j];
                characterArray[j] = tmp[0];
            }
        }

        System.out.println(characterArray);

        for (char c : characterArray)
            System.out.println(c);
    }*/
}