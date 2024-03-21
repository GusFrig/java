import java.util.Scanner;
public class grp2 {
    public static Scanner leia= new Scanner(System.in);
    public static void main(String args[])
    {
        
        int num1,num2,num3;
        int caso= 0 ;
        System.out.print("Digite o primeiro número: ");
        num1=leia.nextInt();
        System.out.print("Digite o segundo numero: ");
        num2=leia.nextInt();
        num3=num1+1;
        for(; num3 < num2;num3++){
            
            System.out.println(num3);
            caso += num3;

        }
    System.out.println(caso);

    }
}