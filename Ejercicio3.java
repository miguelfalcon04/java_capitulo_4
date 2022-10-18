import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número del dia de la semana: ");
        int n = sc.nextInt();
        if (n==1){
            System.out.println("lunes");
        }
        if (n==2){
            System.out.println("martes");
        }
        if (n==3){
            System.out.println("miércoles");
        }
        if (n==4){
            System.out.println("jueves");
        }
        if (n==5){
            System.out.println("viernes");
        }
        if (n==6){
            System.out.println("sábado");
        }
        if (n==7){
            System.out.println("domingo");
        }
        if (n>7 || n<=0){
            System.out.println("Número no válido");
        }
        sc.close();
    }
}
