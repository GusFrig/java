 import java.util.Scanner;
 public class operacao{
    public static Scanner leia = new Scanner(System.in);
    public static void main(String args[])
    { float num1 ,num2 ;
     String calculo;
     
    System.out.print("Digite o primeiro valor: ");
    num1= leia.nextFloat();
    System.out.print("Digite o segundo valor: ");
    num2= leia.nextFloat();
    System.out.print("Digite a operação a ser utilizada(soma,subtração,divisão ou multiplicação): ");
    calculo= leia.next();
    switch(calculo)
    { 
        case ("+"):
              System.out.print("a soma dos números é:"+ (num1+num2));
              break;
        case ("-"):
              System.out.print(" a subtração dos números é"+ (num1-num2));
              break;
        case ("*"):
              System.out.print(" a multiplicação dos números é"+ num1*num2);
              break; 
        case ("/"):
              System.out.print(" a divisão dos números é"+ num1/num2);
              break;
        default:
              System.out.print("Digite uma das quatro primeiras operações!");
              break;
      

    }

    }
 }