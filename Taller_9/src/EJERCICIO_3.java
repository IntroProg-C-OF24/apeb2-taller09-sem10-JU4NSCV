public class EJERCICIO_3 {
    public static void main(String[] args) {
        double[] promedios = {10, 10, 9.1, 7, 6.1, 4, 8};
        String[] estudiantes = {"Kimberly Gonzalez", "Mark Hogan", "Teresa Martinez", "Julia Johnson", "Mark Cook", "Jennifer Manning", "Juan Vasquez"};
        String[] promediosCualitativos = new String[7];
        for(int i=0; i<promedios.length;i++){
            if (promedios[i] <= 5.9){
                promediosCualitativos[i] = "Promedio Regular";
            }else if (promedios[i] <= 8.9) {
                promediosCualitativos[i] = "Promedio Bueno";
            }else{
                promediosCualitativos[i] = "Promedio Sobresaliente ";
            }
        }
        for(int i = 0 ; i < promedios.length ; i++){
            System.out.println(estudiantes[i]+" promedio: "+ promedios[i]+ " " + promediosCualitativos[i]);
        }
    }
}
