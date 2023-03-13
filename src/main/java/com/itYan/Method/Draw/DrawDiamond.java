package main.java.com.itYan.Method.Draw;

import main.java.com.itYan.Utils.DrawUtil;

public class DrawDiamond {
    /**
     * main method to draw diamond
     * @param totalLayer how many layer the diamond has
     * */
    public static void drawDiamond(int totalLayer) {
        // because the printing logic of even-numbered layers and odd-numbered layers is different
        // need to judge whether it is an even-numbered or an odd-numbered layer
        boolean isOdd = DrawUtil.isOdd(totalLayer);

        // if it is odd need to add one layer to let it print one more layer
        if (isOdd) {
            totalLayer++;
        }

        // print diamond is divided into the upper half and the lower half,
        // so it needs to be processed in half
        totalLayer /= 2;

        // print the upper half of the diamond
        DrawUtil.positiveOutput(totalLayer);

        // print the lower half of the diamond
        DrawUtil.reverseOutput(totalLayer, isOdd);
    }

    /**
     * main method to draw diamond in another type
     * @param totalLayer how many layer the diamond has
     * */
    public static void drawAnotherTypeDiamond(int totalLayer) {
        // because the printing logic of even-numbered layers and odd-numbered layers is different
        // need to judge whether it is an even-numbered or an odd-numbered layer
        boolean isOdd = DrawUtil.isOdd(totalLayer);

        // if it is odd need to add one layer to let it print one more layer
        if (isOdd) {
            totalLayer++;
        }

        // print diamond is divided into the upper half and the lower half,
        // so it needs to be processed in half
        totalLayer /= 2;

        // print the upper half of the diamond
        DrawUtil.positiveOutput(totalLayer);

        // here is different place, to print an extra star on the next layer of the middle layer
        // need to use another method to print the lower half of the diamond
        DrawUtil.reverseOutputAnotherType(totalLayer, isOdd);
    }

    /**
     * another method to draw diamond, without dividing it into upper and lower parts
     * @param totalLayer how many layer the diamond has
     * */
    public static void drawDiamondWithOneLoop(int totalLayer) {
        int currentLayer = 1;
        for (int i = 0; i < totalLayer; i++) {
            if (DrawUtil.isEven(totalLayer)) {
                if (currentLayer > totalLayer/2) {
                    int redundantLayer = ((currentLayer - (totalLayer / 2)) * 2 - 1);
                    DrawUtil.drawLayer((totalLayer)/2, currentLayer - redundantLayer);
                    currentLayer++;
                    continue;
                }
            } else {
                if (currentLayer > (totalLayer + 1)/2) {
                    int redundantLayer = ((currentLayer - ((totalLayer + 1) / 2)) * 2);
                    DrawUtil.drawLayer((totalLayer+1)/2, currentLayer - redundantLayer);
                    currentLayer++;
                    continue;
                }
            }

            DrawUtil.drawLayer((totalLayer+1)/2, currentLayer);
            currentLayer++;
        }
    }
}
