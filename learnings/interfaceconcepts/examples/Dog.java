package learnings.interfaceconcepts.examples;

public class Dog extends Animal {

    public void eat(Animal animal){
        System.out.println("Dog is running");

    }

    public static void main(String args[]) throws Exception {

        Animal animalPointingToDog = new Animal();
        Dog dogPointingToDog =  new Dog();

        animalPointingToDog.eat();
        dogPointingToDog.eat(animalPointingToDog);
    }
}
