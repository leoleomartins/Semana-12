package padroescriacao.abstractfactory;

public class FabricaPortugues implements FabricaAbstrata{
    @Override
    public Artigo createArtigo() {
        return new ArtigoPortugues();
    }

    @Override
    public Coluna createColuna() {
        return new ColunaPortugues();
    }
}
