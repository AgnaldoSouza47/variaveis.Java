public class Main {
    public static void main(String[] args) {
        int valor = 0;
        int valorMaximo = 500;
        boolean condicao = true;
        System.out.println("Condicao: " + (valor <= valorMaximo));
        //se a condicao for verdade finaliza o laco
        while (condicao) {

            // valor ,= valorMaximo
            if (valor >= valorMaximo) {
                condicao = false;

            } else if (valor ==100) {
                System.out.println("valor: " + (valor));
                valor++;
            } else {
                System.out.println("Processando..." );
               valor++;
            }
        }
    }
}