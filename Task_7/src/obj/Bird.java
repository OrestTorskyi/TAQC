package obj;

public abstract class Bird {
    public abstract void fly();

    final protected boolean feathers = true;
    final protected boolean layEggs = true;
    public static int count;
    protected int id;

    public int getId() {
        return id;
    }

    public boolean getFeathers() {
        return feathers;
    }

    public boolean getLayEggs() {
        return layEggs;
    }

    @Override
    public String toString() {
        return "Bird №:" + id +
                "\nFeathers: " + feathers +
                "\nLayEggs: " + layEggs;
    }
}
