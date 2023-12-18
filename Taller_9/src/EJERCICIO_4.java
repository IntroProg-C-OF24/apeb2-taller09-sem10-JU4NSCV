import java.util.Scanner;
public class EJERCICIO_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] estudiantes = {"Kimberly", "Hogan", "Teresa", "Luis", "Mark", "Jennifer", "Alcides"};
        String inicial;
        boolean bandera = true;
        while(bandera){
            System.out.println("Ingrese una letra");
            inicial = entrada.next();
            for(String estudiante : estudiantes){
                if (estudiante.startsWith(inicial)){
                    System.out.println("Nombre: "+estudiante);
                    bandera=false;
                    break;
                }
            }
        }
    }
}
