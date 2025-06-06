import java.util.Scanner;

public class Exercicio6 {

    public static String converterHora(int hora, int minuto, char[] periodo) {
        if (hora == 0) {
            periodo[0] = 'A';
            hora = 12;
        } else if (hora == 12) {
            periodo[0] = 'P';
        } else if (hora > 12) {
            periodo[0] = 'P';
            hora -= 12;
        } else {
            periodo[0] = 'A';
        }
        return String.format("%d:%02d", hora, minuto);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Informe a hora (0-23): ");
            int hora = sc.nextInt();

            System.out.print("Informe os minutos (0-59): ");
            int minuto = sc.nextInt();

            char[] periodo = new char[1];
            String horaConvertida = converterHora(hora, minuto, periodo);

            System.out.println("Hora convertida: " + horaConvertida + (periodo[0] == 'A' ? " A.M." : " P.M."));

            System.out.print("Deseja converter outra hora? (S/N): ");
            continuar = sc.next().toUpperCase().charAt(0);

        } while (continuar == 'S');

        sc.close();
    }
}
