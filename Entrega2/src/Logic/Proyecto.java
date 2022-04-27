package Logic;

import java.util.Observable;

public class Proyecto extends Observable{
	private String nombreProyecto;
	
	public void notificar() {
		this.addObserver(null);
	}
}
