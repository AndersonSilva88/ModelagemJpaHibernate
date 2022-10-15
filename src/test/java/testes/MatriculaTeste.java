package testes;

import dao.matricula.IMatriculaDao;
import dao.matricula.MatriculaDao;
import domain.Matricula;
import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatriculaTeste {

    private IMatriculaDao matriculaDao;

    public MatriculaTeste() {
        matriculaDao = new MatriculaDao();
    }

    @Test
    public void cadastrar() {
        Matricula matricula = new Matricula();
        matricula.setCodigo("Ac");
        matricula.setDataMatricula(Instant.now());
        matricula.setStatus("ATIVA");
        matricula.setValor(2000.00);
        matricula = matriculaDao.cadastrar(matricula);

        assertNotNull(matricula);
        assertNotNull(matricula.getId());
    }


}
