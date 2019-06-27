package usjt_ecp6anmca1.veiculos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import usjt_ecp6anmca1.veiculos.model.bean.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findOneByLoginAndSenha (String login, String senha);
}
