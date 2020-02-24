package learnings.interfaceconcepts.examples;

public class AnangramCounter {
    public static void main(String[] args) {

        boolean result = isAnagram("anagram", "nagaram");
        System.out.println(result);

        String s = "priya";
        

    }


    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] counter = new int[26];
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for (int count : counter) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}


