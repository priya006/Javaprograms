package java.src.learnings;


import org.junit.jupiter.api.Test;

import java.src.some1.some.LoggingLevel;

public class PersonTest
{

    @Test
    public void shouldReturnNumberOfPersons(){


        Person person1 = new Person();
        Person person2 = new Person();
        person2.numberOfpersons();
        System.out.print(person2.numberOfpersons());
       // System.out.print(person1.personCounter);
        LoggingLevel state = LoggingLevel.SOMETHING;


    }



}
