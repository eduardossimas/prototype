package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Produto produto = new Produto(123, "Produto Original", new Fornecedor("Fornecedor A", 1), "Eletrônicos");

        Produto produtoClone = produto.clone();
        produtoClone.setCodigo(456);
        produtoClone.setNome("Produto Clonado");
        produtoClone.getFornecedor().setCodigoFilial(2);

        assertEquals("Produto{codigo=123, nome='Produto Original', fornecedor=Fornecedor{nome='Fornecedor A', codigoFilial=1}, categoria='Eletrônicos'}", produto.toString());
        assertEquals("Produto{codigo=456, nome='Produto Clonado', fornecedor=Fornecedor{nome='Fornecedor A', codigoFilial=2}, categoria='Eletrônicos'}", produtoClone.toString());
    }
}
