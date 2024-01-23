public class Main {
    private void investir() {
        float capital = 10000;
        int anos = 0;
        while (capital < 30000) {

            capital = capital+(capital * 0.071f);
            anos++;
            //Se eu colocar apos 1 ano 500 reais.
            if (anos > 1);
            capital=capital+500;
        }
        System.out.println("Vai demorar: " + anos + " Anos");
    }
    private String inversao(String str) {
        //Escrever ao contrario inversão de strings
        String invertida = "";
        //METODO DE INVERSÃO COM FOR
      //  for (int i = str.length() - 1; i >= 0; i--) {
          //  invertida += str.charAt(i);
       // }
        // METODO DE INVERSÃO COM WHILE
       int i =str.length()-1;
        while(i >= 0){
         invertida += str.charAt(i);
        i--; }
        return invertida;
    }
    private long fatorial(int numero){
        if (numero == 0 || numero == 1)
            return 1;
        long resultado = 1;
        while (numero >= 1) {
        resultado = resultado * numero ;
       numero --;
        }
return resultado;
    }
    private void escada(int  n){
        int contador = 1;
        for(int i =0; i < n;i ++){
            for(int j =0;j< contador;j++){
                System.out .print("#");
            }contador ++;
            System.out.println();
            //deverá mostrar na tela deacordo com a quantidade "n" pedida 3(degraus)
            // #
            // ##
            // ###
        }
    }
    public static void main(String[] args) {
Main ex = new Main ();
//System.out.println(ex.inversao("ABCDEF"));
//A saída será FEDCBA
  ex.escada(3);

    }
}