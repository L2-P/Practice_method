
/**
 * Write a description of class Methods_Practice here.
 *
 * @author (Luke Logan)
 * @version (1.2)
 */
import java.util.Scanner;
public class Methods_Practice
{
   static void clearscreen() 
   {
       System.out.print('\u000C');       
   }
   static void INTRO()
   {
       System.out.println("Hello user. This program will allow you to calculate different equations.");
   }
   static void q()
   {
       System.out.println("Please select a number for X and Y. This calculater will give you the max number.");
       Scanner mynum = new Scanner(System.in);
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.max(X, Y));
   }
   static void w()
   {
       System.out.println("Please select a number for X and Y. This calculater will give you the minimum number.");
       Scanner mynum = new Scanner(System.in); 
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.min(X, Y));
   }
   static void e()
   {
       System.out.println("Please select a number for X. This calculater will find the square root of X.");
       Scanner mynum = new Scanner(System.in);
        double X = mynum.nextDouble();
        System.out.println(Math.sqrt(X));
   }
   static void r()
   {
       System.out.println("Please select a number for X. This calculater will find the absolute value of an equation.");
       Scanner mynum = new Scanner(System.in);
        double X = mynum.nextDouble();
        System.out.println(Math.abs(X));
   }
   static void t()
   {
       System.out.println("Please select a number for X. This calculater will give you a number between 0 and 1.");
        System.out.println(Math.random());
   }
   static void y()
   {
       System.out.println("Please select a number for X and Y. This calculater will take X and square it by Y.");
       Scanner mynum = new Scanner(System.in);
        double X = mynum.nextDouble();
        double Y = mynum.nextDouble();
        System.out.println(Math.pow(X, Y));
   }
   static void z()
   {
      System.out.println("Please select a number for X and Y. This calculater will tell you if X is greater than Y.");
      System.out.println("X > Y : true or false ");
      Scanner mynum = new Scanner(System.in);
        int x = mynum.nextInt();
        int y = mynum.nextInt();
    System.out.println(x > y); 
    
   }
   public static void main (String[] args){
    String play = "yes";
    Scanner inputScanner = new Scanner(System.in);
   while (play.equals("yes") || play.equals("Yes"))
    {
    clearscreen();
    INTRO();
    System.out.println("Please select math function you would like to use.");
    System.out.println("1 = Math.max(x,y)");
    System.out.println("2 = Math.min(x,y)");
    System.out.println("3 = Math.sqrt(x)");
    System.out.println("4 = Math.abs(x)");
    System.out.println("5 = Math.random()");
    System.out.println("6 = Math.pow(x,y)");
    System.out.println("7 = Boolean true false");
    Scanner mynum = new Scanner(System.in);
    int Decision = mynum.nextInt();
    if (Decision == 1)
    {
        q();
    }
    else if (Decision == 2)
    {
        w();
    }
    else if (Decision == 3)
    {
        e();
    }
    else if (Decision == 4)
    {
        r();
    }
    else if (Decision == 5)
    {
        t();
    }
    else if (Decision == 6)
    {
        y();
    }
    else if (Decision == 7)
    {
        z();
    }
    else
    {
        System.out.println("Please select a valid number");
    }
        System.out.println("Do you want to play again?");
    System.out.println("Please select yes or no.");
    System.out.println("Your choice:    ");
    play = inputScanner.next();

   }
}
}  