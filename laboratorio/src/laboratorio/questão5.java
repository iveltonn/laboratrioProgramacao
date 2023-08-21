package laboratorio;

public class questão5 {
	
	public static void main(String[] args) {
        for (long i = 1; i <= 40; i++) {
            System.out.println("Fatorial de " + i + ": " + cf(i));
        }
    }
    public static long cf(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * cf(n - 1);
        }
    }
}



