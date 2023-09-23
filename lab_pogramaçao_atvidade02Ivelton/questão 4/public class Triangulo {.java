public class Triangulo {
    
        // Atributos privados
        private double base;
        private double altura;
    
        // Construtor da classe Triangulo
        public Triangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }
    
        // Método público para calcular a área do triângulo
        public double calcularArea() {
            return (base * altura) / 2;
        }
    
        // Métodos getters e setters para os atributos base e altura 
        public double getBase() {
            return base;
        }
    
        public void setBase(double base) {
            this.base = base;
        }
    
        public double getAltura() {
            return altura;
        }
    
        public void setAltura(double altura) {
            this.altura = altura;
        }
    
        public static void main(String[] args) {
            // Exemplo de uso da classe Triangulo
            Triangulo triangulo = new Triangulo(5.0, 7.0);
            double area = triangulo.calcularArea();
            System.out.println("A área do triângulo é: " + area);
        }
    }
    

