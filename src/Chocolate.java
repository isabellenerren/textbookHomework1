/**
 * Class: Chocolate
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * This class calculates the number of bags needed to fit the number of chocolate bars provided if 3 will fit in one bag.
 */
public class Chocolate {
    public static void main(String[] args){
        int bars = 9 * 2; //calculating the number of chocolate bars there are
        int bags = bars / 3; //calculating how many bags are needed if there are three bars in each
        System.out.print("If there are " + bars + " chocolate bars and three can fit in each bag, you will need " + bags + " bags.");
    }
}
