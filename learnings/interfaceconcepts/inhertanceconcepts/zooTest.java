package learnings.interfaceconcepts.inhertanceconcepts;


import org.junit.Test;

public class zooTest {

    @Test
    public void shouldFeedAllAnimals(){

        zoo zoo = new zoo();
        Animal[] animals = {new Dog(), new gorila(), new Lion(), new Tiger(),};

        zoo.feedAllAnimals(animals);

    }
}
