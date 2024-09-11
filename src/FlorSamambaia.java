import java.util.Scanner;

public class FlorSamambaia {
    public static String tentativaDesenhar(int r1, int x1, int y1, int r2, int x2, int y2) {
        // Calcula a distância entre os centros dos dois círculos
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Verifica se o círculo do caçador engloba completamente o círculo da flor
        if (r1 >= distancia + r2) {
            return "RICO";
        } else {
            return "MORTO";
        }
    }

    public static void main(String[] args) {
        // Leitura dos dados de entrada
        Scanner sc = new Scanner(System.in);

        // Raio e coordenadas do círculo do caçador
        int r1 = sc.nextInt();
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        // Raio e coordenadas do círculo da flor
        int r2 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Chamada da função e impressão do resultado
        System.out.println(tentativaDesenhar(r1, x1, y1, r2, x2, y2));

        sc.close();
    }
}
