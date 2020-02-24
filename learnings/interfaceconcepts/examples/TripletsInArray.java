package learnings.interfaceconcepts.examples;

public class TripletsInArray {
    //int count = 0
    //int[] array = new int[]{5, 1, 3, 4, 7};
    //int sum = 12 (resultSum < sum}
    //{5,1,3} {3,4

    //if(a[i]+a[j]+a[k] <12}


    static int findTriplets() {

        int sum = 12;
        int count = 0;
        int[] input = new int[]{5, 1, 3, 4, 7};

        //The First element is going to be constant
        for (int i = 0; i < input.length-2; i++)


            //The Second  element is going to be constant
            for (int j = i + 1; j < input.length-1; j++)

                for (int k = j + 1; j < input.length; k++)
                    if (input[i] + input[j] + input[k] < sum)
                        count++;
        return count;
    }

    public static void main(String[] args) {

        int resultCount = findTriplets();
        System.out.println(resultCount);
    }
}
