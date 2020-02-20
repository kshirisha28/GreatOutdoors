package com.cg.go.service;


	import java.util.List;

import com.cg.go.bean.Address;
	import com.cg.go.exception.AddressException;

	public interface AddressService {
		public boolean validateName(String City);
		public int addAddress(Address address) throws AddressException;
		public Address deleteAddressByUserId(int userId) throws AddressException;
		public List<Address> viewAllAddress() throws AddressException;

}
