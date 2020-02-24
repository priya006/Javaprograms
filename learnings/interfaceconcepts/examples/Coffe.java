package learnings.interfaceconcepts.examples;

public class Coffe {

    // I dont know what this means? how it is declared
    CoffeeSize size;

    public static void main(String args[]){

        Coffe drink1 = new Coffe();
        //how this was possible??? (right side i mean)
        drink1.size = CoffeeSize.BIG;

        Coffe drink2 = new Coffe();
        drink2.size = CoffeeSize.BIGGEST;


        System.out.println("Big" + drink1.size.getSize());
        System.out.println("biggest" + drink2.size.getSize());

    }
}
