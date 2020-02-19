package com.cg.go.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.go.bean.Address;
import com.cg.go.exception.AddressException;

public class AddressDaoMapImpl implements AddressDao {
 private Map<String , Address> map;
 public AddressDaoMapImpl()
 {
	 map= new HashMap<String,Address>();
 }
@Override
public String addAddress(Address address) throws AddressException {
	boolean flag = map.containsKey(address.getUserId());
	if(flag)
	{
		throw new AddressException("ID already Exist");
	}
	map.put(address.getUserId(), address);
	return address.getUserId();

}
@Override
public Address deleteAddressByuserId(String userId) throws AddressException {
	// TODO Auto-generated method stub
	Address address = null;
	if(map.containsKey(userId))
		address = map.remove(userId);
	else
		throw new AddressException(userId+" Id not found");
	return address;

}
@Override
public List<Address> ViewAllAddress() throws AddressException {
	// TODO Auto-generated method stub
	return null;
}
}
	
