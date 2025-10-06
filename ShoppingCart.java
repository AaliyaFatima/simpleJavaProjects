import java.util.Scanner;
public class ShoppingCart {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the item you want to buy: ");
        String item=sc.nextLine();

        System.out.print("Set the price for the item: $");
        double price=sc.nextDouble();

        System.out.print("How many "+item+" you wanna buy: ");
        int num=sc.nextInt();

        double total=price * num;
        System.out.print("The total cost of your "+item+" (s)"+ " will be $ "+total);
        sc.close();

    }

}
