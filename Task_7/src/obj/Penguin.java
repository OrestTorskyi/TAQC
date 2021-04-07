package obj;

public class Penguin extends NonFlyingBird{

    public Penguin()
    {
        count++;
        id = count;
    }

    @Override
    public void fly()
    {
        System.out.println("This species can't fly, but can swim!");
    }

    @Override
    public String toString() {
        return "Bird: Penguin" +
                "\nFeathers: " + feathers +
                "\nLayEggs: " + layEggs +
                "\nID: " + id;
    }
}
