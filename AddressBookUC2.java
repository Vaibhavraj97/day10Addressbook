package com.bridgelabz.AddressBook;
import java.util.*;
	import java.util.Scanner;
	public class AddressBookUC2{
		private String firstName;
		private String lastName;
		private String address;
		private String city;
		private String state;
		private int phoneNo;
		private int zipNo;
		private String emailID;
		
		
		AddressBookUC2(String firstName,String lastName,String address,String city,String state,int phoneNo,int zipNo,String emailID){
			this.firstName=firstName;
			this.lastName=lastName;
			this.address=address;
			this.city=city;
			this.state=state;
			this.phoneNo=phoneNo;
			this.zipNo=zipNo;
			this.emailID=emailID;
			
			}
		
		
		public AddressBookUC2(String firstName2, String lastName2, String address2, String city2, String state2,
				String phoneNo2, String zipNo2, String emailID2) {
			// TODO Auto-generated constructor stub
		}


		public String getfirstName() {
		    return firstName;
		}



		public void setfirstName(String firstName) {
		    this.firstName = firstName;
		}



		public String getlastName() {
		    return lastName;
		}



		public void setlastName(String lastName) {
		    this.lastName = lastName;
		}
		


		public String getCity() {
		    return city;
		}



		public void setCity(String city) {
		    this.city = city;
		}
		
		public String getstate() {
		    return state;
		}



		public void setstate(String state) {
		    this.state = state;
		}


		public int getphoneNo() {
		    return phoneNo;
		}



		public void setphoneNo(int phoneNo) {
		    this.phoneNo = phoneNo;
		}



		public String getemailID() {
		    return emailID;
		}



		public void setemailID(String emailID) {
		    this.emailID = emailID;
		}
		
		public String toString() {
			return firstName+""+lastName+""+address+""+city+""+state+""+phoneNo+""+zipNo+""+emailID;
		
		}
		
		
		
			
			public static void main(String[] args) {
		    
				Collection<AddressBookUC2> c = new ArrayList<AddressBookUC2>();
				Scanner s = new Scanner(System.in);
				Scanner s1 = new Scanner(System.in);
				int ch;
				do {
					System.out.println("1.Add Contactdetails");
					System.out.println("2. Display");
					
					System.out.println("Enter Your choice");
					ch = s.nextInt();
					
					switch(ch) {
					case 1:
						System.out.print("Enter the FirstName");
						String firstName = s.nextLine();
						System.out.print("Enter the LasttName");
						String lastName = s.nextLine();
						System.out.print("Enter the Address");
						String address = s.nextLine();
						System.out.print("Enter the City");
						String city = s.nextLine();
						System.out.print("Enter the State");
						String state = s.nextLine();
						System.out.print("Enter the PhoneNo");
						int phoneNo = s1.nextInt();
						System.out.print("Enter the ZipNo ");
						int zipNo = s1.nextInt();
						System.out.print("Enter the EmailID");
						String emailID = s.nextLine();
						
						c.add(new AddressBookUC2(firstName,lastName,address,city,state,phoneNo,zipNo,emailID ));
						
						break;
					case 2:
						System.out.println(c);
					}
				}while(ch!=0);
					}
				}
		  



