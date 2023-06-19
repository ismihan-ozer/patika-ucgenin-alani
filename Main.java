import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz");
        a = girdi.nextInt();

        System.out.print("2. kenarı giriniz");
        b = girdi.nextInt();

        System.out.print("3. kenarı giriniz");
        c = girdi.nextInt();


        cevre = a+b+c ;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("üçgenin alanı :"+ alan);
    }
}