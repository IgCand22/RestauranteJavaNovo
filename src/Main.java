//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Estoque galpaoPrincipal = new Estoque();

    Alimentos ali1 = new Alimentos("Ovo", "Proteina");

    galpaoPrincipal.darEntradaAlimento(ali1);

    Pratos prat1 = new Pratos("Omelete");

    prat1.addIngredientes(ali1);

    Cardapio card1 = new Cardapio();

    card1.addPratos(prat1);

    card1.mostrarPratos(galpaoPrincipal);

    Pedido ped1 = new Pedido(1);

    ped1.fazerPedido(prat1, galpaoPrincipal);

    card1.mostrarPratos(galpaoPrincipal);


}
