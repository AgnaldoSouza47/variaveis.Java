public class prioridadeNaOperacao {

    public static void main (String[]args){
        // Os parenteses ( ) sempre ganham prioridade
   //Exemplo sem parenteses:
        float num =  2+3  *2;
System.out.println("Esperava encontrar a resposta 10 mas...");

        System.out.println(num);
// As prioridades no java caso não tenha os parenteses são:
   // Primeiro * multiplicação
   //Segundo  / divisão
    //Terceiro  % resto
    // Quarto + adição
    // Quinto -  subtração

        System.out.println("Corrigindo com parenteses (), o resultado será");
        float num1 =  (2+3)  *2;
        System.out.println(num1);
    }
}
