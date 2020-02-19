package com.cg.go.service;


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

		public String addAddress(Address address) throws AddressException {
			// TODO Auto-generated method stub
		String city = address.getCityName();
		String state = address.getStateName();
	//	String country = address.getCountry();
			boolean flag = validateName (city);
			if(!flag)
			{
				throw new AddressException("Name should contain only alphabets");
			}
			/*Random random = new Random();
			int c= random.nextInt(100)+1000;
			address.setCity(c+ "");
			 String sc=addressDao.addAddress(address);*/
			return "";
			
		}
		/* public String updateAddress1(Address address) throws AddressException {
				
				boolean flag = validate(address.getCity()+address.getState()+address.getCountry());
				
				if(flag)
				{
					address.getCity();
					address.getState();
					address.getCountry();	
				}
				else
				{
					throw new AddressException(" Not Found");
				}
				return address.getCity()+address.getState()+address.getCountry();
			}   
			
			*/
		
		
		public String deleteAddress(Address address) throws AddressException {
			String Address= String.valueOf(address);
			if(!Address.matches("^[a-zA-Z]+$"))
			{
				throw new AddressException("address should be in alphabets");
		}
			return Address;
		}
	}


