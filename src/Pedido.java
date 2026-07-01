import java.util.ArrayList;
import java.util.Collection;

public class Pedido {
    int numero_pedido;
    Pratos prato_pedido;

    public Pedido(int numero_pedido) {
        this.numero_pedido = numero_pedido;
    }

    public void fazerPedido(Pratos prato, Estoque armazem) {
        if (prato.estaDisponivel(armazem)) {
            this.prato_pedido = prato;
            for (Alimentos atual : prato.ingredientes) {
                armazem.liberarAlimento(atual.nome);
            }
            System.out.println("Pedido "+numero_pedido+" feito com sucesso");
            System.out.println(" ");
        } else {
            System.out.println("Prato está indisponível");
            System.out.println(" ");
        }
    }

    public void cancelarPedido(Estoque armazen) {
        for (Alimentos atual : prato_pedido.ingredientes) {
            armazen.darEntradaAlimento(atual);
        }
        System.out.println("Pedido "+numero_pedido+" cancelado com sucesso");
        System.out.println(" ");
    }
}
