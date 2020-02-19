package com.cg.go.service;


	import com.cg.go.bean.Address;
	import com.cg.go.exception.AddressException;

	public interface AddressService {
		public boolean validateName(String City);
		public String addAddress(Address address) throws AddressException;
		public String deleteAddress(Address address) throws AddressException;
	

}
