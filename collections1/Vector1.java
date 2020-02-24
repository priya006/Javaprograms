package collections1;

import java.util.Vector;

public class Vector1 {

    public static void main(String[] args) {


        //Vectors are very similar to arraylist .
        //it is dynamic array
        //vector waste lot of memory space. Since it increases the capacity by 100% where as arraylist increases by 50%

        Vector<Integer> vector = new Vector<>();

        vector.add(1);
        vector.add(10);
        vector.add(11);
        vector.add(15);

        System.out.println("The capacity of the vector which is dynamic is: " + vector.capacity());


        for (int v : vector)
            System.out.println(v);


    }
}
