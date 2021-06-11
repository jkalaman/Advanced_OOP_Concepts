import java.awt.Shape;

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
    }

//    @Override
    public String toString(){
        String str = this.name + ":" + this.length;
        return str;
    }




}