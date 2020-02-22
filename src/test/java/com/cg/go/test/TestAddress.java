package com.cg.go.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.go.bean.Address;
import com.cg.go.dao.AddressDao;
import com.cg.go.dao.AddressDaoMapImpl;

class TestAddress {
AddressDao dao=null;
@BeforeEach
public void setup()
{
	dao = new AddressDaoMapImpl();
}
	@Test
	void testaddAddress() throws Exception{
		Address address = new Address();
		address.setUserId(1001);
		dao.addAddress(address);
		List<Address> l=dao.viewAllAddress();
		assertEquals(1,l.size());
		
	}

}
