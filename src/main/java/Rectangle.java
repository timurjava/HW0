public class Rectangle implements Figure{
    final double  firstSide;
    final double  secondSide;

   public  Rectangle (double firstSide,double secondside){
        this.firstSide = firstSide;
        this.secondSide = secondside;
    }

    public double square(){
       return firstSide * secondSide;
    }
}
