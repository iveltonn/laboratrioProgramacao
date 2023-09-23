public Interface Imprimivel {
    // Interface Imprimivel
    void imprimir();
}

// Classe Documento implementando Imprimivel
class Documento implements Imprimivel {
    private String conteudo;

    public Documento(String conteudo) {
        this.conteudo = conteudo;
    }


    public void imprimir() {
        System.out.println("Imprimindo Documento:");
        System.out.println(conteudo);
    }
}

// Classe Foto implementando Imprimivel
class Foto implements Imprimivel {
    private String descricao;

    public Foto(String descricao) {
        this.descricao = descricao;
    }


    public void imprimir() {
        System.out.println("Imprimindo Foto:");
        System.out.println(descricao);
    }
}

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Este é um documento de texto.");
        Foto foto = new Foto("Uma foto do pôr do sol.");

        // Chamando o método imprimir() das classes Documento e Foto
        documento.imprimir();
        foto.imprimir();
    }
}


