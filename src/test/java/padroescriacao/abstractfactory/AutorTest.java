package padroescriacao.abstractfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutorTest {

    @Test
    void deveEmitirColunaPortugues() {
        FabricaAbstrata fabrica = new FabricaPortugues();
        Autor autor = new Autor(fabrica);
        assertEquals("Publicar Coluna em Português", autor.publicarColuna());
    }

    @Test
    void deveEmitirColunaIngles() {
        FabricaAbstrata fabrica = new FabricaIngles();
        Autor autor = new Autor(fabrica);
        assertEquals("Publicar Coluna em Inglês", autor.publicarColuna());
    }

    @Test
    void deveEmitirArtigoPortugues() {
        FabricaAbstrata fabrica = new FabricaPortugues();
        Autor autor = new Autor(fabrica);
        assertEquals("Publicar Artigo em Português", autor.publicarArtigo());
    }

    @Test
    void deveEmitirArtigoIngles() {
        FabricaAbstrata fabrica = new FabricaIngles();
        Autor autor = new Autor(fabrica);
        assertEquals("Publicar Artigo em Inglês", autor.publicarArtigo());
    }


}
