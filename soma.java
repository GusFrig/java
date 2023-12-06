import java.util.Scanner;

public class soma
{
    public static Scanner leia = new Scanner(System.in);
 public static void main(String args[]) 
 {
   int num1, num2 ,soma;

   System.out.println("digite o primeiro número");
    num1 = leia.nextInt();
    
   System.out.println("digite o segundo número");
   num2 = leia.nextInt();

   soma = num1 + num2;

   System.err.println(" A soma dos números é: "+ soma);
    


 }
}