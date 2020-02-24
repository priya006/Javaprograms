package comparator1;

import java.util.Comparator;

public class Compimpl implements Comparator<Integer> {


    //Use the comparator interface and give your implementation for the method compare and use the method
    //compare in your class

    @Override
    public int compare(Integer o1, Integer o2) {


        //This is my own compare method

        if (o1 > o2)

            return 1;


        return -1;
    }
}
