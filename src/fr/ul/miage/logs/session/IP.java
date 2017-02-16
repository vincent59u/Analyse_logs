package fr.ul.miage.logs.session;

import java.util.Objects;

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
	
	@Override
    public int hashCode() {
		return Objects.hash(ip);
    }

    @Override
    public boolean equals(Object obj) {
    	if (obj == this){
    		return true;
    	}
    	if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        IP i = (IP)obj;
        return Objects.equals(this.ip, i.ip);
    }
}