// Uniform Shop (BPSU)
// Created by Christiane A. Bacani
import java.util.Scanner;
public class UniformShopBPSU {
    public static void male(){
        Scanner input = new Scanner(System.in);
        System.out.print("     BOYS UNIFORM\n");
        System.out.print("POLO\t\tPRICE\n");
        System.out.print("1.) S\t\tP 780\n");
        System.out.print("2.) M\t\tP 800\n");
        System.out.print("3.) L\t\tP 820\n");
        System.out.print("4.) XL\t\tP 840\n");
        
        System.out.print("Enter your choice here : ");
        String choice = input.nextLine();
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        int total = 780 * quantity;
        System.out.print("The total price is : P " + total + "\n");
        
        System.out.print("Enter your payment here : P ");
        int payment = input.nextInt();
        
        int change = payment - total;
        System.out.print("Change : P " + change);
    }
    public static void female(){
        Scanner input = new Scanner(System.in);
        System.out.print("     GIRLS UNIFORM\n");
        System.out.print("BLOUSE\t\tPRICE\n");
        System.out.print("1.) S\t\tP 780\n");
        System.out.print("2.) M\t\tP 800\n");
        System.out.print("3.) L\t\tP 820\n");
        System.out.print("4.) XL\t\tP 840\n");
        
        System.out.print("Enter your choice here : ");
        String choice = input.nextLine();
        
        System.out.print("Enter quantity : ");
        int quantity = input.nextInt();
        
        int total = 780 * quantity;
        System.out.print("The total price is : P " + total + "\n");
        
        System.out.print("Enter your payment here : P ");
        int payment = input.nextInt();
        
        int change = payment - total;
        System.out.print("Change : P " + change);
    }
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        boolean sell = true;        
        System.out.print("Welcome to BPSU Uniform Shop!\n");
        System.out.print("Press enter to start : ");
        String pressEnter = input.nextLine();
        
        System.out.print("Are you a male or female ? (m/f) : ");
        String gender = input.nextLine();
        
        if(gender.equalsIgnoreCase("m")){
            male();
        }
        else if(gender.equalsIgnoreCase("f")){
        female();
        
        }
        else{
            System.out.print("\n\nINVALID CHOICE!");
        }
        
        
        
        
    }
}
