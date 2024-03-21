import java.util.Scanner;
public class fibonati
{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String args[]) throws Exception
    {
       int n;
       int ant = 0;
       System.out.print("Digite o tamanho do vetor: ");
       n= leia.nextInt();
       
       int numero[] = new int[n];
       numero[0] = 1; 
       for(int i= 0; i < n - 1; i++)
       {
            numero[i + 1] = numero[i] + ant;
            ant = numero[i];
       }
       for (int i : numero) {
            System.out.println(i);
       }

    }


}