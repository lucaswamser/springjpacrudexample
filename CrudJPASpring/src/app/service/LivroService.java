package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import app.modelo.Livro;

public interface LivroService {
	
	
	public void adicionar(Livro livro);
	public void atualizar(Livro livro);
	public void remover(Integer livro);
	public Livro carregar(Integer id);
	public List<Livro> listar();
	
	

}
