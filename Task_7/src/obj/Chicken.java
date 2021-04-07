package obj;

public class Chicken extends NonFlyingBird {

    public Chicken()
    {
        count++;
        id = count;
    }


    @Override
    public String toString() {
        return "Bird: Chicken" +
                "\nFeathers: " + feathers +
                "\nLayEggs: " + layEggs +
                "\nID: " + id;
    }
}
