package br.unipar.programacaointernet.servicecep.bibliotecaapi.service;

import br.unipar.programacaointernet.servicecep.bibliotecaapi.model.Livro;
import br.unipar.programacaointernet.servicecep.bibliotecaapi.repository.LivroRepository;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

import java.util.List;

@Stateless
public class LivroService {
    @Inject
    private LivroRepository livroRepository;

    public List<Livro> listar(){
        return livroRepository.listar();
    }
    public void cadastrar(Livro livro) throws Exception{
        livroRepository.cadastrar(livro);
    }
}
