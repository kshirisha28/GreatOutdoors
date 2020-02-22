package com.cg.go.service;


	import java.util.List;
import java.util.Random;

	import com.cg.go.bean.Address;
	import com.cg.go.dao.AddressDao;
	import com.cg.go.dao.AddressDaoMapImpl;
	import com.cg.go.exception.AddressException;

	public class AddressServiceImpl implements AddressService {
	private AddressDao addressDao;
		
		public AddressServiceImpl()
		{
			addressDao = new AddressDaoMapImpl();
		
		}
		public boolean validateName(String City) {
		
			boolean flag = false;
			flag=City.matches("[a-zA-z]+");
			return flag;
			
		}
		public boolean validateName1(String State) {
			
			boolean flag = false;
			flag=State.matches("[a-zA-z]+");
			return flag;
			
		}
		public boolean validateName11(String Country) {
			
			boolean flag = false;
			flag=Country.matches("[a-zA-z]+");
			return flag;
			
		}

		public int addAddress(Address address) throws AddressException {
			String city = address.getCityName();
			String state = address.getStateName();
			String country = address.getCountryName();
			boolean flag = validateName(city);
			if(!flag)
			{
				throw new AddressException("Name should contain only alphabets");
			}
			Random random = new Random();
			int id = random.nextInt(100)+1000;
			address.setUserId(id);
			id=addressDao.addAddress(address);
			return id;
			
		}
		
		public Address deleteAddressByUserId(int userId) throws AddressException {
		
			return  addressDao.deleteAddressByUserId(userId);
		}
		public List<Address> viewAllAddress() throws AddressException {
			
			return addressDao.viewAllAddress();
		}
		
		
	}


