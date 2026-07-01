import java.util.ArrayList;
import java.util.Collection;

public class Pratos {
    String nome;
    Collection<Alimentos> ingredientes = new ArrayList<>();

    public Pratos (String nome) {
        this.nome = nome;
    }

    public void addIngredientes(Alimentos alimento) {
        ingredientes.add(alimento);
    }

    public void mostrarIngredientes() {
        System.out.println("| "+nome+" |");
        for (Alimentos atual : ingredientes) {
            System.out.println(atual.nome + " - " + atual.categoria);
        }
        System.out.println(" ");
    }

    public boolean estaDisponivel(Estoque armazem) {
        int i = 0;
        for(Alimentos atual : ingredientes) {
            if (armazem.temAlimento(atual.nome)) {
                i++;
            }
            if (i == ingredientes.size()) {
                return true;
            }
        }
        return false;
    }

}
