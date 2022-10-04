import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double Tank = 0;
        double gasCost = 0;
        double milage = 0;
        double total = 0;
        double cost = 0;
        String trash ="";

        System.out.print("Enter the Number of gallons in the Tank");
        if(in.hasNextDouble())
        {
            Tank = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said your gallons was:"  + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        System.out.print("Enter the cost of gas");
        if(in.hasNextDouble())
        {
            gasCost = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the cost was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        System.out.print("What is the milage per gallon");
        if(in.hasNextDouble())
        {
            milage = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou said the milage was: " + trash);
            System.out.println("Run the program again and enter a valid amount!");
            System.exit(0);
        }
        double totalGallons = 100/milage;
        cost = totalGallons * gasCost;
        System.out.println("The cost per 100 miles: $"+cost);



    }
}