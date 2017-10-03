import java.util.Scanner;

// This program will allow the user to enter a sales record

public class TaxCode {
    public static void main(String [] args){
        int num1 =101;
        int salesAmt=500;
        int taxCode= 0;
        int total = salesAmt *taxCode + salesAmt;

        String name;

        Scanner keyboard = new Scanner(System.in);


//        Enter Customer ID

        System.out.println("Customer ID:");
        num1 = keyboard.nextInt();
        keyboard.nextLine();

//        Enter name

        System.out.println("Customer Name:");
        name = keyboard.nextLine();
        keyboard.nextLine();

//        Enter Sales Amount

        System.out.println("Sales Amount:");
        salesAmt = keyboard.nextInt();
        keyboard.nextLine();

//        Enter Tax Code Amount

        System.out.println("Tax Code:");
        taxCode = keyboard.nextInt();
        keyboard.nextLine();

//        Total of Sale

        System.out.println("Total Amount Due:" + salesAmt);
        total = keyboard.nextInt();
        keyboard.nextLine();


//     Print recipt

        System.out.println("Customer ID:" + num1);
        System.out.println("Customer Name:" + name);
        System.out.println("Sales Amount:" + salesAmt);
        System.out.println("Tax Code:" + taxCode);
        System.out.println("Total Amount Due:" + total);

    }
}
