import java.util.Scanner;
public class grp3 {
    public static Scanner leia= new Scanner(System.in);
    public static void main(String args[])
    {
        int num;
        int caso=1;
        System.out.println("Digite o número");
        num = leia.nextInt();
        for(int x=1 ;x <= num;num--){
           
            caso*= num;
        }
        System.out.println(caso);
    }}
 
