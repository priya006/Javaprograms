package learnings.interfaceconcepts;



public class BMW implements Car,Property,Loggable,Asset{

    public void drive(){

        System.out.println("BMW is running");
    }




    @Override
    public String owner() {
        return "priya";
    }

    @Override
    public String message() {
        return "BMW message";
    }

    @Override
    public int value() {
        return 4989;
    }
}
