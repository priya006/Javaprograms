package learnings.interfaceconcepts.examples;

import java.util.*;

public class Amz {

    public static void main(String[] args) {

        int[] intput = new int[5];
        int[] intput1 = {2, 3, 4, 5, 6};
        int[] intput2 = {1, 0, 0, 0, 0, 1, 0, 0};
        List<String> a = new ArrayList<>();

        a.add("a a b c");
        a.add("a b b c");
        a.add("a 1 2 3");
        a.add("a 2 2 3");
        List<String> x = prioritizedOrders(2, a);
        for (String s : x) {
            System.out.println(x);
        }
    }

    public static List<String> prioritizedOrders(int numOrders, List<String> orderList) {
        List<String> primeOrders = new ArrayList<>();
        List<String> nonPrimeOrders = new ArrayList<>();
        // WRITE YOUR CODE HERE
        String delimiter = " ";
        for (String order : orderList) {
            String[] split = order.split(delimiter);
            if (split.length >= 2) {
                String orderIdMetaFirstString = split[1];
                if (orderIdMetaFirstString.charAt(0) >= 97 && orderIdMetaFirstString.charAt(0) <= 122)
                    primeOrders.add(order);
                else
                    nonPrimeOrders.add(order);
            }
        }

        List<String[]> primeOrdersMetaData = new ArrayList<>();
        if (!primeOrders.isEmpty()) {
            for (String primeOrder : primeOrders) {
                String[] split = primeOrder.split(delimiter);
                if (split.length >= 2) {
                    primeOrdersMetaData.add(Arrays.copyOfRange(split, 1, split.length));
                }
            }

            Collections.sort(primeOrdersMetaData, new Comparator<String[]>() {
                public int compare(String[] strings, String[] otherStrings) {
                    return strings[1].compareTo(otherStrings[1]);
                }
            });
        }

        List<String> output = new ArrayList<>();

        int[] visitedIndexes = new int[primeOrders.size()];
        for (int i = 0; i < visitedIndexes.length; i++) {
            visitedIndexes[i] = -1;
        }

        for (String[] primeOrderMetaData : primeOrdersMetaData) {
            int counter = 0;
            for (String primeOrder : primeOrders) {
                String[] split = primeOrder.split(delimiter);
                if (checkEquality(primeOrderMetaData, Arrays.copyOfRange(split, 1, split.length))) {
                    if (!Arrays.asList(visitedIndexes).contains(primeOrders.indexOf(primeOrder))) {
                        output.add(primeOrder);
                        break;
                    }
                    int visited = primeOrders.indexOf(primeOrder);
                    visitedIndexes[counter] = visited;
                    counter++;
                }
            }
        }

        for (String nonPrimeOrder : nonPrimeOrders) {
            output.add(nonPrimeOrder);
        }

        return output;
    }

    public static boolean checkEquality(String[] s1, String[] s2) {
        if (s1 == s2)
            return true;

        if (s1 == null || s2 == null)
            return false;

        int n = s1.length;
        if (n != s2.length)
            return false;

        for (int i = 0; i < n; i++) {
            if (!s1[i].equals(s2[i]))
                return false;
        }

        return true;
    }


}
