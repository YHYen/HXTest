package main.java.com.itYan.Utils;

/**
 * This class contains all function to draw a diamond
 * */
public class DrawUtil {
    /**
     * print the upper half of the diamond
     * @param totalLayer how many layer upper half of the diamond has
     * */
    public static void positiveOutput(int totalLayer) {
        for (int currentLayer = 1; currentLayer <= totalLayer; currentLayer++) {
            drawLayer(totalLayer, currentLayer);
            System.out.println();
        }
    }

    /**
     * print the lower half of the diamond
     * @param totalLayer how many layer lower half of the diamond has
     * @param isOdd the total layer of diamond is odd or not
     * */
    public static void reverseOutput(int totalLayer, boolean isOdd) {
        if (isOdd) {
            for (int currentLayer = totalLayer-1; currentLayer > 0; currentLayer--) {
                drawLayer(totalLayer, currentLayer);
                System.out.println();
            }
        } else {
            for (int currentLayer = totalLayer; currentLayer > 0; currentLayer--) {
                drawLayer(totalLayer, currentLayer);
                System.out.println();
            }
        }
    }

    /**
     * another type of the diamond needs to print an extra star on the first layer of the lower half
     * @param totalLayer how many layer lower half of the diamond has
     * @param isOdd the total layer of diamond is odd or not
     * */
    public static void reverseOutputAnotherType(int totalLayer, boolean isOdd) {
        if (isOdd) {
            for (int currentLayer = totalLayer-1; currentLayer > 0; currentLayer--) {
                drawLayer(totalLayer, currentLayer);

                // here if the currentLayer is the first layer of the lower half,
                // needs to print an extra star
                if (currentLayer == totalLayer-1) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } else {
            for (int currentLayer = totalLayer; currentLayer > 0; currentLayer--) {
                drawLayer(totalLayer, currentLayer);

                // here if the currentLayer is the first layer of the lower half,
                // needs to print an extra star
                if (currentLayer == totalLayer) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

    /**
     * method to print space
     * @param totalLayer total layer of diamond to draw
     * @param currentLayer the number of layers currently being printed
     * */
    public static void drawSpace(int totalLayer, int currentLayer) {
        // middle layer does not need to print space
        // and the space needs to print on the upper or lower layer will increase by one
        for(int spaceAmount=totalLayer - currentLayer; spaceAmount>0; spaceAmount--) {
            System.out.print(" ");
        }
    }

    /**
     * method to print star
     * @param currentLayer the number of layers currently being printed
     * */
    public static void drawStar(int currentLayer) {
        // the number of stars to be printed on each layer is twice the current number of layers minus one
        for (int starAmount=0; starAmount<currentLayer*2-1; starAmount++) {
            System.out.print("*");
        }
    }

    /**
     * method to call print space method and print star method to print the current layer data
     * @param totalLayer total layer of diamond to draw
     * @param currentLayer the number of layers currently being printed
     * */
    public static void drawLayer(int totalLayer, int currentLayer) {
        drawSpace(totalLayer, currentLayer);
        drawStar(currentLayer);
    }

    /**
     * determine if the number is even
     * @param number number to judge
     * @return boolean return the number is even or not
     * */
    public static boolean isEven(int number) {
        return number%2 == 0;
    }

    /**
     * determine if the number is odd
     * @param number number to judge
     * @return boolean return the number is odd or not
     * */
    public static boolean isOdd(int number) {
        return number%2 != 0;
    }


}
