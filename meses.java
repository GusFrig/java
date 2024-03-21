import java.util.Scanner;
public class meses
{
public static Scanner leia = new Scanner(System.in);
public static void main (String args[])
{ int dia;
System.out.println("Digite um número de 1 a 12: ");
dia=leia.nextInt();





switch(dia)
{
    case 1:
        System.out.print("o mês selecionando foi janeiro");
        break;
    case 2:
        System.out.print("o mês selecionando foi fevereiro");
        break;
    case 3:
        System.out.print("o mês selecionando foi março");
        break;
    case 4:
        System.out.print("o mês selecionando foi abril");
        break;
    case 5:
        System.out.print("o mês selecionando foi maio");
        break;
    case 6:
        System.out.print("o mês selecionando foi junho");
        break;
    case 7:
        System.out.print("o mês selecionando foi julho");
        break;
    case 8:
        System.out.print("o mês selecionando foi agosto");
        break;
    case 9:
        System.out.print("o mês selecionando foi setembro");
        break;
    case 10:
        System.out.print("o mês selecionando foi outubro");
        break;
    case 11:
        System.out.print("o mês selecionando foi novembro");
        break;
    case 12:
        System.out.print("o mês selecionando foi dezembro");
        break;
   
    default:
        System.out.print("Digite um número de 1 a 12!");
        break;
 }

 }
 
}