package decoratorpattern;

public class RectangleDecorator {
    
    protected Rectangle r;
    
    protected int a;
    protected int b;
    
    public RectangleDecorator(Rectangle r) {
        this.r = r;
        this.a = this.r.a;
        this.b = this.r.b;
    }
    
    public int perimeter()
    {
        return 2*(this.a*this.b);
    }
    
}
