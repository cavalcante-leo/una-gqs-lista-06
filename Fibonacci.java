public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // quantidade de termos
        long a = 0, b = 1;

        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            long proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}
