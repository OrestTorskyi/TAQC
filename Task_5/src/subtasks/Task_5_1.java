package subtasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task_5_1 {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public boolean isInRange(float[] array)
    {
        boolean in_range = true;
        for(int i = 0; i < array.length; i++) {
            if (array[i] < -5 || array[i] > 5) in_range = false;
        }
        String str = in_range == true ? "All numbers are in range [-5,5] - Correct" : "Some or all numbers aren't in range [-5,5]";
        System.out.println(str);
        return in_range;
    }

    public int[] minMaxElement(int [] array)
    {
        int[] minmax = new int[2];
        int max = array[0];
        int min = array[0];
        for(int i = 1; i < array.length; i++)
        {
            max = (max < array[i]) ? array[i] : max;
            min = (min > array[i]) ? array[i] : min;
        }

        minmax[0] = min;
        minmax[1] = max;

        System.out.println("Minimum element: " + min + "\nMaximum element: " + max);

        return minmax;

    }


    public String getHttpDescription(int number)
    {
        String str = HTTPError.httpDescription(number);
        return str;
    }
}
