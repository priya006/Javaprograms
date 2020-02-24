package learnings.interfaceconcepts.inhertanceconcepts;

public class gorila extends Animal{

    @Override
    public void eat() {
        System.out.println("Gorila is eating");
    }

    protected void age(){
        System.out.println("Gorila is implementing the age by itself - I am overriting age here");
    }
}
