package com.main;

public class Main {
    private static final double c = -1.49;
    private static final double d = 23.4;// Initialization of all need constants

    private static final double sinSinC = Math.sin(Math.sin(c));
    private static final double lnLnD = 4*Math.log(Math.log(d)); // Initialization of constants to optimize calculation


    public static void main(String[] args) {
        int[][] array = new int[10][10]; //Creating of two-dimensional array sizeX x sizeY

        double maxValue = 0;
        /*
        * maxValue is 0 initially, because count of elements always is bigger than 0 and elementValue never is
        * smaller than 0;
        * */
        double elementValue; // buffer to contain value of each element
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++){
                elementValue = calculateElementValue(i, j);
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

    private static double calculateElementValue(int i, int j){
        return Math.sqrt(Math.abs(sinSinC - lnLnD/Math.pow(i, j)));
    }
}
