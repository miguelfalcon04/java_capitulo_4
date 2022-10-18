import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la hora: ");
        int h = sc.nextInt();
        if (h>=6 && h<= 12){
            System.out.println("Buenos días");
        }
        if (h>=13 && h<=20){
            System.out.println("Buenos tardes");
        }
        if ((h>=21 && h<= 5)||(h<5 && h>=0)){
            System.out.println("Buenos noches");
        }
        sc.close();
    }
}
