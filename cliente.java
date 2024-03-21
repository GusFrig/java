import java.util.Scanner;
public class cliente
{
public static Scanner leia = new Scanner (System.in);
public static void main (String args[])
{
int codigo ,copias;
float dinheiro;

System.out.println("Digite quantas cópias serão feitas: ");
copias= leia.nextInt();
System.out.print("Digite quanto dinheiro se tem: ");
dinheiro= leia.nextInt();
System.out.print("Digite o seu código: ");
codigo= leia.nextInt();




switch(codigo)
{
case 10:
if((dinheiro-(copias * 1.50))<0)
{
System.out.print("quantidade de dinheiro insuficiente");
}else
{
System.out.println(" foi recebido: "+ dinheiro +" em dinheiro");
System.out.println(" a quantida de de cópias é: "+copias);
System.out.println(" vocẽ pagará: "+(copias * 1.50));
System.out.println(" o seu troco será de: " + (dinheiro-(copias * 1.50)));
}


break;
case 20:
if((dinheiro-(copias * 0.80))<0)
{
System.out.print("quantidade de dinheiro insuficiente");
}else{
System.out.println(" foi recebido: "+ dinheiro +"em dinheiro");
System.out.println(" a quantida de de cópias é: "+copias);
System.out.println("vocẽ pagará: "+(copias * 0.80));
System.out.println("o seu troco será de: " + (dinheiro-(copias * 0.80)));}

break;
case 30:
if((dinheiro-(copias * 0.60))<0)
{
System.out.print("quantidade de dinheiro insuficiente");
}else{
    System.out.println("foi recebido: "+ dinheiro +"em dinheiro");
    System.out.println("a quantida de de cópias é: "+copias);
    System.out.println("vocẽ pagará: "+(copias * 0.60));
    System.out.println(" o seu troco será de: " + (dinheiro-(copias * 0.60)));}

break;
case 40:
if((dinheiro-(copias * 2))<0)
{
System.out.print("quantidade de dinheiro insuficiente");
}else{
    System.out.println("foi recebido: "+ dinheiro +"em dinheiro");
    System.out.println("a quantida de de cópias é: "+copias);
    System.out.println("vocẽ pagará: "+(copias * 2.00));
    System.out.println(" o seu troco será de: " + (dinheiro-(copias * 2)));}

break;
default:
     System.out.print("código inválido");
break;






}


}
}