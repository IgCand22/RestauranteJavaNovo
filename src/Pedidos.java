import java.util.ArrayList;
import java.util.Collection;

public class Pedidos {
    private int numero_pedido;
    private Collection<Pratos> prato_pedido = new ArrayList<>();

    public  Pedidos(){};
    public Pedidos(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public int getNumero_pedido() {
        return numero_pedido;
    }

    public Collection<Pratos> getPrato_pedido() {
        return prato_pedido;
    }

    public void fazerPedido(Pratos prato, Estoque armazem) {
        if (prato.estaDisponivel(armazem)) {
            prato_pedido.add(prato);
            for (Alimentos atual : prato.getIngredientes()) {
                armazem.liberarAlimento(atual.getNome());
            }
            System.out.println("Pedido "+numero_pedido+" feito com sucesso");
            System.out.println(" ");
        } else {
            System.out.println("Prato está indisponível");
            System.out.println(" ");
        }
    }

    public void cancelarPedido(Estoque armazen) {
        for (Pratos atual : prato_pedido) {
            for (Alimentos atualAlimento : atual.getIngredientes()) {
                armazen.darEntradaAlimento(atualAlimento);
            }
        }
        System.out.println("Pedido "+numero_pedido+" cancelado com sucesso");
        System.out.println(" ");
    }
}
