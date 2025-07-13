
public class Rectangle {
    int length;
    int width;

    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(7, 8);

        int area1 = r1.calculateArea();
        int area2 = r2.calculateArea();
        System.out.println("Area of Rectangle 1: " + area1);
        System.out.println("Area of Rectangle 2: " + area2);

        if (area1 > area2)
        {
            System.out.println("Rectangle1 is greater");
        }
        else if (area1 < area2)
        {
            System.out.println("Rectangle1 is smaller");
        }
        else
        {
            System.out.println("They are equal");
        }
    }
}

