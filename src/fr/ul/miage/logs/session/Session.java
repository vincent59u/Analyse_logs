package fr.ul.miage.logs.session;

/**
 * Class qui permet de modéliser une session
 * Chaque session dure au maximum dix minutes
 * @author Matthieu
 */
public class Session {
	/**
	 * Attributs de la classe session
	 * Correspond à la date de début et de fin d'une sessions
	 */
	private long debut, fin;
	
	/**
	 * Constructeur de la classe
	 * @param debut
	 * @param fin
	 */
	public Session(long debut, long fin){
		this.debut = debut;
		this.fin = fin;
	}

	/**
	 * Getter qui retourne le début d'une session
	 * @return
	 */
	public long getDebut() {
		return debut;
	}

	/**
	 * Setter qui permet de modifier le début d'une session
	 * @param debut
	 */
	public void setDebut(long debut) {
		this.debut = debut;
	}

	/**
	 * Getter qui retourne la fin d'une session
	 * @return
	 */
	public long getFin() {
		return fin;
	}

	/**
	 * Setter qui permet de modifier la fin d'une session
	 * @param fin
	 */
	public void setFin(long fin) {
		this.fin = fin;
	}
}