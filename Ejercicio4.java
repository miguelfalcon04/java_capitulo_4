import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca las horas trabajadas: ");
        int h = sc.nextInt();
        if (h<=40){
            System.out.print("Su salario será de: "+ (h*12) + "euros");
        }
        if (h>40){
            int hextra = h-40;
            int hnormales = h-hextra;
            System.out.print("Su salario será de: "+ ((hnormales*12)+(hextra*16)) + " euros");
        }
        sc.close();
    }
}
