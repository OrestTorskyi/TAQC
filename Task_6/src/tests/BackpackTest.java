package tests;

import obj.BackSystem;
import obj.Backpack;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {
    Backpack[] backpacks = new Backpack[6];
    List<Integer> objects = new ArrayList<>();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        backpacks[0] = new Backpack(BackSystem.NONE);
        backpacks[1] = new Backpack(BackSystem.FOAMBACK, "Deuter", 30);
        backpacks[2] = new Backpack(BackSystem.NET, "LeadHiking");
        backpacks[3] = new Backpack(BackSystem.FOAMBACK, "Deuter", 45);
        backpacks[4] = new Backpack(BackSystem.NONE, "The North Face", 55);
        backpacks[5] = new Backpack(BackSystem.NET, "Terra Incognita", 30);
        objects.add(10);
        objects.add(15);
        objects.add(25);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void fitToBackpack() {
        assertEquals(true, backpacks[4].fitToBackpack(objects));
        assertEquals(false, backpacks[0].fitToBackpack(objects));
    }

    @org.junit.jupiter.api.Test
    void getBestBackpackFromList() {
        assertEquals(backpacks[3], Backpack.getBestBackpackFromList(backpacks));
    }
}