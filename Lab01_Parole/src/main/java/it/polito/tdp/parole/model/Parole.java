package it.polito.tdp.parole.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Parole implements Comparable <Parole> {
	
	private String parola; 
	private List<String> lparole ;
	
	public Parole() {
		//this.parola=parola
		this.lparole = new LinkedList<String>();
	}
	
	public String getParola() {
		return parola;
	}

	public void setParola(String parola) {
		this.parola = parola;
	}

	public List<String> getLparole() {
		return lparole;
	}

	public void setLparole(List<String> lparole) {
		this.lparole = lparole;
	}

	public void addParola(String p) {
		if(!lparole.contains(p)) {
			lparole.add(p);
		}
	}
	
	public List<String> getElenco() {
		Collections.sort(lparole);
		return lparole;
	}
	
	public void reset() {
		lparole.clear();
	}

	//si può anche fare solo il collection sorto senza implementare comparable
	@Override
	public int compareTo(Parole o) {
		return this.getParola().compareTo(o.getParola());
	}

}
