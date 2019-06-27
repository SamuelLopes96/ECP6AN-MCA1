package usjt_ecp6anmca1.veiculos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt_ecp6anmca1.veiculos.model.bean.Veiculo;
import usjt_ecp6anmca1.veiculos.repository.VeiculosRepository;

@Controller
public class VeiculosController {
		@Autowired
		private VeiculosRepository veiculosRepository;
		
		@GetMapping("/veiculos")
		public ModelAndView listarVeiculos() {
			ModelAndView mv = new ModelAndView("lista_veiculos");
			List <Veiculo> veiculo = veiculosRepository.findAll();
			mv.addObject("veiculos", veiculo);
			
			mv.addObject("veiculo", new Veiculo());
			return mv;
		}
		
		@PostMapping
		public String salvar (Veiculo veiculo) {
			veiculosRepository.save(veiculo);
			return "redirect:/veiculos";
		}
		
		public List<Veiculo> listarTodos(){
			return veiculosRepository.findAll();
			
		}
}
