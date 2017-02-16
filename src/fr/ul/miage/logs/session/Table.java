package fr.ul.miage.logs.session;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

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
		System.out.println(ip.getIp());
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
	
	/**
	 * Méthode qui permet de calculer le nombre total de session
	 * @return
	 */
	public int calculNombreSession(){
		// On déclare un compteur
		int nbSession = 0;
		// On crée un Set avec toutes les éléments de la table
		Set<IP> ip = table.keySet();
		// On crée un Iterator afin de parcourir chaque éléments de la table
		Iterator<IP> it = (Iterator<IP>)ip.iterator();
		// Tant que la table n'est pas parcouru
		while (it.hasNext()){
			// On selectionne l'élément suivant
			IP clef = (IP)it.next();
			// On incrémente le nombre de session par le nombre de session pour chaque IP
		    nbSession += table.get(clef).size();
		}
		// On retourne le nombre total de session
		return nbSession;
	}
	
	public double calculDureeMoyenneSession(){
		// On déclare les compteurs que nous avons besoin pour faire une moyenne
		int nbSession = 0;
		long tempsTotal = 0;
		// On crée un Set avec toutes les éléments de la table
		Set<IP> ip = table.keySet();
		// On crée un Iterator afin de parcourir chaque éléments de la table
		Iterator<IP> it = (Iterator<IP>)ip.iterator();
		// Tant que la table n'est pas parcouru
		while (it.hasNext()){
			// On selectionne l'élément suivant
			IP clef = (IP)it.next();
			Iterator<Session> it2 = (Iterator<Session>)table.get(clef).iterator();
			while(it2.hasNext()){
				Session session = (Session)it2.next();
				tempsTotal += session.getFin() - session.getDebut();
			}
			// On incrémente le nombre de session par le nombre de session pour chaque IP
		    nbSession += table.get(clef).size();
		}
		// On retourne le nombre total de session
		return (tempsTotal / nbSession);
	}
}
