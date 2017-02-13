package fr.ul.miage.logs.session;

/**
 * Classe qui modélise une adresse IP
 * @author Matthieu
 */
public class IP {
	/**
	 * Attribut de la classe
	 */
	private String ip;
	
	/**
	 * Constructeur de la classe
	 * @param ip
	 */
	public IP(String ip){
		this.ip = ip;
	}

	/**
	 * Getter qui retourne l'ip
	 * @return
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * Setter qui permet de modifier l'ip
	 * @param ip
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
}
