package laboratorio;

public class fatoriais {
	
	
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Fatorial de " + i + ": " + cf(i));
        }
    }
    public static int cf(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * cf(n - 1);
        }
    }
}


