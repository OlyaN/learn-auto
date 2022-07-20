 class Circle {
     public static final double PI = 3.14;

     public static double getSquare(double r) {
         double square = PI * (r * r);
         System.out.println(square);
         return square;
     }

     public static double getLength(double r) {
         double length = PI * 2 * r;
         System.out.println(length);
         return length;

     }

     public static void main(String args[]) {
         double r = 56.89;
         Circle.getSquare(r);
         Circle.getLength(r);


     }
 }


