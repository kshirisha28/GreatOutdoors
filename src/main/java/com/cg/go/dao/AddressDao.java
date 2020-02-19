package com.cg.go.dao;
import java.util.*;

import com.cg.go.bean.Address;
import com.cg.go.exception.AddressException;

public interface AddressDao  {
	public String addAddress(Address address) throws AddressException;
	//public String updateAddress(Address address) throws AddressException;
	public Address deleteAddressByuserId(String userId  ) throws AddressException;
public List<Address>ViewAllAddress() throws AddressException;
}
