import java.util.Scanner;
public class qq1{
    public static Scanner leia= new Scanner(System.in);
    public static void main(String args[]){
        float qtdanos,horast ,valorhora, salario, salariof;
        System.out.println("Digite a quantidade de horas trabalhadas: ");
        horast= leia.nextFloat();
        System.out.println("Digite a quantidade quanta vale a hora: ");
        valorhora= leia.nextFloat();
         System.out.println("Digite quantos anos o funcionário trabalha na impresa: ");
         qtdanos= leia.nextFloat();
         
          if (qtdanos<1)
          { 
            salariof=1500;
             salario=valorhora*horast+salariof;
          
            System.out.print("O funcionário ganha: "+salario);
             
          

          }
           else if(qtdanos >=1 && qtdanos<=3)
           {
            salariof=2000;
             salario=valorhora*horast+salariof;
          
            System.out.print("o funcionário ganha: "+salario);

           } 
           else if(qtdanos>3)
           {
            salariof=3000;
             salario=valorhora*horast+salariof;
            System.out.print("o funcionário ganha: "+salario);

           }

    }
}