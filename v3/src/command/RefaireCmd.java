package command;

import receiver.HistoriqueImpl;
/**
 * @(#) RefaireCmd.java
 * Commande permetant refaire une action annul�e
 * @author LEBLANC Adrien && BUSSEREAU Keryann
 * @version 3.0 V3 du projet mini-editeur
 */
public class RefaireCmd implements Command {

	private final HistoriqueImpl historique;

	public RefaireCmd (HistoriqueImpl historique) {
		this.historique = historique;
	}
	
	@Override
	public void execute() {
		historique.refaire();
	}

}
