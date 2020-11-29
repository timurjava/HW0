public class Circle implements Figure{
    final double radius;


    public Circle(double radius){
        this.radius = radius;
    }
    public double square(){
        return Math.PI * Math.pow(radius, 2);
    }
}
