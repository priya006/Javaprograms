package learnings.interfaceconcepts;

public class CarService {

    public void drive(Car[] cars) {


       // Car[] cars = {new BMW(), new Mercedes(), new Porsche()};
        for (Car car : cars) {

            car.drive();
        }

    }




    public void owner(){

        Property[] properties = {new BMW(), new Mercedes(), new Porsche()};
        for (Property property : properties ) {

            property.owner();
        }


    }


}
