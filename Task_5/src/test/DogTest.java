package test;

import subtasks.Breed;
import subtasks.Dog;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog[] dogs = new Dog[3];

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        dogs[0] = new Dog("Bobik", Breed.AKITA, 12);
        dogs[1] = new Dog("Bobik",Breed.BEAGLE, 5);
        dogs[2] = new Dog("Chappy",Breed.SHEPHERD, 7);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void oldestDog() {
        assertEquals(dogs[0], Dog.oldestDog(dogs));
    }
}