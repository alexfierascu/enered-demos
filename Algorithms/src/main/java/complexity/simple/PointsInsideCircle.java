package complexity.simple;

import static java.lang.Math.pow;

//How to know if a point is inside a circle?
//https://math.stackexchange
// .com/questions/198764/how-to-know-if-a-point-is-inside-a-circle
public class PointsInsideCircle {

    public static void main(String[] args) {
        boolean flag = false;
        int n = 1000000;
        while (!flag) {
            if (ceva(n) - Math.PI <= 0) {
                System.out.println("increase precision");
                n += 100;
                flag = false;
            } else {
                System.out.println("the most valuable n " +
                        "is " + n);
                flag = true;
            }
        }

    }

    public static double ceva(int n) {

        int numberOfPointsInCircle = 0;
        int numberOfPointsInSquare = 0;
        int circleRadius = 1;
        for (int i = 0; i < n; i++) {
            //generates a random number between 0 and 1
            double x = Math.random();
            double y = Math.random();
            System.out.println("x=" + x + ",y=" + y);
            double distance = pow(x, 2) + pow(y, 2);
            if (distance <= circleRadius) {
                numberOfPointsInCircle += 1;
            }
            numberOfPointsInSquare += 1;
        }
        double ratio = (double) (4 * numberOfPointsInCircle) / numberOfPointsInSquare;
        System.out.println("ratio= " + ratio);
        return ratio;
    }
}
