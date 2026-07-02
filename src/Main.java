//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Restaurante pizzaria = new Restaurante();

    Alimentos ali1 = new Alimentos("Ovo", "Proteina");
    Alimentos ali2 = new Alimentos("Carne", "Proteina");
    Alimentos ali3 = new Alimentos("Arroz", "Carboidrato");

    pizzaria.darEntradaAlimento(ali1);
    pizzaria.darEntradaAlimento(ali2);
    pizzaria.darEntradaAlimento(ali3);

    Pratos prat1 = new Pratos("Omelete");
    Pratos prat2 = new Pratos("Risoto");

    prat1.addIngredientes(ali1);
    prat2.addIngredientes(ali2);
    prat2.addIngredientes(ali3);

    pizzaria.adicionarPratoNoCardapio(prat1);
    pizzaria.adicionarPratoNoCardapio(prat2);

    pizzaria.verCardapio();

    pizzaria.fazerPedido(prat1);

    pizzaria.fazerPedido(prat2);

    pizzaria.verPedidos();
}
