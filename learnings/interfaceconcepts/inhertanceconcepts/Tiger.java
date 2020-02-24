package learnings.interfaceconcepts.inhertanceconcepts;

public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger is eating");
    }

    protected void age(){
        System.out.println("Age is calculated");
    }
}
