package br.usjt.usjt_ccp3anmca_hellospringboot.model.bean;

public class Calculadora {
	
	public double calculaMedia (double...notas) {
		double ac = 0;
		for (Double d : notas) {
			ac += d;
		}
		return ac / notas.length;
	}

}
