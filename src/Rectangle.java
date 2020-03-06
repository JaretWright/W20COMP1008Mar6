public class Rectangle implements TwoDimensionalShape{
    private double length, width;

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length>0)
            this.length = length;
        else
            throw new IllegalArgumentException("length must be >0");
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("width must be >0");
    }

    public boolean isSquare() {
        return length==width;
    }

    public double getArea() {
        return length*width;
    }
}
