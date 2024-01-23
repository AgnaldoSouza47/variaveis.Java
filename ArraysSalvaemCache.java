public class ArraysSalvaemCache {
    long[] fatorial = new long[10];

    private long fatorial(int n) {
        // Verificando se o valor de "n" é maior que 10
        if (n == 0 || n == 1 || n > 10)
            //Se for retorne 1
            return 1;
        // verifica se ja tenho calculado
        if (fatorial[n] != 0) {
            //Se for diferente de zero ja tenho calculado
            System.out.println("Calculo evitado !");
            return fatorial[n];
        }
        long resultado = 1;
        int numeroFatorial = n;
        while (n > 1) {
            resultado *= n;
            n--;
        }
        //Se for numeros repetidos NÃO realizará os calculos novamente
        fatorial[numeroFatorial] = resultado;
        System.out.println("Calculo realizado !");
        return resultado;
    }

    public static void main(String[] args) {
        ArraysSalvaemCache arraysSalvaemCache = new ArraysSalvaemCache();
        arraysSalvaemCache.fatorial(3);
        arraysSalvaemCache.fatorial(3);
        arraysSalvaemCache.fatorial(4);
        arraysSalvaemCache.fatorial(5);
        arraysSalvaemCache.fatorial(6);
        arraysSalvaemCache.fatorial(7);
        arraysSalvaemCache.fatorial(7);


    }
}
