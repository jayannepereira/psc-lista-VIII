public class Exercicio1 {
    public static void imprimirNumeros(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        imprimirNumeros(5); // exemplo com n = 5
    }
}
