package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import subtasks.Task_5_1;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Task_5_1Test {

    Task_5_1 task = new Task_5_1();
    float[] array1 = {-3F, -7F, 10F};
    int[] array2 = {125,321,111};
    int[] minmax = {111,321};

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isInRange() {
        assertEquals(false,task.isInRange(array1));
    }

    @Test
    void minMaxElement() {
        assertEquals(Arrays.toString(minmax),Arrays.toString(task.minMaxElement(array2)));
    }

    @Test
    void getHttpDescription() {
        assertEquals("404 Not Found — Не знайдено", task.getHttpDescription(404));
    }
}