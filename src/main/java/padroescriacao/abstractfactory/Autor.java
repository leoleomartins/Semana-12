package padroescriacao.abstractfactory;

public class Autor {
    private Artigo artigo;
    private Coluna coluna;

    public Autor (FabricaAbstrata fabrica) {
        this.artigo = fabrica.createArtigo();
        this.coluna = fabrica.createColuna();
    }

    public String publicarArtigo() {
        return this.artigo.publicar();
    }

    public String publicarColuna() {
        return this.coluna.publicar();
    }
}
