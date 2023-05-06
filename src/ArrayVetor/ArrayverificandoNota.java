package ArrayVetor;
import java.util.Scanner;


public class ArrayverificandoNota { 
    public static void main(String[] args) {
  
    char[] gabarito ={'a','b','c','a'}; //Array com o gabarito
    char[] respostas = new char[gabarito.length]; // novo array para coletar as repsosats
    int nota = 0; //contador para a nota
    Scanner Scanner = new Scanner(System.in); 

    for(int i=0; i<respostas.length; i++){ // for para informar a nota
        System.out.printf("Informe sua resposta %d: ",i);
        respostas[i] = Scanner.nextLine().charAt(0);
    }

    for(int i=0; i<respostas.length; i++){
        if(respostas[i] == gabarito[i]){ // se as respostas forem iguais as notas cont++
            nota++;
            }
        }
        System.out.println(nota);
    }   
}
