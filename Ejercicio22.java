import java.util.Scanner;
public class Ejercicio22{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te dire cuantos minutos quedan para el finde ");
        System.out.println("Introduzca la fecha actual ");
        System.out.println("Dia: ");
        String dia=sc.next();
        System.out.println("Hora: ");
        int hora= sc.nextInt();
        System.out.println("Minutos: ");
        int min= sc.nextInt();
        int minutos_dia=1440;
        if(dia.equals("lunes")){
            int minutos_total= minutos_dia*4+900-hora*60-min;
            System.out.print("Quedan "+minutos_total+" minutos");
        }
        if(dia.equals("martes")){
            int minutos_total= minutos_dia*3+900-hora*60-min;
            System.out.print("Quedan "+minutos_total+" minutos");
        }
        if(dia.equals("miercoles")){
            int minutos_total= minutos_dia*2+900-hora*60-min;
            System.out.print("Quedan "+minutos_total+" minutos");
        }
        if(dia.equals("jueves")){
            int minutos_total= minutos_dia+900-hora*60-min;
            System.out.print("Quedan "+minutos_total+" minutos");
        }
        if(dia.equals("viernes")){
            int minutos_total= 900-hora*60-min;
            System.out.print("Quedan "+minutos_total+" minutos");
        }
        sc.close();
        }
}