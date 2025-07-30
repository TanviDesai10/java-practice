import java.util.Scanner;
public class OnlineShop{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

String category, item;
int quantity;
double price;

    System.out.println("Hello Customer ! ");
    System.out.print("Add category vegetable or fruit: ");
    category = sc.next();
    System.out.print("Add the " + category + " You want to buy: ");
    item = sc.next();
    System.out.print("Enter quantity: ");
    quantity = sc.nextInt();
    if(quantity >2 ){
        price = 2.00 ;
    }
    else{
       price = 1.00;
    }

    System.out.println("you selected " + category + " - " + item);
    System.out.println("quantity: " + quantity);
    System.out.println("Price per item $ " + price);
    System.out.println("Total price: $ " + (price * quantity));

    System.out.println("THANK YOU VISIT AGAIN ! ");

    sc.close();
    }
}
