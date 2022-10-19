import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su número: ");
        long n = sc.nextInt();
        long calculo = n%10;
        System.out.print("La ultima cifra es " + calculo);
        sc.close();
    }
}
