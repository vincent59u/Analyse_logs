package fr.ul.miage.logs.session;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Classe qui permet de construire une table qui contient toutes les informations des différentes sessions des différents utilisateurs (ip)
 * @author Matthieu
 */
public class Table {
	/**
	 * Attribut de la classe
	 */
	private HashMap<IP, LinkedList<Session>> table;
	
	/**
	 * Constructeur de la classe
	 */
	public Table(){
		this.table = new HashMap<IP, LinkedList<Session>>();
	}

	/**
	 * Getter qui retourne la table
	 * @return
	 */
	public HashMap<IP, LinkedList<Session>> getTable() {
		return table;
	}

	/**
	 * Setter qui permet de modifier la table
	 * @param table
	 */
	public void setTable(HashMap<IP, LinkedList<Session>> table) {
		this.table = table;
	}
	
	/**
	 * Metthode qui permet d'ajouter un utilisateur et/ou une session à la table
	 * @param ip
	 * @param date
	 */
	public void ajouter(IP ip, long date){
		// On vérifie si l'ip est déjà présente dans la table
		if(table.containsKey(ip)){
			// Si la date placé en paramètre est comprise dans un intervale de 10 minutes par rapport à au début de la dernière session
			if(table.get(ip).getLast().getDebut() + 600000 >= date){
				// Si la date est supérieur à la date de fin de la dernière session
				if(table.get(ip).getLast().getFin() < date){
					// On modifie cette date
					table.get(ip).getLast().setFin(date);
				}
			}else{
				table.get(ip).add(new Session(date, date));
			}
		// Sinon on ajoute l'ip dans la table
		}else{
			// On crée une List qui contiendra la ou les sessions de l'ip
			LinkedList<Session> session = new LinkedList<Session>();
			// On initialise une nouvelle session qui a pour début et fin la date placée en paramètre
	        session.add(new Session(date, date));
	        // On ajoute dans la table l'ip et la session associée
			table.put(ip, session);
		}
	}
}
