import java.util.Scanner;

public class testRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width:");
        double width = sc.nextDouble();
        System.out.println("Enter the height:");
        double height = sc.nextDouble();
        rectangleClass rectangle = new rectangleClass(width, height);
        System.out.println("Your rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the rectangle: " + rectangle.getArea());
    }
}
