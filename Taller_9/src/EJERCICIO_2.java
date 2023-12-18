public class EJERCICIO_2 {
    public static void main(String[] args) {
        int[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        int total=0,media=0;
        for(int arr : arreglo){
            total= total + arr;
        }
        media=total/arreglo.length;
        System.out.println("Numeros por encima de la media aritmetrica");
        for(int arr : arreglo){
            if (arr>media) {
                System.out.println(arr);
            }
        }

    }
}
