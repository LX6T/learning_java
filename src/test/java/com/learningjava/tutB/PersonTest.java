package com.learningjava.tutB;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class PersonTest {

    private static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};

    public String[] states() {
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld() {

        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus() {
        Person person = new Person();
        Person person2 = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons() {
        Person person1 = new Person();
        Person person2 = new Person();

        assertEquals(2, Person.numberOfPersons());

    }

    @Test
    public void arraysAndEnums() {

        for (LoggingLevel state: LoggingLevel.values()) {
            switch (state) {
                case PENDING -> System.out.println("PENDING");
                case PROCESSED -> System.out.println("PROCESSED");
                case PROCESSING -> System.out.println("PROCESSING");
                default -> {
                    // throw error
                }
            }
        }
    }

}
