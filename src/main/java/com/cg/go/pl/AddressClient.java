package com.cg.go.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.go.bean.Address;
import com.cg.go.exception.AddressException;
import com.cg.go.service.AddressService;
import com.cg.go.service.AddressServiceImpl;

public class AddressClient {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		AddressService addressService = new AddressServiceImpl();
		
		int choice = 0;
		Address address = null;
		List<Address> list = null;
		while(true)
		{
		System.out.println("1.Add address");
		System.out.println("2.Delete address");
		System.out.println("3.List all address");
		System.out.println("4.exit");
		System.out.println("Enter your Choice : ");
		choice = sc.nextInt();
			
		switch(choice)
			{
			case 1:
				
				 System.out.println("enter DoorNo : ");
				 sc.nextLine();
				 String dno= sc.nextLine();
				System.out.println("Enter City : ");
				String cname = sc.nextLine();
				System.out.println("Enter State : ");
				String sname = sc.nextLine();
				System.out.println("Enter country : ");
				String ctname = sc.nextLine();
				address = new Address();
				address.setDoorNo(dno);
				address.setCityName(cname);
				address.setStateName(sname);
				address.setCountryName(ctname);
				
				try
				{
				int id = addressService.addAddress(address);
				System.out.println("User ID = "+id);
				}
				catch(AddressException e)
				{
					System.err.println(e.getMessage());
				}
			break;
			
		case 2:
			System.out.println(" enter userId :  ");
			int cn1 = sc.nextInt();
				try
				{
				address = addressService.deleteAddressByUserId(cn1);
					System.out.println("succesfully deleted of user id = "+cn1);
				
				}
				catch(AddressException e)
				{
					System.err.println(e.getMessage());
				}
			break;
			
			case 3:
				try
				{
					list=addressService.viewAllAddress();
					for(Address a : list)
					{
						System.out.println("userId = "+a.getUserId());
						System.out.println("doorno = "+a.getDoorNo());
						System.out.println("city name = "+a.getCityName());
						System.out.println("state name = "+a.getStateName());
						System.out.println("country name = "+a.getCountryName());
					}
				}
				catch(AddressException e)
				{
					System.out.println(e.getMessage());
				}
				break;
			case 4 :
				System.out.println("Thank You");
				return;
			default :
				System.err.println("Incorrect Choice");
				System.out.println("Please Enter Correct Choice");
				break;
			}
		}
	}

}


