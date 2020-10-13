class ShapeCalculator {

    double squareArea(Square square) {
        return square.side * square.side;
    }

    double circleArea(Circle circle) {
        return circle.radius * 3.14;
    }

    double trianglePerimeter(Triangle triangle) {
        return triangle.base + triangle.side1 + triangle.side2;
    }

    double rectPerimeter(Rectangle rectangle) {
        return (rectangle.side1 + rectangle.side2) * 2;
    }

}
