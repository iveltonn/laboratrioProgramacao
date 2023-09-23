public interface Recurso {

    void alocar();
    void liberar();
}


public abstract class RecursoBase implements Recurso {
    private boolean alocado = false;


    public void alocar() {
        if (!alocado) {
            alocado = true;
            System.out.println(getClass().getSimpleName() + " alocado.");
        } else {
            System.out.println(getClass().getSimpleName() + " já está alocado.");
        }
    }

    
    public void liberar() {
        if (alocado) {
            alocado = false;
            System.out.println(getClass().getSimpleName() + " liberado.");
        } else {
            System.out.println(getClass().getSimpleName() + " já está liberado.");
        }
    }
}


public class SalaDeReuniao extends RecursoBase {
    
    public void alocar() {
        super.alocar();
    }


    public void liberar() {
        super.liberar();
    }
}

public class Laptop extends RecursoBase {
    
    public void alocar() {
        super.alocar();
    }


    public void liberar() {
        super.liberar();
    }
}

public class Projetor extends RecursoBase {
    
    public void alocar() {
        super.alocar();
    }

    
    public void liberar() {
        super.liberar();
    }
}


public class GerenciadorDeRecursos {
    public void alocarRecurso(Recurso recurso) {
        recurso.alocar();
    }
}


import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Recurso> recursosDisponiveis;

    public Empresa() {
        recursosDisponiveis = new ArrayList<>();
    }

    public void adicionarRecurso(Recurso recurso) {
        recursosDisponiveis.add(recurso);
    }

    public void alocarRecurso(Recurso recurso) {
        if (recursosDisponiveis.contains(recurso)) {
            GerenciadorDeRecursos gerenciador = new GerenciadorDeRecursos();
            gerenciador.alocarRecurso(recurso);
        } else {
            System.out.println("Recurso não disponível na empresa.");
        }
    }

    public void liberarRecurso(Recurso recurso) {
        if (recursosDisponiveis.contains(recurso)) {
            recurso.liberar();
        } else {
            System.out.println("Recurso não disponível na empresa.");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        SalaDeReuniao sala1 = new SalaDeReuniao();
        Laptop laptop1 = new Laptop();
        Projetor projetor1 = new Projetor();

        empresa.adicionarRecurso(sala1);
        empresa.adicionarRecurso(laptop1);
        empresa.adicionarRecurso(projetor1);

        empresa.alocarRecurso(sala1);
        empresa.alocarRecurso(laptop1);
        empresa.alocarRecurso(projetor1);

        empresa.liberarRecurso(sala1);
        empresa.liberarRecurso(laptop1);
        empresa.liberarRecurso(projetor1);
    }
}

    

