package factorys;

import impl.Embaralhador01;
import impl.Embaralhador02;
import interfaces.Embaralhador;

public class FabricaEmbalharadores {

	public Embaralhador defineEmbaralhador() {
		Embaralhador embaralhador;
		if (Math.random() > 0.5) {
			embaralhador = new Embaralhador01();
		} else {
			embaralhador = new Embaralhador02();
		}
		return embaralhador;
	}
}
