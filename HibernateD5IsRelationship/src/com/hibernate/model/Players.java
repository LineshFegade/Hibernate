package com.hibernate.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="hibplayerinfo")
@Inheritance(strategy =InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="playerType",discriminatorType = DiscriminatorType.STRING,length = 30)
public class Players {
	@Id
	@Column(name="player_id")
	 private int playerId;
	
	@Column(name="player_name")
     private String playerName;
	
	@Column(name="numberOf_match")
	 private int numMatches;
	
	 @Embedded
	 Address resAddr;
	public Players() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Players(int playerId, String playerName, int numMatches, Address resAddr) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.numMatches = numMatches;
		this.resAddr = resAddr;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getNumMatches() {
		return numMatches;
	}
	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}
	public Address getResAddr() {
		return resAddr;
	}
	public void setResAddr(Address resAddr) {
		this.resAddr = resAddr;
	}
	@Override
	public String toString() {
		return "Players [playerId=" + playerId + ", playerName=" + playerName + ", numMatches=" + numMatches
				+ ", resAddr=" + resAddr + "]";
	}
	 
}
