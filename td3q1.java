import java.util.Scanner;
public class td3q1 {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String args[])
    { int numero, y,x;
        String valor;

        System.out.print("digite um número: ");
        numero= leia.nextInt();
        System.out.print("digite a para crescente ou b para decrescente:  ");
        valor= leia.next();
        y=0;
        if(valor == "a")
        {
         for (  x = numero; x > y ;y++ );
         System.out.print(y);


        }
        else if(valor == "b")
        {
        
        }




    }
}
