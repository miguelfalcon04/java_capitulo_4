import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su número: ");
        int n = sc.nextInt();
        if (n<10){
            System.out.println("El primer número es " +n);
        }
        if (n>=10 && n<100){
            System.out.println("El primer número es " +n/10);
        }
        if (n>=100 && n<1000){
            System.out.println("El primer número es " +n/100);
        }
        if (n>=1000 && n<10000){
            System.out.println("El primer número es " +n/1000);
        }
        if (n>=10000){
            System.out.println("El primer número es " +n/10000);
        }
        sc.close();
    }
}
