package br.usjt.usjt_ccp3anmca_hellospringboot.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.usjt_ccp3anmca_hellospringboot.model.bean.Usuario;

public interface UsuarioRepository 
					extends JpaRepository<Usuario, Long>{
	public Usuario findOneByLoginAndSenha (String login, String senha);

}
