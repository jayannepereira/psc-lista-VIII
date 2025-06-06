public class Exercicio5 {
    public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * taxaImposto / 100);
    }

    public static void main(String[] args) {
        double resultado = somaImposto(10, 200); // 10% de 200 = 220
        System.out.println("Valor com imposto: " + resultado);
    }
}
