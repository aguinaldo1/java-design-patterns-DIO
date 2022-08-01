package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test 
{
	
	public static void main (String [] args) 
	{
	
//Singleton:
	System.out.println("Singleton: ");
		
	SingletonLazy lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	
	SingletonEager eager = SingletonEager.getInstancia();
	System.out.println(eager);
	eager = SingletonEager.getInstancia();
	System.out.println(eager);
	
	SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);
	lazyHolder = SingletonLazyHolder.getInstancia();
	System.out.println(lazyHolder);
	
	//Strategy
	System.out.println("Strategy: ");
	
	Comportamento defensivo = new ComportamentoDefensivo();
	Comportamento normal = new ComportamentoNormal();
	Comportamento agressivo = new ComportamentoAgressivo();
	
	Robo robo = new Robo();
	robo.setComportamento(normal);
	robo.mover();
	robo.mover();
	
	robo.setComportamento(defensivo);
	robo.mover();
	
	robo.setComportamento(agressivo);
	robo.mover();
	robo.mover();
	robo.mover();
	
	//FAcade
	System.out.println("Facade: ");
	Facade facade = new Facade();
	facade.migrarCliente("Aguinaldo", "72710-080");
	}
}
