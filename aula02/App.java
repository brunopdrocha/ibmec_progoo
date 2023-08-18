package aula02;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String msg;
        double num1;
        int num2;

        System.out.println("Informe um texto");
        msg= leitor.next();
        System.out.println(msg);
        

        System.out.println("Informe um numero decimal/doubke");
        num1=leitor.nextDouble();
        System.out.println(num1);
        

        System.out.println("Informe um numero inteiro");
        num2 = leitor.nextInt();
        System.out.println(num2);

        leitor.close();
        System.out.println(msg.equals("oi"));
    }
}
