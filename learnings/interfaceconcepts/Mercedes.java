package learnings.interfaceconcepts;

public class Mercedes implements Car,Loggable,Asset,Property{

    public void drive(){

        System.out.println("Mercedes is running");
    }

    @Override
    public String message() {
        return "some Mercedes";
    }

    @Override
    public int value() {
        return 6700;
    }

    @Override
    public String owner() {
        return "Mercedes";
    }

}
