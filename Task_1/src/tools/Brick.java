package tools;

public class Brick {

    int a,b,c,x,y;

    public Brick(int a, int b, int c, int x, int y)
    {
     this.a = a;
     this.b = b;
     this.c = c;
     this.x = x;
     this.y = y;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void compareBrickToWindow()
    {
        String v1 = "Brick can pass through XY-window if AB-plane is parallel to it";
        String v2 = "Brick can pass through XY-window if BC-plane is parallel to it";
        String v3 = "Brick can pass through XY-window if AC-plane is parallel to it";
        String v4 = "Brick can pass through XY-window if AB-plane or BC-plane is parallel to it";
        String v5 = "Brick can pass through XY-window if AC-plane or BC-plane is parallel to it";
        String v6 = "Brick can pass through XY-window if AB-plane or AC-plane is parallel to it";
        String v7 = "Brick can pass by all planes through XY-window";
        String v8 = "Brick can't pass through window";

        System.out.println("--------------------------------Result----------------------------");
        System.out.println((((a <= x && b <= y) || (b <= x && a <= y)) && ((b <= x && c <= y) || (c <= x && b <= y))
                && ((a <= x && c <= y) || (c <= x && a <= y))) ? v7 :
                ((((a <= x && b <= y) || (b <= x && a <= y)) && ((b <= x && c <= y) || (c <= x && b <= y))) ? v4 :
                (((b <= x && c <= y) || (c <= x && b <= y)) && ((a <= x && c <= y) || (c <= x && a <= y))) ? v5 :
                (((a <= x && b <= y) || (b <= x && a <= y)) && ((a <= x && c <= y) || (c <= x && a <= y))) ? v6 :
                (((a <= x && b <= y) || (b <= x && a <= y)) ? v1 :
                ((b <= x && c <= y) || (c <= x && b <= y)) ? v2 :
                ((a <= x && c <= y) || (c <= x && a <= y)) ? v3 : v8)));
    }

 /*   public void compareBrickToWindowVariant2()
    {
        if( a <= x && b <= y) {
            if(b <= x && c <= y) {
                if(c <= x && a <= y) {
                    System.out.println("Brick can pass by all planes through XY-window");
                }
                else {
                    System.out.println("Brick can pass through XY-window if AB-plane or BC-plane is parallel to it");
                }
            }
            else if(c <= x && a <= y) {
                System.out.println("Brick can pass through XY-window if AB-plane or AC-plane is parallel to it");
            }
            else {
                System.out.println("Brick can pass through XY-window if AB-plane is parallel to it");
            }
        }
        else if( b <= x && c <= y) {
            if(a <= x && c <= y) {
                if(a <= x && b <= y) {
                    System.out.println("Brick can pass by all planes through XY-window ");
                }
                else {
                    System.out.println("Brick can pass through XY-window if AC-plane or BC-plane is parallel to it");
                }
            }
            else if(a <= x && b <= y) {
                System.out.println("Brick can pass through XY-window if AB-plane or BC-plane is parallel to it");
            }
            else {
                System.out.println("Brick can pass through window if BC-plane is parallel to it");
            }
        }
        else if( a <= x && c <= y) {
            if(a <= x && b <= y) {
                if(b <= x && c <= y) {
                    System.out.println("Brick can pass by all planes through XY-window ");
                }
                else {
                    System.out.println("Brick can pass through XY-window if AB-plane or AC-plane is parallel to it");
                }
            }
            else if(b <= x && c <= y) {
                System.out.println("Brick can pass through XY-window if BC-plane or AC-plane is parallel to it");
            }
            else {
                System.out.println("Brick can pass through window if AC-plane is parallel to it");
            }
        }
        else {
            System.out.println("Brick can't pass through window");
        }
    }

*/

    @Override
    public String toString() {
        return  "Your object:" +
                "--------------Brick--------------" + "\n" +
                "Length = " + a + "\n" +
                "Width = " + b + "\n" +
                "Height = " + c + "\n" +
                "--------------Window------------" +
                "Length = " + x +
                "Width = " + y;
    }
}
