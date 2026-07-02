import java.util.ArrayList;
import java.util.Collection;

public class Cardapio {
    private Collection<Pratos> cardapio = new ArrayList<>();


    public void addPratos (Pratos prato) {
        cardapio.add(prato);
    }

    public void mostrarPratos (Estoque armazem) {
        for (Pratos atual : cardapio) {
            System.out.println(atual.getNome() + " - " + atual.estaDisponivel(armazem));
        }
        System.out.println(" ");
    }

}
