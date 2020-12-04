package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="bowler")
public class Bowler extends Players{
	@Column(name="numberOf_wikcets")
	private long numWickets;

	public Bowler() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int playerId, String playerName, int numMatches, Address resAddr,long numWickets) {
		super(playerId, playerName, numMatches, resAddr);
		this.numWickets = numWickets;
	}

	public long getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(long numWickets) {
		this.numWickets = numWickets;
	}

	@Override
	public String toString() {
		return "Bowler [numWickets=" + numWickets + ", resAddr=" + resAddr + ", getNumWickets()=" + getNumWickets()
				+ ", getPlayerId()=" + getPlayerId() + ", getPlayerName()=" + getPlayerName() + ", getNumMatches()="
				+ getNumMatches() + ", getResAddr()=" + getResAddr() + "]";
	}
	
	
	

	
	
	
	
}
