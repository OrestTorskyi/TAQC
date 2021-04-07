package obj;

public class Swallow extends FlyingBird {

    public Swallow()
    {
        count++;
        id = count;
    }


    @Override
    public String toString() {
        return "Bird: Swallow" +
                "\nFeathers: " + feathers +
                "\nLayEggs: " + layEggs +
                "\nID: " + id;
    }
}
