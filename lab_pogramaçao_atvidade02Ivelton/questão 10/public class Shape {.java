public class Shape {

        public double area() {
            return 0.0; // Implementação padrão para formas genéricas
        }
    
        public double perimetro() {
            return 0.0; // Implementação padrão para formas genéricas
        }
    }
    
    class Circulo extends Shape {
        private double raio;
    
        public Circulo(double raio) {
            this.raio = raio;
        }
    
        
        public double area() {
            return Math.PI * raio * raio;
        }
    
        
        public double perimetro() {
            return 2 * Math.PI * raio;
        }
    }
    
    class Retangulo extends Shape {
        private double comprimento;
        private double largura;
    
        public Retangulo(double comprimento, double largura) {
            this.comprimento = comprimento;
            this.largura = largura;
        }
    
        
        public double area() {
            return comprimento * largura;
        }
    
        
        public double perimetro() {
            return 2 * (comprimento + largura);
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Circulo circulo = new Circulo(5.0);
            Retangulo retangulo = new Retangulo(4.0, 6.0);
    
            System.out.println("Área do círculo: " + circulo.area());
            System.out.println("Perímetro do círculo: " + circulo.perimetro());
    
            System.out.println("Área do retângulo: " + retangulo.area());
            System.out.println("Perímetro do retângulo: " + retangulo.perimetro());
        }
    }
    

