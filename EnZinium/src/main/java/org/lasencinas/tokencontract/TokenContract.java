package org.lasencinas.tokencontract;

import java.security.PublicKey;

import org.lasencinas.address.Address;

public class TokenContract {

	private String name = null;
	private String symbol = null;
	private double totalSupply = 0d;
	private Address owner = null;

	public TokenContract() {

	}

	public TokenContract(Address rick) {
		this.setOwnerPK(rick);
	}

	private void setOwnerPK(Address rick) {
		this.owner = rick;

	}

	public Address getOwnerPK() {
		return this.owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTotalSupply() {
		return totalSupply;
	}

	public void setTotalSupply(double totalSupply) {
		this.totalSupply = totalSupply;
	}

	public String symbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
	public String toString() {
		return "name = " + getName() + "\n" + "totalSupply = " + getTotalSupply() + "\n" + "symbol = " + symbol() + "\n"
				+ "Owner PK = " + getOwnerPK().getPK().hashCode();
	}

}
