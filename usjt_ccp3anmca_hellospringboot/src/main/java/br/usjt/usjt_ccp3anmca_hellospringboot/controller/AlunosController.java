package br.usjt.usjt_ccp3anmca_hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Aluno;
import br.usjt.usjt_ccp3anmca_hellospringboot.service.AlunosService;

@Controller
public class AlunosController {
	
	//injetando um service
	@Autowired
	private AlunosService alunosService;
	
	//@Autowired
	//private AlunosRepository alunosRepo;
	
	//@Autowired
	//public AlunosController (AlunosRepository alunosRepo) {
		//this.alunosRepo = alunosRepo;
	//}
	
	@GetMapping ("/alunos")
	public ModelAndView listarAlunos () {
		ModelAndView mv = new ModelAndView ("lista_alunos");
		mv.addObject(new Aluno());
		List <Aluno> alunos = alunosService.listarTodos();
		mv.addObject("alunos", alunos);
		return mv;
	}
	@PostMapping ("/alunos")
	public String salvar (Aluno aluno) {
		alunosService.salvar(aluno);
		return "redirect:/alunos";
	}
	
}
