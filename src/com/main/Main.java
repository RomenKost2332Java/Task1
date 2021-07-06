package com.main;

public class Main {
    public static void main(String[] args) {
        final int sizeX = 10;
        final int sizeY = 8;
        final double c = -1.49;
        final double d = 23.4; // Initialization of all need constants

        final double sinSinC = Math.sin(Math.sin(c));
        final double lnLnD = 4*Math.log(Math.log(d)); // Initialization of constants to optimize calculation

        int[][] array = new int[sizeX][sizeY]; //Creating of two-dimensional array sizeX x sizeY

        double maxValue = 0;
        /*
        * maxValue is 0 initially, because count of elements always is bigger than 0 and elementValue never is
        * smaller than 0;
        * */
        double elementValue; // buffer to contain value of each element
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                elementValue = Math.sqrt(Math.abs(sinSinC - lnLnD/Math.pow(i, j)));
                if (elementValue > maxValue)
                    maxValue = elementValue;
            }
        }
        System.out.println("The max value of element is "+maxValue+"."); // deduce max value of element

        /* comment to answer
        * The answer always is infinity, because every array have element with indexes i=0, j=0, because of that we
        * always have element value sqrt(abs(const1 - const2/0^0)) = sqrt(abs(const1 - const2/0)) =
        * = sqrt(abs(const1 - infinity)) = sqrt(infinity) = infinity
        * */
    }
}
