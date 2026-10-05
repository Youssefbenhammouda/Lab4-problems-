package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSalesId = -1;
        int minSalesId = -1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + i + " " + sales[i]);
            sum += sales[i];

            if( maxSalesId < 0 || sales[i] > sales[maxSalesId]) maxSalesId = i;
            if( minSalesId < 0 || sales[i] < sales[minSalesId]) minSalesId = i;

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average of sales: " + sum*1.0/SALESPEOPLE);
        System.out.println("Maximum: " + "Salesperson "+maxSalesId+" had the highest sale with $" + sales[maxSalesId]);

        System.out.print("Please enter a value amount: ");
        int amount = scan.nextInt();
        int countExceeding = 0;
        System.out.print("\nSalespersons who exceeded that amount: ");
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] > amount) System.out.print(i + " ");
            countExceeding++;
        }
        System.out.println(" ("+countExceeding+" in total)");

    }
}