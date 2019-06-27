package usjt_ecp6anmca1.veiculos.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt_ecp6anmca1.veiculos.model.bean.Usuario;
import usjt_ecp6anmca1.veiculos.model.service.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@GetMapping(value = { "/login", "/" })
	public ModelAndView login() {
		Usuario usuario = new Usuario();
		ModelAndView mv = new ModelAndView("login");
		mv.addObject(usuario);
		return mv;
	}

	@PostMapping("/fazerLogin")
	public String fazerLogin(HttpServletRequest request, Usuario usuario) {
		if (loginService.logar(usuario)) {
			request.getSession().setAttribute("usuarioLogado", usuario);
			return "redirect:/veiculos";
		} else {
			return "login";
		}
	}

}
