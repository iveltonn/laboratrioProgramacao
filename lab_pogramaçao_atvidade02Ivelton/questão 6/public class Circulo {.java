public class Circulo {

        // Atributo privado para armazenar o raio do círculo
        private double raio;
    
        // Construtor para inicializar o raio
        public Circulo(double raio) {
            this.raio = raio;
        }
    
        // Método público para calcular a área do círculo
        public double calcularArea() {
            // A fórmula da área de um círculo é: π * raio^2
            // Usaremos Math.PI para obter o valor de π (pi)
            return Math.PI * Math.pow(raio, 2);
        }
    
        // Método getter para obter o valor do raio
        public double getRaio() {
            return raio;
        }
    
        // Método setter para definir o valor do raio
        public void setRaio(double raio) {
            this.raio = raio;
        }
    
        public static void main(String[] args) {
            // Exemplo de uso da classe Circulo
            Circulo circulo = new Circulo(5.0); // Criando um círculo com raio 5.0
            double area = circulo.calcularArea(); // Calculando a área do círculo
            System.out.println("A área do círculo é: " + area);
        }
    }
    
}
