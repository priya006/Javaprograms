package learnings.interfaceconcepts.inhertanceconcepts;

public class zoo {
    public void feedAllAnimals(Animal[] animals) {

        for (Animal animal: animals){
            animal.eat();
            animal.age();
        }

    }

    //here how  animal.eat and zoo.age works.  How zoo and Animal are related. cant understand.
}
