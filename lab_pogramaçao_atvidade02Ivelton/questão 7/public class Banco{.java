public class Banco{

        // Taxa de juros para saldos positivos
        private static final double TAXA_POSITIVA = 0.05; // 5%
    
        // Taxa de juros para saldos negativos
        private static final double TAXA_NEGATIVA = 0.1; // 10%
    
        public static double calculaTaxaJuros(double saldo) {
            if (saldo >= 0) {
                // Saldo positivo, aplicar a taxa positiva
                return saldo * TAXA_POSITIVA;
            } else {
                // Saldo negativo, aplicar a taxa negativa
                return saldo * TAXA_NEGATIVA;
            }
        }
    
        public static void main(String[] args) {
            double saldoPositivo = 1000.0;
            double saldoNegativo = -500.0;
    
            double taxaPositiva = calculaTaxaJuros(saldoPositivo);
            double taxaNegativa = calculaTaxaJuros(saldoNegativo);
    
            System.out.println("Taxa de juros para saldo positivo: " + taxaPositiva);
            System.out.println("Taxa de juros para saldo negativo: " + taxaNegativa);
        }
    }
    

