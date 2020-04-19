import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        double num1, num2, result;
        Scanner scannerVariable = new Scanner(System.in);
        System.out.println("Number 1");
        num1=scannerVariable.nextDouble();
        System.out.println("Number2");
        num2=scannerVariable.nextDouble();
        result=num1+num2;
        System.out.println("Result:" + result);
        result=num1-num2;
        System.out.println("Result:" - result);
        result=num1/num2;
        System.out.println("Result:" / result);
        result=num1*num2;
        System.out.println("Result:" * result);
    }
}
