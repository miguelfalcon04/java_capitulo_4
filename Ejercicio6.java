import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args){
        float g = 9.8f;
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzcala altura:");
        float h = sc.nextFloat();
        if (h>=0)
        System.out.printf("El objeto tarda %.2f segundos en caer", Math.sqrt(2*h/g));
        sc.close();
    }
}
