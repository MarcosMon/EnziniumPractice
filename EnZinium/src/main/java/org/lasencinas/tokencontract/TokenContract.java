package org.lasencinas.tokencontract;

import java.security.PublicKey;
import java.util.HashMap;

import org.lasencinas.address.Address;

public class TokenContract {

	private String name = null;
	private String symbol = null;
	private double totalSupply = 0d;
	private Address owner = null;
	HashMap<PublicKey, Double> balances = new HashMap<>();

	public TokenContract() {

	}

	public TokenContract(Address rick) {
		this.setOwnerPK(rick);
	}

	public HashMap<PublicKey, Double> getBalances() {
		return this.balances;
	}

	public Address getOwnerPK() {
		return this.owner;
	}

	public String getName() {
		return name;
	}

	public String symbol() {
		return symbol;
	}

	public double totalSupply() {
		return totalSupply;
	}

	public void setName(String name) {
		this.name = name;
	}

	private void setOwnerPK(Address rick) {
		this.owner = rick;

	}

	public void setTotalSupply(double totalSupply) {
		this.totalSupply = totalSupply;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void addOwner(PublicKey pk, double totalSupply) {
		this.getBalances().putIfAbsent(pk, totalSupply);
	}

	@Override
	public String toString() {
		return "name = " + getName() + "\n" + "totalSupply = " + totalSupply() + "\n" + "symbol = " + symbol() + "\n"
				+ "Owner PK = " + getOwnerPK().getPK().hashCode();
	}

	public int numOwners() {
		return this.getBalances().size();
	}

}
