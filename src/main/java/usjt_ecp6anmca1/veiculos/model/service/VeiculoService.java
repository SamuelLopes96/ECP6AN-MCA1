package usjt_ecp6anmca1.veiculos.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import usjt_ecp6anmca1.veiculos.model.bean.Calculadora;
import usjt_ecp6anmca1.veiculos.model.bean.Veiculo;
import usjt_ecp6anmca1.veiculos.repository.VeiculosRepository;

@Service
public class VeiculoService {
	@Autowired
	private VeiculosRepository veiculoRepo;
	
	@Autowired
	private Calculadora calculadora;
	
	
	
	
}
