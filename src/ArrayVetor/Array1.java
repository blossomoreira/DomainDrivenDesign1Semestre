package ArrayVetor;

public class Array1 {

    public static void main(String[] args) {

        int tam = 5;

        int [] num = new int[5]; //criando array com 5 posições
        int [] numeros={1,2,3,4,5,6,7,8,9,10}; //

        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for(int i=0; i<numeros.length; i++){
            System.out.printf("%d - ", numeros[i]);
        }
    }
}
