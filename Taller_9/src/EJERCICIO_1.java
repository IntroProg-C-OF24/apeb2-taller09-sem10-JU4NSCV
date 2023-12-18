import java.util.Scanner;
public class EJERCICIO_1 {
    public static void main(String[] args) {
        String marcas[];
        Scanner sc = new Scanner(System.in);
        boolean condicion;
        int lim;
        System.out.println("Introduce el numero de marcas que quieres mostrar:");
        lim=sc.nextInt();
        marcas=new String[lim];
        for (int i = 0; i < marcas.length; i++) {
            do{
            condicion=false;
            System.out.println("Ingrese la marca");
            marcas[i]=sc.next().toLowerCase();
            if (marcas[i].startsWith("a") || marcas[i].startsWith("c") || marcas[i].startsWith("t")) {
                System.out.println("La marca ingresada no esta dentro de los parametros establecidos");
                condicion=true;
            }
            }while(condicion);
        }
        System.out.println("Marcas ingresadas");
        for(String marca : marcas){
            System.out.println(marca);
        }
            
    }
}
