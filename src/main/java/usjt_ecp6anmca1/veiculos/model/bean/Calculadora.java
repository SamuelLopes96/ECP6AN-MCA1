package usjt_ecp6anmca1.veiculos.model.bean;

public class Calculadora {
	public double calculaMedia (double...notas) {
		double m = 0;
		for (Double d : notas) {
			m += d;
		}
		return m / notas.length;
	}


}
