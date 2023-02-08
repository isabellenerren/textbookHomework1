/**
 * Class: MaleStudent
 * @author: Isabelle Nerren
 * Course: ITEC 2140 - 04 Spring 2023
 * Written: February 8, 2023
 *
 * This class calculates the number of male students there are in a school given the total number of students and
 * the number of female students.
 */
public class MaleStudent {
    public static void main(String[] args){
        int students = 389;
        int fStudents = 175;
        int mStudents = students - fStudents;
        System.out.print("There are " + mStudents + " male students in this school.");
    }
}
