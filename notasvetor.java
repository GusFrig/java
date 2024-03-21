import java.util.Scanner; 
public class notasvetor {
    public static Scanner leia = new Scanner(System.in);
    public static void main(String[] args) throws Exception
    {
      String gabarito[]= {"a","b","d","a","c"};
      String respostas[]= new String[5];
      int nota= 0;


      for(int i=0; i < gabarito.length; i++){
      System.out.println("digite sua resposta: ");
      respostas[i] = leia.next();
    
    }
    for(int i=0; i < gabarito.length; i++){ 
      if(gabarito[i] == respostas[i]){
        
        nota+=2; 
      }

      }
      System.out.println("sua nota é: "+nota);

    }
    
}
