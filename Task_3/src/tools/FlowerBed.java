package tools;

public class FlowerBed {
    int radius;

    public FlowerBed(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }


    public double calculatePerimeter(int radius)
    {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double calculateArea(int radius)
    {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

    @Override
    public String toString() {
        return "Flower Bed:" + "\n" +
               "Radius = " + radius + "\nPerimeter: " + String.format("%.2f",calculatePerimeter(radius)) +
                "\nArea: " +  String.format("%.2f",calculateArea(radius));
    }
}
