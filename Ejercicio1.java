import java.util.Scanner;
public class Ejercicio1{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Introduzca el dia de la semana (1=lunes, 2=martes, 3=miércoles, 4=jueves, 5=viernes): ");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("A primera toca programación");
        }
        if (n==2){
            System.out.println("A primera toca sistemas informaticos");
        }
        if (n==3){
            System.out.println("A primera toca entornos de desarollo");
        }
        if (n==4){
            System.out.println("A primera toca programación");
        }
        if (n==5){
            System.out.println("A primera toca FOL");
        }
        if (n>5 || n<1)
        System.out.println("No lo he entendido");
        sc.close();
    }
}