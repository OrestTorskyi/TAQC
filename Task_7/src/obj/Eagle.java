package obj;

public class Eagle extends FlyingBird {



    public Eagle()
    {
        count++;
        id = count;
    }

    @Override
    public String toString() {
        return "Bird: Eagle" +
                "\nFeathers: " + feathers +
                "\nLayEggs: " + layEggs +
                "\nID: " + id;
    }
}
