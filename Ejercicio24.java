import java.util.Scanner;
public class Ejercicio24{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Con este programa te hare una nómina ");
        System.out.println("1-Programador junior ");
        System.out.println("2-Programador senior ");
        System.out.println("3-Jefe de proyecto ");
        System.out.println("Introduzca el cargo del empleado (1 - 3): ");
        int cargo= sc.nextInt();
        System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
        int dias= sc.nextInt();
        System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado):");
        int estado= sc.nextInt();
        switch(cargo){
            case 1:
                double sueldo_cargo=950;
                double sueldo_bruto=sueldo_cargo+dias*30;
                System.out.println("----------------------------------");
                System.out.println("| Sueldo base              "+sueldo_cargo+" |");
                System.out.println("| Dietas ( "+dias+" viajes)              "+dias*30+" |");
                System.out.println("|--------------------------------|");
                System.out.println("| Sueldo bruto       "+sueldo_bruto+" |");
                if(estado==1){
                    System.out.println("| Retencion IRPF (25%)      "+sueldo_bruto*0.25+" |");
                    double sueldo_neto= sueldo_bruto-sueldo_bruto*0.25;
                    System.out.println("|--------------------------------|");
                    System.out.println("| Sueldo neto              "+sueldo_neto+" |");
                    System.out.println("----------------------------------");
                }
                if(estado==2){
                    System.out.println("| Retencion IRPF (20%)      "+sueldo_bruto*0.2+" |");
                    double sueldo_neto= sueldo_bruto-sueldo_bruto*0.2;
                    System.out.println("|--------------------------------|");
                    System.out.println("| Sueldo neto              "+sueldo_neto+" |");
                    System.out.println("----------------------------------");
                }
                break;
            case 2:
            double sueldo_cargo2=1200;
                double sueldo_bruto2=sueldo_cargo2+dias*30;
                System.out.println("----------------------------------");
                System.out.println("| Sueldo base              "+sueldo_cargo2+" |");
                System.out.println("| Dietas ( "+dias+" viajes)              "+dias*30+" |");
                System.out.println("|--------------------------------|");
                System.out.println("| Sueldo bruto              "+sueldo_bruto2+" |");
                if(estado==1){
                    System.out.println("| Retencion IRPF (25%)              "+sueldo_bruto2*0.25+" |");
                    double sueldo_neto2= sueldo_bruto2-sueldo_bruto2*0.25;
                    System.out.println("|--------------------------------|");
                    System.out.println("| Sueldo neto             "+sueldo_neto2+" |");
                    System.out.println("----------------------------------");
                }
                if(estado==2){
                    System.out.println("| Retencion IRPF (20%)              "+sueldo_bruto2*0.2+" |");
                    double sueldo_neto2= sueldo_bruto2-sueldo_bruto2*0.2;
                    System.out.println("|--------------------------------|");
                    System.out.println("| Sueldo neto             "+sueldo_neto2+" |");
                    System.out.println("----------------------------------");
                }
                break;
            case 3:
            double sueldo_cargo3=1600;
            double sueldo_bruto3=sueldo_cargo3+dias*30;
            System.out.println("----------------------------------");
            System.out.println("| Sueldo base              "+sueldo_cargo3+" |");
            System.out.println("| Dietas ( "+dias+" viajes)              "+dias*30+" |");
            System.out.println("|--------------------------------|");
            System.out.println("| Sueldo bruto              "+sueldo_bruto3+" |");
            if(estado==1){
                System.out.println("| Retencion IRPF (25%)              "+sueldo_bruto3*0.25+" |");
                double sueldo_neto3= sueldo_bruto3-sueldo_bruto3*0.25;
                System.out.println("|--------------------------------|");
                System.out.println("| Sueldo neto             "+sueldo_neto3+" |");
                System.out.println("----------------------------------");
            }
            if(estado==2){
                System.out.println("| Retencion IRPF (20%)      "+sueldo_bruto3*0.2+" |");
                double sueldo_neto3= sueldo_bruto3-sueldo_bruto3*0.2;
                System.out.println("|--------------------------------|");
                System.out.println("| Sueldo neto             "+sueldo_neto3+" |");
                System.out.println("----------------------------------");
            }
            break;
        }
        
        sc.close();
        }
}