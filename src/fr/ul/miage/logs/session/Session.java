package fr.ul.miage.logs.session;

public class Session {
	private long debut, fin;
	
	public Session(long debut, long fin){
		this.debut = debut;
		this.fin = fin;
	}

	public long getDebut() {
		return debut;
	}

	public void setDebut(long debut) {
		this.debut = debut;
	}

	public long getFin() {
		return fin;
	}

	public void setFin(long fin) {
		this.fin = fin;
	}
}