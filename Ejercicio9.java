import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de segundo grado del tipo ax^2 + bx + c = 0");
        System.out.print("Introduzca el valor de a: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca el valor de b: ");
        double b = sc.nextDouble();
        System.out.print("Introduzca el valor de c: ");
        double c = sc.nextDouble();
        double operacion = (-b+Math.sqrt((b*b)-4*a*c))/2*a;
        double operacion2 = (-b-Math.sqrt((b*b)-4*a*c))/2*a;
        System.out.println("Las soluciones son: ");
        System.out.println(operacion);
        System.out.println(operacion2);
        sc.close();
    }
}
