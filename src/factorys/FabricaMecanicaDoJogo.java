package factorys;

import impl.Mecanica01;
import impl.Mecanica02;
import interfaces.MecanicaDoJogo;

public class FabricaMecanicaDoJogo {

	public MecanicaDoJogo defineMecanica() {
		MecanicaDoJogo mecanica;
		if (Math.random() > 0.5) {
			mecanica = new Mecanica01();
		} else {
			mecanica = new Mecanica02();
		}
		return mecanica;
	}

}
