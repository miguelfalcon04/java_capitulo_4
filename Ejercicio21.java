import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Nota del primer examen: ");
        float n1 = sc.nextInt();
        System.out.print("Nota del segundo examen: ");
        float n2 = sc.nextInt();
        float calculo = (n1+n2)/2;
        if (calculo>=5){
            System.out.print("Tu nota es de: "+calculo);
        }
        if (calculo<5){
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto(1)/no apto(2)): ");
            int n = sc.nextInt();
            if (n == 1){
                System.out.print("Tu nota de Programación es 5");
            }
            else{
                System.out.print("Tu nota de programación es: "+calculo);
            }
        }
        sc.close();
    }
}
