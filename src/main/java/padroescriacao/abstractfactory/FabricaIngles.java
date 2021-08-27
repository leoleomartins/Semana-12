package padroescriacao.abstractfactory;

public class FabricaIngles implements FabricaAbstrata{
    @Override
    public Artigo createArtigo() {
        return new ArtigoIngles();
    }

    @Override
    public Coluna createColuna() {
        return new ColunaIngles();
    }
}
