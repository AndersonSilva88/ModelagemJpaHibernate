package testes;

import dao.produto.IProdutoDao;
import dao.produto.ProdutoDao;
import domain.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoTeste {

    private IProdutoDao produtoDao;

    public ProdutoTeste() {
        produtoDao = new ProdutoDao();
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("1234");
        produto.setDescricao("Caneta");
        produto.setQuantidade(10);
        produto = produtoDao.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
