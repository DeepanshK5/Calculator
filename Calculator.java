package Calculator;
import java.lang.foreign.AddressLayout;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Addition = "+ Addition.add(num1,num2));
        System.out.println("Addition = "+ Subtraction.sub(num1,num2));
        System.out.println("Addition = "+ Multiplication.mul(num1,num2));
        System.out.println("Addition = "+ Division.div(num1,num2));
    }
}
