/**
 * Class: Cycle
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * This class calculates the number of tricycles that are in a shop given the amount of wheels and amount of bicycles.
 */
public class Cycle {
    public static void main(String[] args){
        int wheels = 47;
        int bicycles = 10;
        int tricycleWheels = wheels - (bicycles * 2); //calculating how many of the wheels belong to tricycles
        int tricycles = tricycleWheels / 3; //calculating the number of tricycles if each one has 3 wheels.
        System.out.print("There are " + tricycles + " tricycles in the shop.");
    }
}
