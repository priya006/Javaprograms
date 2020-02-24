package learnings.interfaceconcepts;


import org.junit.Test;

public class carSerTest {

    @Test
    public void shouldLearnInterface(){

        Car[] cars = {new BMW(), new Mercedes(), new Porsche()};
        CarService carService = new CarService();
        carService.drive(cars);




        //How should I call  owner , value , message
        carService.owner();


    }
}