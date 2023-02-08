/**
 * Class: Circle
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * This class calculates the area and perimeter of a circle given the radius.
 */
public class Circle {
    public static void main(String[] args){
        double radius = 9.5;
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}
