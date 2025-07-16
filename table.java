import java.util.Scanner;
public class table {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want the table: ");
        int num = sc.nextInt();
        System.out.println(" Multiplication of table " + num + ":");
        for (int i = 1; i<=10; i++){
            System.out.println(num + "x" + i + " = " + (num * i));
        }

        sc.close();
    }
}
