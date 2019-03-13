package br.usjt.usjt_ccp3anmca_hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.Aluno;
import br.usjt.usjt_ccp3anmca_hellospringboot.model.repository.AlunosRepository;

@Controller
public class AlunosController {
	
	@Autowired
	private AlunosRepository alunosRepo;
	
	@GetMapping ("/alunos")
	public ModelAndView listarAlunos () {
		ModelAndView mv = new ModelAndView ("lista_alunos");
		mv.addObject(new Aluno());
		List <Aluno> alunos = alunosRepo.findAll();
		mv.addObject("alunos", alunos);
		return mv;
	}
	@PostMapping ("/alunos")
	public String salvar (Aluno aluno) {
		alunosRepo.save(aluno);
		return "redirect:/alunos";
	}
	
}
