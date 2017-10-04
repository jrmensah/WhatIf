import java.util.Scanner;

// This program will allow the user to enter a sales record

public class TaxCode {
    public static void main(String [] args){
        int customerNum;
        double salesAmt, tax=0.00, total, subtotal;
        String name, taxCode;

        
        Scanner scan = new Scanner(System.in);


//        Enter Customer ID

        System.out.println("Customer ID:");
        customerNum = scan.nextInt();
        scan.nextLine();

//        Enter name

        System.out.println("Customer Name:");
        name = scan.nextLine();


//        Enter Sales Amount

        System.out.println("Sales Amount:");
        salesAmt = scan.nextDouble();


//        Enter Tax Code Amount

        System.out.println("Tax Code:");
        taxCode = scan.next();
        scan.nextLine();

//        Total of Sale
        switch (taxCode.toUpperCase()){
            case "NRM": tax = 0.06;
                        break;
            case "NPF": tax = 0.00;
                    break;
            case "BIZ": tax = 0.45;
                break;
        }

        subtotal = salesAmt * tax;
        total =salesAmt + subtotal;

//     Print receipt

        System.out.println("Customer ID:" + customerNum);
        System.out.println("Customer Name:" + name);
        System.out.println("Sales Amount: $" + salesAmt);
        System.out.println("Tax Code:" + taxCode.toUpperCase());
        System.out.println("Total Amount Due: $" + total);

    }
}
