public class Exercicio4 {
    public static char verificaNumero(int num) {
        return (num > 0) ? 'P' : 'N';
    }

    public static void main(String[] args) {
        System.out.println(verificaNumero(10));  // P
        System.out.println(verificaNumero(-5));  // N
    }
}
