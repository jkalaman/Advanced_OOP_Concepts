import java.awt.*;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square implements Shape {
    double length;
    String name;
    public void setSquare(double dbl, String n) {
        name = n;
        this.length = dbl;
    }

//    @Override
    public double getArea() {
        return this.length*this.length;
    }

//    @Override
    public double getPerimeter(){
        return (4*this.length);
    }

//    @Override
    public boolean equals (Object o) {
        if (o == null)
            return false;
        if(!(o instanceof Square))
            return false;
        Square other = (Square)o;
        if (other.name.equals(this.name) && other.length == this.length)
            return true;
        else
            return false;
    }

//    @Override
    public String toString(){
        String str = this.name + ":" + this.length;
        return str;
    }


    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }
}