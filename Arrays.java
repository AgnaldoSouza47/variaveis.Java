public class Arrays {
    public static void main(String[] args) {
        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = i * 2;
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }

}
