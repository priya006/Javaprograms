package learnings.interfaceconcepts.inhertanceconcepts;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    protected void age(){
        System.out.println("Age is calculated");
    }
}
