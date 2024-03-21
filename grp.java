import java.util.Scanner;
public class grp {
    public static Scanner leia= new Scanner(System.in);
    public static void main(String args[])
    {
      float salario,media ;
      System.out.println("Digite o salário: ");
      salario = leia.nextFloat();
      if(salario<=280){
        media= salario*20/100;
        System.out.println(" o salário ficou: "+salario+" mais o valor de: "+ media);
        System.out.println("o salário é: "+(media+salario));

        System.out.println("20%");




      }
      else if (salario > 280  && salario < 700) 
      {
        media= salario*15/100;
        System.out.println(" o salário ficou: "+salario+ " mais o valor de: "+  media);
        System.out.println("o salário é: "+(media+salario));
        System.out.println("15%");

      
        
        
      } 
     else if (salario > 700  && salario <1500)
     {
        media= salario*10/100;
        System.out.println(" o salário ficou: "+salario+" mais o valor de: "+ media);
        System.out.println("o salário é: "+(media+salario));
        System.out.println("10%");


    }
     else if(salario > 1500)
     {
        media= salario*5/100;
        System.out.println(" o salário ficou: "+salario+" mais o valor de: "+ media);
        System.out.println("o salário é: "+ (media+salario));
        System.out.println("5%");
    }

}
}
