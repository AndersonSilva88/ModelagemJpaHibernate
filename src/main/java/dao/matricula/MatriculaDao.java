package dao.matricula;

import dao.matricula.IMatriculaDao;
import domain.Matricula;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MatriculaDao implements IMatriculaDao {
    @Override
    public Matricula cadastrar(Matricula matricula) {

        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("curso-ebac");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(matricula);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }
}
