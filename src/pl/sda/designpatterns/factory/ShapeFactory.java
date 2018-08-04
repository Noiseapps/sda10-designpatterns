package pl.sda.designpatterns.factory;

public class ShapeFactory {

    public static void main(String... args) {
        ShapeFactory.makeShape(ShapeType.CIRCLE, 12);
        ShapeFactory.makeShape(ShapeType.RECT, 12, 20);
        ShapeFactory.makeShape(ShapeType.SQUARE, 12);
        ShapeFactory.makeShape(null, 12);
    }

    public static Shape makeShape(ShapeType shapeType, double... params) {
        switch (shapeType) {
            case RECT:
                return new Rect(params[0], params[1]);
            case SQUARE:
                return new Rect(params[0], params[0]);
            case CIRCLE:
                return new Circle(params[0]);
            default:
                throw new IllegalArgumentException();
        }
    }

    public enum ShapeType {
        CIRCLE, SQUARE, RECT
    }

}
