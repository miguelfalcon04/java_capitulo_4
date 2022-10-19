import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Primera nota: ");
        float n1 = sc.nextFloat();
        System.out.print("Segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.print("Tercera nota: ");
        float n3 = sc.nextFloat();
        System.out.print("La nota media es de: "+ ((n1+ n2 +n3)/3));
        sc.close();
    }
}
