package org.lasencinas.EnZinium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.lasencinas.address.Address;
import org.lasencinas.tokencontract.TokenContract;

public class TokenContractTest {

	@Test
	public void comprobarPKOwner() {
		Address rick = new Address();
		TokenContract ricknillos = new TokenContract(rick);
		assertNotNull(ricknillos.getOwnerPK());
	}

	@Test
	public void comprobarNombre() {
		TokenContract tokencontract = new TokenContract();
		String name = "Ricknillos";
		tokencontract.setName(name);
		assertEquals(name, tokencontract.getName());
	}

	@Test
	public void comprobarSymbol() {
		TokenContract tokencontract = new TokenContract();
		String symbol = "RNiLL";
		tokencontract.setSymbol(symbol);
		assertEquals(symbol, tokencontract.symbol());
	}

	@Test
	public void comprobarTotalSupply() {
		TokenContract tokencontract = new TokenContract();
		Double totalSupply = 100d;
		tokencontract.setTotalSupply(totalSupply);
		assertEquals(totalSupply, tokencontract.totalSupply(), 0);
	}
	@Test
	public void comprobarBalance() {
		Address rick = new Address();
		TokenContract ricknillos = new TokenContract(rick);
		ricknillos.setTotalSupply(100);
		ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
		ricknillos.addOwner(rick.getPK(), 500d);
		assertEquals(100, ricknillos.getBalances().get(rick.getPK()), 0);
	}

//    @Test
//    public void payable_test() {
//
//        Address rick = new Address();
//        rick.generateKeyPair();
//        TokenContract ricknillos = new TokenContract(rick);
//        ricknillos.addOwner(rick.getPK(), 100d);
//        Address morty = new Address();
//        morty.generateKeyPair();
//
//        morty.addEZI(20d);
//
//        // verifico la transferencia de entradas
//        ricknillos.payable(morty.getPK(), morty.getBalance());
//        assertEquals(4d, ricknillos.balanceOf(morty.getPK()), 0d);   
//
//        // verifico la trasnferencia de EZI
//        assertEquals(20d, ricknillos.owner().getBalance(), 0d);
//    }
}
