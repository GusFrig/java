import java.util.Scanner;
public class q14
{ public static Scanner leia= new Scanner(System.in);
  public static void main(String args[])
  { int primeiro, segundo, terceiro, soma;
   System.out.print("Digite o primeiro valor: ");
   primeiro= leia.nextInt();
   System.out.print("Digite o segundo valor: ");
   segundo= leia.nextInt();
   System.out.print("Digite o terceiro valor: ");
   terceiro= leia.nextInt();
   if (primeiro<segundo)
   {
     if(primeiro<terceiro)
     { soma=segundo+terceiro;
     System.out.print("a soma dos dois maiores valores é: "+soma);

     }

   }  if (segundo<primeiro)
   {
     if(segundo<terceiro)
     { soma=primeiro+terceiro;
     System.out.print("a soma dos dois maiores valores é: "+soma);

     }
   } if (terceiro<primeiro)
   {
     if(terceiro<segundo)
     { soma=primeiro+segundo;
     System.out.print("a soma dos dois maiores valores é: "+soma);

     }
   }




  }

}