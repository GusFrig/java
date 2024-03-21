import java.util.Scanner;
public class q16 
{
public static Scanner leia = new Scanner(System.in);
public static void main (String args[])
{ int dia;
System.out.println("Digite um número de 1 a 7: ");
dia=leia.nextInt();





switch(dia)
{
    case 1:
        System.out.print("o dia selecionando foi domingo");
        break;
    case 2:
        System.out.print("o dia selecionando foi segunda");
        break;
    case 3:
        System.out.print("o dia selecionando foi terça");
        break;
    case 4:
        System.out.print("o dia selecionando foi quarta");
        break;
    case 5:
        System.out.print("o dia selecionando foi quinta");
        break;
    case 6:
        System.out.print("o dia selecionando foi sexta");
        break;
    case 7:
        System.out.print("o dia selecionando foi sábado");
        break;
   
    default:
        System.out.print("Digite um número de 1 a 7!");
        break;
 }

 }
 
}