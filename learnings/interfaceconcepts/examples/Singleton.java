package learnings.interfaceconcepts.examples;

public class Singleton {

    //1. Create a private constructor
    //2.Create a getInstance method which returns the object(The method should be static)

    public static void main(String[] args) {

        Singleton1 singleton = Singleton1.getInstance();
        System.out.println(singleton);

    }

}

class Singleton1 {


    private Singleton1() {


    }


    static Singleton1 getInstance() {

        Singleton1 singleton = new Singleton1();
        return singleton;

    }

}


