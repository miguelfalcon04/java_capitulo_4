public class Ejercicio1{
    public static void main (String[] args){
        String dia;
        System.out.print("Introduzca el dia de la semana: ");
        dia = System.console().readLine();
        dia = dia.toLowerCase(); // convierte a minúsculas todas las letras

        switch(dia) {
            case "lunes":
            case "jueves":
            System.out.println("A primera toca programación");
            break;
            case "martes":
            System.out.println("A primera toca sistemas informaticos");
            break;
            case "miercoles":
            case "miércoles":
            System.out.println("A primera toca entornos de desarollo");
            break;
            case "viernes":
            System.out.println("A primera toca FOL");
            break;
            case "sabado":
            case "domingo":
            case "sábado":
            System.out.println("No hay clases");
        }
    }
}
