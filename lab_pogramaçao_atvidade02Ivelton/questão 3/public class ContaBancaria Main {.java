public class ContaBancaria Main {
    

        private double saldo;
    
        // Construtor para inicializar o saldo da conta
        public ContaBancaria(double saldoInicial) {
            saldo = saldoInicial;
        }
    
        // Método para depositar dinheiro na conta
        public void depositar(double valor) {
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            } else {
                System.out.println("O valor do depósito deve ser maior que zero.");
            }
        }
    
        // Método para sacar dinheiro da conta
        public void sacar(double valor) {
            if (valor > 0) {
                if (saldo >= valor) {
                    saldo -= valor;
                    System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque.");
                }
            } else {
                System.out.println("O valor do saque deve ser maior que zero.");
            }
        }
    
        // Método para verificar o saldo atual da conta
        public double getSaldo() {
            return saldo;
        }
    
        public static void main(String[] args) {
            // Exemplo de uso da classe ContaBancaria
            ContaBancaria conta = new ContaBancaria(1000.0);
    
            System.out.println("Saldo inicial: R$" + conta.getSaldo());
    
            conta.depositar(500.0);
            System.out.println("Saldo após depósito: R$" + conta.getSaldo());
    
            conta.sacar(200.0);
            System.out.println("Saldo após saque: R$" + conta.getSaldo());
    
            conta.sacar(2000.0); // Isso deve imprimir "Saldo insuficiente para realizar o saque."
        }
    }
    

