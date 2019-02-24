package org.lasencinas.EnZinium;

import static org.junit.Assert.*;

import org.junit.Test;
import org.lasencinas.address.Address;

public class AddressTest {

	@Test
	public void generate_key_pair_test() {
		Address address = new Address();
		assertNotNull(address);
		address.generateKeyPair();
		assertNotNull(address.getPK());
		assertNotNull(address.getSK());
	}

	@Test
	public void comprobarBalance() {
		Address address = new Address();
		Double total = 0d;
		assertEquals(total, address.getBalance(), 0);

	}

	@Test
	public void comprobarSymbol() {
		Address address = new Address();
		String symbol = "EZI";
		assertEquals(symbol, address.symbol());

	}

//    @Test
//    public void transferEZI_test() {
//
//        Address rick = new Address();
//        rick.generateKeyPair();
//
//        rick.addEZI(20d);
//
//        rick.transferEZI(20d);
//
//        assertEquals(40d, rick.getBalance(), 0d);
//    }

}
