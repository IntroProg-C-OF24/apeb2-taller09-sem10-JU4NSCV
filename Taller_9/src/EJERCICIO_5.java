import java.util.Random;
public class EJERCICIO_5 {
    public static void main(String[] args) {
        String estudiantes[] = {"Alberto", "Andrés", "Antonio", "Armando", "Arturo","Benjamín", "Bernardo", "Carlos", "César", "Cristián","Daniel", "David", "Diego", "Eduardo", "Emilio","Enrique", "Ernesto", "Esteban", "Felipe", "Fernando","Francisco", "Gabriel", "Germán", "Gilberto", "Guillermo","Hernán", "Homero", "Horacio", "Ignacio", "Isaac","Jaime", "Javier", "Jerónimo", "Jesús", "Joaquín","Jorge", "José", "Juan", "Lorenzo", "Luis", "Manuel","Marcelo", "Marco", "Mariano", "Mario", "Mauricio","Miguel", "Nicolás", "Octavio", "Óscar", "Pablo","Patricio", "Pedro", "Rafael", "Ramiro", "Ramón","Ricardo", "Roberto", "Rodrigo", "Rubén", "Salvador","Samuel", "Sancho", "Santiago", "Sergio", "Tomas","Valentín", "Vicente", "Víctor", "Víctor Hugo", "Víctor Manuel","Víctor Hugo de Andrade y Victorino"}, mejorEst = " ", peorEst = " ";
        int promedios[] = new int[28], prom=0, mejorCal = 0, peorCal = 10;
        Random rand = new Random();
        for(int i = 0; i < promedios.length ; i++){
            promedios[i] = (rand.nextInt(10)+1);
            prom = prom + promedios[i];
        }
        prom = prom / promedios.length;
        System.out.println("=======INFORME DE ESTUDIANTES DEL PARALELO C=======");
        System.out.println("Promedio del ciclo del paralelo C: " + prom);
        System.out.println("==Listado de estudiantes con su nota por encima del promedio==");
        for(int i = 0 ; i < promedios.length ; i++){
            if (promedios[i] >= 7) {
                System.out.println(estudiantes[i] + " Promedio: " + promedios[i]);
                if (promedios[i] >= mejorCal) {
                    mejorEst = estudiantes[i];
                    mejorCal = promedios[i];
                }
            }
        }
        System.out.println("==Listado de estudiantes con su nota por debajo del promedio==");
        for(int i = 0 ; i < promedios.length ; i++){
            if (promedios[i] < 7) {
                System.out.println(estudiantes[i] + " Promedio: " + promedios[i]);
                if (promedios[i] <= peorCal) {
                    peorEst = estudiantes[i];
                    peorCal = promedios[i];
                }
            }
        }
        System.out.println("==Estudiante con la mejor calificación==");
        System.out.println(mejorEst);
        System.out.println("==Estudiante con la calificación mas baja==");
        System.out.println(peorEst);
    }
}
