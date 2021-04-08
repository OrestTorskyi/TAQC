package obj;

import java.util.List;
import java.util.Objects;

public class Backpack {
    private String name;
    private int capacity;
    private BackSystem backSystem;
    public static int count = 0;
    private int backpackID;
    public Backpack(BackSystem backSystem)
    {
        this.backSystem = backSystem;
    }

    public Backpack(BackSystem backSystem, String name)
    {
        this.name = name;
        this.backSystem = backSystem;
        count++;
        backpackID = count;
    }

    public Backpack(BackSystem backSystem, String name,  int capacity)
    {
        this.backSystem = backSystem;
        this.name = name;
        this.capacity = capacity;
        count++;
        backpackID = count;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public void setBackSystem(BackSystem backSystem)
    {
        this.backSystem = backSystem;
    }

    public String getName()
    {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBackSystemDescription()
    {
        return backSystem.getDescription();
    }

    public BackSystem getBackSystem()
    {
        return backSystem;
    }

    //As parameters set capacity of each object
    public boolean fitToBackpack(List<Integer> objects_capacity)
    {
        int count = 0;
        for(int i : objects_capacity)
        {
            count += i;
        }

        if(this.capacity >= count)
        {
            System.out.println("There is space for all your objects!");
            return true;
        }
        else{
            System.out.println("There is no space in this model of backpack for your objects!");
            return false;
        }
    }

    static public Backpack getBestBackpackFromList(Backpack[] backpacks) {
        int[] array_points = new int[backpacks.length];
        int backsystem_point = 0;
        int indexOfBest = 0;
        int max = array_points[0];
        Backpack backpack_best;
        for (int i = 0; i < backpacks.length; i++) {
            if (backpacks[i].getBackSystem() == BackSystem.NONE) backsystem_point = 1;
            else if (backpacks[i].getBackSystem() == BackSystem.FOAMBACK) backsystem_point = 2;
            else if (backpacks[i].getBackSystem() == BackSystem.NET) backsystem_point = 3;
            if(backpacks[i].getCapacity() == 0)
            {
                array_points[i] = 20 * backsystem_point;
            }
            else array_points[i] = backpacks[i].getCapacity() * backsystem_point;
        }

        for (int i = 1; i < array_points.length; i++)
        {
            if(max < array_points[i]) {
                max = array_points[i];
                indexOfBest = i;
            }
        }
        backpack_best = backpacks[indexOfBest];
        return backpack_best;
    }


    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if((o == null) | (this.getClass() != o.getClass())) return false;
        Backpack other_backpack = (Backpack) o;
        if(this.hashCode() == other_backpack.hashCode()) return true;
        else{
            if(this.getName() == other_backpack.getName()) return true;
            else return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(capacity);
    }

    @Override
    public String toString()
    {
        return "Backpack №" + backpackID + "\nName: " + ((name == null) ? "Unknown" : name) +
                "\nCapacity: " + ((capacity == 0) ? "Unknown" : capacity ) + "\nBackpack system: " + this.getBackSystemDescription();
    }
}
