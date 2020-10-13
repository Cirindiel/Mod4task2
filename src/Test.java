public class Test {
    public static void main(String[] args) {

        ShapeCalculator calc = new ShapeCalculator();

        Square square = new Square(1.1);
        Circle circle = new Circle(4.4);
        Rectangle rectangle = new Rectangle(1.5, 1.8);
        Triangle triangle = new Triangle(3.3, 5.8, 6.1);

        System.out.println("Pole kwadratu wynosi: " + calc.squareArea(square));
        System.out.println("Pole koła wynosi: " + calc.circleArea(circle));
        System.out.println("Obwód prostokąta wynosi: " + calc.rectPerimeter(rectangle));
        System.out.println("Obwód trójkąta wynosi: " + calc.trianglePerimeter(triangle));
    }
}
