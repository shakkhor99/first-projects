import java.util.Scanner;

public class assign {

    public static void main(String[] args){

Scanner input = new Scanner (System.in);

int x,y;
System.out.println("Enter 2 numbers :");

x = input.nextInt();
y = input.nextInt();

x+= y;
System.out.println("x ="+x);

x-= y;
System.out.println("x ="+x);

x*= y;
System.out.println("x ="+x);

x/= y;
System.out.println("x ="+x);

x%= y;
System.out.println("x ="+x);

    }
}