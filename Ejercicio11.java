import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la hora en la que se encuentra: ");
        double h = sc.nextDouble();
        System.out.print("Introduzca los minutos en la que se encuentra: ");
        double m = sc.nextDouble();
        double horas = 24-h;
        double min = 60-m;
        double segundos = ((horas*3600)+(min*60));
        System.out.print("Quedan " + (int)segundos + " segundos para media noche");
        sc.close();
    }
}
