package learnings.interfaceconcepts.inhertanceconcepts;

public class Lion extends Animal implements  Loggable, printable{

    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    public String message(){
        return "something message";
    }

    public void print(){
        System.out.println("Print something");
    }

    protected void age(){
        System.out.println("Age is calculated");
    }
}
