import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduzca el valor de a: ");
        int a = sc.nextInt();
        System.out.print("Introduzca el valor de b: ");
        int b = sc.nextInt();
        if (a==0){
            System.out.print("No tiene solución real.");
        }
        else {
            System.out.print("La solución es: " + (-b/a));
        }
        sc.close();
    }
}
