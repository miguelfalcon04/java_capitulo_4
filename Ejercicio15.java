import java.util.Scanner;
public class Ejercicio15{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("este programa pinta una pirámide");
      System.out.print("Introduzca el caracter para rellenar la pirámide: ");
      String r = System.console().readLine();
      System.out.println("Elija 1 para que la pirámide este hacia arriba");
      System.out.println("Elija 2 para que la pirámide este invertida");
      System.out.println("Elija 3 para que la pirámide este hacia la derecha");
      System.out.println("Elija 4 para que la pirámide este hacia la izquierda");
      int n = sc.nextInt();
      if (n==1){
        System.out.println("   " + r);
        System.out.println("  "+ r+r+r);
        System.out.println(" "+r+r+r+r+r);
      }
      if (n==2){
        System.out.println(" "+r+r+r+r+r);
        System.out.println("  "+ r+r+r);
        System.out.println("   " + r);
      }
      if (n==3){
        System.out.println(r);
        System.out.println(r+ " "+r);
        System.out.println(r+ " "+r + " " +r);
        System.out.println(r+ " "+r);
        System.out.println(r);
      }
      if (n==4){
        System.out.println("    "+r);
        System.out.println("  "+r+" " +r);
        System.out.println(r+ " "+r + " " +r);
        System.out.println("  "+r+" "+r);
        System.out.println("    "+r);
      }
      sc.close();
    }
}


