public class ArraysMaiorString {
    public static void main(String[] args) {
        String nomes[] = {"Natasha Alianova Romanoff", "Stephen Vicent Strange", "Antony Edward Stark"};
        int indice = 0;
        int tamanho = nomes[0].length();

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i].length());
        }
    }
}

