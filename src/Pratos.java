import java.util.ArrayList;
import java.util.Collection;

public class Pratos {
    private String nome;
    private Collection<Alimentos> ingredientes = new ArrayList<>();

    public Pratos (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Collection<Alimentos> getIngredientes() {
        return ingredientes;
    }

    public void addIngredientes(Alimentos alimento) {
        ingredientes.add(alimento);
    }

    public void mostrarIngredientes() {
        System.out.println("| "+nome+" |");
        for (Alimentos atual : ingredientes) {
            System.out.println(atual.getNome() + " - " + atual.getCategoria());
        }
        System.out.println(" ");
    }

    public boolean estaDisponivel(Estoque armazem) {
        int i = 0;
        for(Alimentos atual : ingredientes) {
            if (armazem.temAlimento(atual.getNome())) {
                i++;
            }
            if (i == ingredientes.size()) {
                return true;
            }
        }
        return false;
    }

}
