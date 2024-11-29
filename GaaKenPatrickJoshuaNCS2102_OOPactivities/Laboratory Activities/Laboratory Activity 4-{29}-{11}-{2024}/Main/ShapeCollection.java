public class ShapeCollection {
    private Shape[] shapes;

    public ShapeCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    public void getPropertyValues() {
        for (Shape shape:shapes) {
            String area = String.format("%.2f", shape.getArea());
            String perimeter = String.format("%.2f", shape.getPerimeter());

            System.out.println(shape.printShapeType());
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
            System.out.println();
        }
    }


}