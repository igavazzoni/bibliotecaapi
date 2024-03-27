package br.unipar.programacaointernet.servicecep.bibliotecaapi.repository;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Livro;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;
@Stateless
public class LivroRepository {

    @PersistenceContext(unitName = "HibernateMaven")
    private EntityManager em;

    public List<Livro> listar(){
        String jpql = "SELECT l FROM Livro l";
        return em.createQuery(jpql, Livro.class).getResultList();
    }
   public void cadastrar(Livro livro) throws Exception{
        try{
            em.persist(livro);
        }catch (Exception ex){
            throw new Exception("Livro nao pode ser cadastrado");
        }
   }
}
