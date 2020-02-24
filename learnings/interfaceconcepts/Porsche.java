package learnings.interfaceconcepts;

public class Porsche implements Car,Loggable,Asset,Property {

    public void drive(){

        System.out.println("Porsche is running");
    }

    @Override
    public String message() {
        return "some porsche";
    }

    @Override
    public int value() {
        return 7890;
    }

    @Override
    public String owner() {
        return "porsche";
    }
}
