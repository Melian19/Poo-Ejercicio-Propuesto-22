import java.util.Scanner;

public class PooEj22 {
    public static void main(String[] args) {
        //datos de entrada
        System.out.println("Ingrese nombre de empleado:");
        Scanner entrada = new Scanner(System.in);
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese cantidad de horas trabajadas:");
        double horas = entrada.nextDouble();
    

        System.out.println("Ingrese el valor de la hora de trabajo: ");
        double valorHora = entrada.nextDouble();
        entrada.close();

        double salario = valorHora * horas;
        
        if (salario >450000){
            System.out.println(nombre);
            System.out.println(salario);
        }else{
            System.out.println(nombre);
        }
        
    }
}
