/**
 * Class: FindX
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * This class calculates the value of X given the formula 5 + 19 + X + 47 = 194
 */
public class FindX {
    public static void main(String[] args){
        int total = 194;
        int numOne = 5;
        int numTwo = 19;
        int numThree = 47;
        int X = total - numOne - numTwo - numThree;
        System.out.print("Based on the formula provided, the number X = " + X + ".");
    }
}
