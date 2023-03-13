package main.java.com.itYan.Test.Draw;

import main.java.com.itYan.Method.Draw.DrawDiamond;

import java.util.Scanner;

/**
 * main class to call draw utils to draw the diamond
 * */
public class DrawDiamondTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user input the total number of layers of the diamond to be drawn
        //System.out.println("Please enter how many layer your diamond have: ");
        //int totalLayer = sc.nextInt();
        int totalLayer = 7;

        // call Draw util to draw diamond
        // draw normal diamond
        System.out.println("=======Normal Diamond=======");
        DrawDiamond.drawDiamond(totalLayer);

        // draw another diamond
        System.out.println("=======Another Type Diamond=======");
        DrawDiamond.drawAnotherTypeDiamond(totalLayer);
    }
}
