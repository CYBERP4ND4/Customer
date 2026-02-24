import java.util.Scanner;

public class MainCustomer {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        customer customer1 = new customer();

        //delcared
        /* 
        customer1.setNumber(1);
        customer1.setName("Frinz Pineda");
        customer1.setAddress("Nuevo Vista Ville San Jose Magalang, Pampanga");
        customer1.setDescription("IPHONE 17 PRO MAX");
        customer1.setPrice(100000);
        customer1.setQuantity(1);
        customer1.setModePayment(1);
        System.out.println("******************");
        customer1.display();*/

        //Input
        System.out.print("Enter Customer #: ");
        customer1.setNumber(input.nextInt()); input.nextLine();
        System.out.print("Enter Name: ");
        customer1.setName(input.nextLine());
        System.out.print("Enter Address: ");
        customer1.setAddress(input.nextLine());
        System.out.print("Enter Item Description: ");
        customer1.setDescription(input.nextLine());
        System.out.print("Enter Price: PHP ");
        customer1.setPrice(input.nextDouble());
        System.out.print("Enter Quantity: ");
        customer1.setQuantity(input.nextInt());
        System.out.print("Mode of Payment");
        System.out.println("\t[1]\tCash\tLess than 5%");
        System.out.println("\t[2]\tInstallment\tPlus 5%");
        System.out.println("\t[3]\tInstallment\tPlus 10%");
        System.out.print("Enter Mode of Payment: ");
        customer1.setModePayment(input.nextInt());
        
        System.out.println("******************");
        customer1.display();

   }
}
