package br.usjt.usjt_ccp3anmca_hellospringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Aluno;
import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Calculadora;
import br.usjt.usjt_ccp3anmca_hellospringboot.model.repository.AlunosRepository;

@Service
public class AlunosService {
	
	@Autowired
	private AlunosRepository alunosRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	public void salvar (Aluno aluno) {
		alunosRepo.save(aluno);
	}
	
	public List <Aluno> listarTodos (){
		List<Aluno> list = alunosRepo.findAll();
		for (Aluno aluno : list) {
			aluno.setMediaNotas(
					calculadora.calculaMedia(
							 aluno.getNota1(),
							 aluno.getNota2()
					)
			);
		}
		return list;
	}

}
