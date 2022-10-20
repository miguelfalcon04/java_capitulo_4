import java.util.Scanner;
public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio = 0;
        System.out.print("Elija un sabor (1.manzana, 2.fresa o 3.chocolate): ");
        int s = sc.nextInt();
        int nata =0;
        int nom = 0;
        if (s ==1 ){
            precio=precio+18;
            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();
            if (nata==1){
                precio=precio+2.50;
            }
            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();
            if (nom==1){
                precio=precio+2.75;
            }
            System.out.print("Total " + precio + " euros");
        }
        if (s ==2 ){
            precio=precio+16;
            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();
            if (nata==1){
                precio=precio+2.50;
            }
            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();
            if (nom==1){
                precio=precio+2.75;
            }
            System.out.print("Total " + precio + " euros");
        }
        if (s ==3 ){
            System.out.print("¿Qué tipo de chocolate quiere? (1. Blanco 2.Negro): ");
            int choco= sc.nextInt();
            if (choco==1){
                precio=precio+15;
            }
            if (choco==2){
                precio+=14;
            }
            System.out.print("¿Quiere nata? (1.Si 2.No): ");
            nata = sc.nextInt();
            if (nata==1){
                precio=precio+2.50;
            }
            System.out.print("¿Quiere ponerle un nombre? (1.Si 2.No): ");
            nom = sc.nextInt();
            if (nom==1){
                precio=precio+2.75;
            }
            System.out.print("Total " + precio + " euros");
        }
        sc.close();
    }

}
