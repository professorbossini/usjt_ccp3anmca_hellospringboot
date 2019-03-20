package br.usjt.usjt_ccp3anmca_hellospringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Aluno;

public interface AlunosRepository extends JpaRepository<Aluno, Long>{
	
}
