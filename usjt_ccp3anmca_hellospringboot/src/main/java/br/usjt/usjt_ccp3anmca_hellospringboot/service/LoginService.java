package br.usjt.usjt_ccp3anmca_hellospringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Usuario;
import br.usjt.usjt_ccp3anmca_hellospringboot.model.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public boolean logar (Usuario usuario) {
		return usuarioRepo.
				findOneByLoginAndSenha(
						usuario.getLogin(), 
						usuario.getSenha()) != null;
	}
	
}
