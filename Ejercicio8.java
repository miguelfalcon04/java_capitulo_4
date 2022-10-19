import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera nota: ");
        double n1 = sc.nextFloat();
        System.out.print("Segunda nota: ");
        double n2 = sc.nextFloat();
        System.out.print("Tercera nota: ");
        double n3 = sc.nextFloat();
        double nota = ((n1+ n2 +n3)/3);
        System.out.printf("La nota media es de: %.2f \n", nota);
        sc.close();
        if (nota>=9){
            System.out.print("Sobresaliente");
        }
        if (nota>=7 && nota<9){
            System.out.print("Notable");
        }
        if (nota>=5 && nota <7){
            System.out.print("Bien");
        }
        if (nota>=3 && nota <5){
            System.out.print("Suficiente");
        }
        if (nota>=0 && nota <3){
            System.out.print("Insuficiente");
        }
    }
}
