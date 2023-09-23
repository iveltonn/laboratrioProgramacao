public class pessoa {
 
        private String nome;
        protected int idade;
    
        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }
    
        public String getNome() {
            return nome;
        }
    
        public int getIdade() {
            return idade;
        }
    }
    
    public class Estudante extends Pessoa {
        public Estudante(String nome, int idade) {
            super(nome, idade);
        }
    
    
    }
    

