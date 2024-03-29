package java_how_to_program_book.ch_2;
import java.util.Scanner;
public class Q2_30 {
    public static void main(String[] args){
   /*2.30 (Separating the Digits in an Integer) Write an application that inputs
one number consisting of five digits from the user, separates the number
into its individual digits and prints the digits separated from one another
by three spaces each. For example, if the user types in the number 42339,
the program should print
4 2 3 3 9
Assume that the user enters the correct number of digits. What happens
when you enter a number with more than five digits? What happens when
you enter a number with fewer than five digits? [Hint: It’s possible to do
this exercise with the techniques you learned in this chapter. You’ll need to
use both division and remainder operations to “pick off ” each digit.]*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter five digit number");
        int number=input.nextInt();

        System.out.printf("%d",(number/10000));
        System.out.printf(" %d",(number%10000/1000));
        System.out.printf(" %d",(number%1000/100));
        System.out.printf(" %d",(number%100/10));
        System.out.printf(" %d",(number%10));

    }
}
