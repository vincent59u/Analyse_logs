package fr.ul.miage.logs.session;

import java.util.HashMap;
import java.util.LinkedList;

public class Table {
	private HashMap<IP, LinkedList<Session>> table;
	
	public Table(){
		this.table = new HashMap<IP, LinkedList<Session>>();
	}

	public HashMap<IP, LinkedList<Session>> getTable() {
		return table;
	}

	public void setTable(HashMap<IP, LinkedList<Session>> table) {
		this.table = table;
	}
	
	public void ajouter(IP ip, long date){
		if(table.containsKey(ip)){
			if(table.get(ip).getLast().getDebut() + 600000 >= date){
				if(table.get(ip).getLast().getFin() < date){
					table.get(ip).getLast().setFin(date);
				}
			}else{
				table.get(ip).add(new Session(date, date));
			}
		}else{
			LinkedList<Session> session = new LinkedList<Session>();
	        session.add(new Session(date, date));
			table.put(ip, session);
		}
	}
}
