package one.digitalinnovation.gof.strategy;

public class ComportamentoAgressivo implements Comportamento {
	
	@Override
	public void mover() {
		System.out.print("Movendo-se normalmente...");
	}

}
