import java.util.ArrayList;
import java.util.Collection;

public class Restaurante {
    public String nomeRestaurante;
//  Gerente chef;
    private Estoque estoquePrincipal = new Estoque();
    private Cardapio cadapio = new Cardapio();
    private Collection<Pedidos> pedidos = new ArrayList<>();
    private int contadorPedidos = 0;

    public void darEntradaAlimento(Alimentos alimento) {
        estoquePrincipal.darEntradaAlimento(alimento);
        System.out.println(alimento.getNome()+" dado entrada com sucesso.");
    }

    public void adicionarPratoNoCardapio(Pratos prato) {
        cadapio.addPratos(prato);
        System.out.println(prato.getNome()+" adicionado ao cardápio com sucesso.");
    }

    public void verCardapio() {
        cadapio.mostrarPratos(estoquePrincipal);
    }

    public void fazerPedido(Pratos prato) {
        contadorPedidos++;
        Pedidos pedido = new Pedidos(contadorPedidos);
        pedido.fazerPedido(prato, estoquePrincipal);
        pedidos.add(pedido);
    }

    public void verPedidos() {
        for (Pedidos atual : pedidos) {
            System.out.println("Pedido #"+atual.getNumero_pedido());
            for (Pratos atualPrato: atual.getPrato_pedido()) {
                System.out.println(atualPrato.getNome());
                for (Alimentos atualAlimento : atualPrato.getIngredientes()) {
                    System.out.print("- "+atualAlimento.getNome()+" ");
                }
                System.out.print("-");
            }
            System.out.println(" ");
        }
    }

}
