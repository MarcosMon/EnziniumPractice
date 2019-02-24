package org.lasencinas.address;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

import org.lasencinas.gensig.GenSig;

public class Address {
	private PrivateKey SK = null;
	private PublicKey PK = null;
	private Double balance = 0d;
	private String symbol = "EZI";

	public Address() {

	}

	private void setSK(PrivateKey SK) {
		this.SK = SK;
	}

	private void setPK(PublicKey PK) {
		this.PK = PK;

	}

	public PrivateKey getSK() {
		return this.SK;
	}

	public PublicKey getPK() {
		return this.PK;
	}

	public Double getBalance() {
		return balance;
	}

	public String symbol() {

		return this.symbol;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void generateKeyPair() {

		KeyPair pair = GenSig.generateKeyPair();
		setPK(pair.getPublic());
		setSK(pair.getPrivate());

	}

	@Override
	public String toString() {
		return "PK = " + getPK().hashCode() + "\n" + "Balance = " + getBalance() + " " + symbol();
	}

}
