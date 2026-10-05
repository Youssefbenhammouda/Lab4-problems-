package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of sales people: ");
        final int SALESPEOPLE = scan.nextInt();
        System.out.println();
        int[] sales = new int[SALESPEOPLE];
        int sum;

        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int maxSalesId = -1;
        int minSalesId = -1;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1) + " " + sales[i]);
            sum += sales[i];

            if( maxSalesId < 0 || sales[i] > sales[maxSalesId]) maxSalesId = i;
            if( minSalesId < 0 || sales[i] < sales[minSalesId]) minSalesId = i;

        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average of sales: " + sum*1.0/SALESPEOPLE);
        System.out.println("Maximum: " + "Salesperson "+(maxSalesId+1)+" had the highest sale with $" + sales[maxSalesId]);
        System.out.println("Minimum: " + "Salesperson "+(minSalesId+1)+" had the lowest sale with $" + sales[minSalesId]);

        System.out.print("Please enter a value amount: ");
        int amount = scan.nextInt();
        int countExceeding = 0;
        System.out.println("Salespersons who exceeded that amount: ");
        for (int i = 0; i < sales.length; i++) {
            if(sales[i] > amount) {
                System.out.println("\t- Salesperson "+(i + 1) + " with " + sales[i]+"$");
                countExceeding++;
            }

        }
        System.out.println("\t("+countExceeding+" in total)");

    }
}