package command;

import receiver.EnregistreurImpl;
/**
 * DemarrerEgt.java
 * Commande permettant de lancer l'enregistrement
 * @author LEBLANC Adrien
 * @author BUSSEREAU Keryann
 * @version 3.0 V3 du projet mini-editeur
 */
public class DemarrerEgt implements Command {

	private final EnregistreurImpl enregistreur;
		
	public DemarrerEgt(EnregistreurImpl enregistreur) {
		this.enregistreur = enregistreur;
	}
	
	@Override
	public void execute() {
		enregistreur.demarrer();
	}

}
