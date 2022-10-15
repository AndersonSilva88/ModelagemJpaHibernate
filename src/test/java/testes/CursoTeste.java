package testes;

import dao.curso.CursoDao;
import dao.curso.ICursoDao;
import domain.Curso;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CursoTeste {

    private ICursoDao cursoDao;

    public CursoTeste() {
        cursoDao = new CursoDao();
    }

    @Test
    public void cadastrar() {
        Curso curso = new Curso();
        curso.setCodigo("10");
        curso.setDescricao("Curso java");
        curso.setNome("Curso back-end java");
        curso =  cursoDao.cadastrar(curso);

        assertNotNull(curso);
        assertNotNull(curso.getId());
    }
}
