package example.java;

import java.util.Scanner;

// class user have two child classes client and visitor 
class visitor extends User{
	private String visName;
	protected String vispassword;
	
	public visitor(String visName, String vispassword) {
		super();
		this.visName = visName;
		this.vispassword = vispassword;
	}
	public String getVisName() {
		return visName;
	}
	public String getVispassword() {
		return vispassword;
	}
	
	
	
	
}

class client extends User {
	private String cliName;
	protected String password;
	public String email;
	public int Id;
	
	
	
	public client(String cliName, String password, String email, int id) {
		super();
		this.cliName = cliName;
		this.password = password;
		this.email = email;
		this.Id = id;
	}


	public String getCliName() {
		return cliName;
	}


	public String getPassword() {
		return password;
	}


	public String getEmail() {
		return email;
	}


	public int getId() {
		return Id;
	}


	
}	
	
public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println();
		
		
		
		
		System.out.println("Welcome to the Client database:=======\t====\t");
		
			System.out.println("Choice ur options for operation: ");
			int choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				addNewClient();
			//case 2:
				//System.out.println("Enter the Id which one u want to delete:  ");
				//int did=sc.nextInt();
				//deleteClient(did);
			//case 3:
				//System.out.println("For updating ");
				
			case 0:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
			}
		

	}
	
	public static void addNewClient() {
		String name, email;
		int id;
		Scanner no=new Scanner(System.in);
		System.out.println("Enter the name :");
		name=no.next();
		System.out.println("Enter the email :");
		email=no.next();
		System.out.println("Enter the Id: ");
		id=no.nextInt();
		
	}
	//public static void deleteClient(int del) {
		//if(client.Id==del) {
			
		//}
	//}

	

}

