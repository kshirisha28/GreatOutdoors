package com.cg.go.pl;

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
		Address address = new Address();
		System.out.println("1.Add address");
		//System.out.println("3.Update address");
		System.out.println("2.Delete address");
		
		System.out.println("3.exit");
		
		while(true)
		{
			System.out.println("Enter your Choice : ");
			choice = sc.nextInt();
			
			
			
			switch(choice)
			{
			case 1:
				
				 System.out.println("enter userId : ");
				 String uid = sc.nextLine();
				 sc.nextLine();
				 System.out.println("enter DoorNo : ");
				 String bid= sc.nextLine();
				// sc.nextLine();
				System.out.println("Enter City : ");
				sc.nextLine();
				String cname = sc.nextLine();
				System.out.println("Enter State : ");
				String sname = sc.nextLine();
				System.out.println("Enter country : ");
				String ctname = sc.nextLine();
				//address = new Address();
				//address.setAddressId(aid);
				address.setUserId(uid);
				address.setDoorNo(bid);
				address.setCityName(cname);
				address.setStateName(sname);
				//System.out.println("Enter country : ");
			//	String ctname = sc.nextLine();
				//address = new Address();
				address.setStateName(ctname);
				try
				{
				String cn = addressService.addAddress(address);
				System.out.println(cn);
				}
				catch(AddressException e)
				{
					System.err.println(e.getMessage());
				}
			
		case 2:
			System.out.println("enter city ");
			String cn1 = sc.nextLine();
				try
				{
				String ads = addressService.deleteAddress(address);
					System.out.println("succesfully deleted");
				
				System.out.println("Delete  state: "+address.getStateName());
					System.out.println("Deleted country: "+address.getCountryName());
				}
				catch(AddressException e)
				{
					System.err.println(e.getMessage());
				}
			
			case 3:
				System.out.println("thankyou");
				return;
			default :
				System.err.println("Incorrect Choice");
				System.out.println("Please Enter Correct Choice");
				break;
			}
		}
	}

}


