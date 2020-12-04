package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="Batsman")
public class Batsman extends Players{
	@Column(name="numberOf_Runs")
	private  long numRuns;

	public Batsman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int playerId, String playerName, int numMatches, Address resAddr,long numRuns) {
		super(playerId, playerName, numMatches, resAddr);
		this.numRuns = numRuns;
	}

	public long getNumRuns() {
		return numRuns;
	}

	public void setNumRuns(long numRuns) {
		this.numRuns = numRuns;
	}

	@Override
	public String toString() {
		return "Batsman [numRuns=" + numRuns + ", resAddr=" + resAddr + ", getNumRuns()=" + getNumRuns()
				+ ", getPlayerId()=" + getPlayerId() + ", getPlayerName()=" + getPlayerName() + ", getNumMatches()="
				+ getNumMatches() + ", getResAddr()=" + getResAddr() + "]";
	}
	
	
}
