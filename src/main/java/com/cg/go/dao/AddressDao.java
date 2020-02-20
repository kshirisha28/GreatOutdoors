package com.cg.go.dao;
import java.util.*;

import com.cg.go.bean.Address;
import com.cg.go.exception.AddressException;

public interface AddressDao  {
	public int addAddress(Address address) throws AddressException;
	public Address deleteAddressByUserId(int userId) throws AddressException;
	public List<Address>viewAllAddress() throws AddressException;
}
