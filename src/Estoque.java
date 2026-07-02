import java.util.ArrayList;
import java.util.Collection;

public class Estoque {
    private String nome;
    private Collection<Alimentos> estoque = new ArrayList<>();

    public void darEntradaAlimento(Alimentos alimento) {
        estoque.add(alimento);
    }

    public boolean temAlimento(String nomeAlimento) {
        int i = 0;
        for (Alimentos atual : estoque) {
            if (atual.getNome().equalsIgnoreCase(nomeAlimento)) {
                return true;
            }
        }
        return false;
    }

    public void liberarAlimento(String nomeAlimento) {
        for (Alimentos atual : estoque) {
            if (atual.getNome().equalsIgnoreCase(nomeAlimento)) {
                estoque.remove(atual);
                return;
            }
        }
        System.out.println("Alimento não encontrado");
    }

    public void mostrarEstoque() {
        for (Alimentos atual : estoque) {
            System.out.println(atual.getNome());
        }
        System.out.println(" ");
    }
}
