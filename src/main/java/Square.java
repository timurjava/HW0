public class Square implements Figure {
    final double firstSide;

    public Square(double firstSide){
        this.firstSide = firstSide;
    }

    public double square(){
        return firstSide * firstSide;
    }
}
