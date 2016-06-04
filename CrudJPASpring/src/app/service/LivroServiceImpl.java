package app.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.modelo.Livro;
import app.repositories.LivroRepositorio;


@Service
public class LivroServiceImpl implements LivroService {

	@Resource
	private LivroRepositorio livroRepository;
	
	@Override
	public void adicionar(Livro livro) {
		livroRepository.save(livro);
	}

	@Override
	public void atualizar(Livro livro) {
		livroRepository.save(livro);
		
	}
	

	@Override
	public void remover(Integer id) {
		livroRepository.delete(id);
		
	}

	@Override
	public Livro carregar(Integer id){
		return livroRepository.findOne(id);
	}
	
	@Override
	public List<Livro> listar() {
		return livroRepository.findAll();
	}

	
}
