package decoratorpattern;

public class DecoratorPattern {

    public static void main(String[] args) {
        RectangleDecorator rectangleDecorator = new RectangleDecorator(new Rectangle(2, 3));
        
        System.out.println(rectangleDecorator.r.area());
        System.out.println(rectangleDecorator.perimeter());
    }
    
}
