import java.util.*;
import java.io.*;
class project
{
	//global 
 Scanner t=  new Scanner(System.in);
	Console console = System.console();

	
	//login 
	String studentid[] = new String[100] ;
	String password[]= new String[100]; 	
	String adminpass;

	//equipment 
	String equipment[]= new String[100];
	int quantity[]= new int[100];



	//currently used
	String studentusing[]= new String[100];
	String usedequipment[]= new String[100];
	int usedquantity[]= new int[100];
























	public static void main(String x[]) 	throws Exception
	{
		Scanner t=  new Scanner(System.in);
		project p =new project();
		String st; 
		int i;

		File studentid1 = new File("C:\\Users\\admin\\Desktop\\oopm\\studentid.dat"); 
		BufferedReader a = new BufferedReader(new FileReader(studentid1)); 
		 
 		i=0;
 		while ((st = a.readLine()) != null) 
  	  	{
  	  		
  	  		p.studentid[i]=st;
			i++; 
		}
		a.close();













		File password1 = new File("C:\\Users\\admin\\Desktop\\oopm\\password.dat");
		BufferedReader b = new BufferedReader(new FileReader(password1)); 
		i=0;
		while ((st = b.readLine()) != null) 
  	  	{
  	  		
  	  		p.password[i]=st;
			i++; 
		}
		b.close();














		File equipment1 = new File("C:\\Users\\admin\\Desktop\\oopm\\equipment.dat");
		BufferedReader c = new BufferedReader(new FileReader(equipment1)); 
		i=0;
		while ((st = c.readLine()) != null) 
  	  	{
  	  		
  	  		p.equipment[i]=st;
			i++; 
		}
		c.close();









		int q=0;
		i=0;
		File quantity1 = new File("C:\\Users\\admin\\Desktop\\oopm\\quantity.dat");
		Scanner d=new Scanner(quantity1);
		while(d.hasNextInt())
		{
			p.quantity[i]=d.nextInt();
			i++;
		}
		d.close();



		

		File adpass1 = new File("C:\\Users\\admin\\Desktop\\oopm\\adpass.dat");
		BufferedReader e = new BufferedReader(new FileReader(adpass1)); 
		p.adminpass = e.readLine();
		e.close();



		i=0;
		q=0;
		File usedquantity1 = new File("C:\\Users\\admin\\Desktop\\oopm\\usedquantity.dat");
		Scanner f=new Scanner(usedquantity1);
		while(f.hasNextInt())
		{
			p.usedquantity[i]=f.nextInt();
			i++;
		}
		f.close();




		File usedequipment1 = new File("C:\\Users\\admin\\Desktop\\oopm\\usedequipment.dat");
		BufferedReader g = new BufferedReader(new FileReader(usedequipment1)); 
		i=0;
		while ((st = g.readLine()) != null) 
  	  	{
  	  		
  	  		p.usedequipment[i]=st;
			i++; 
		}
		g.close();



		File studentusing1 = new File("C:\\Users\\admin\\Desktop\\oopm\\studentusing.dat");
		BufferedReader h = new BufferedReader(new FileReader(studentusing1)); 
		i=0;
		while ((st = h.readLine()) != null) 
  	  	{
  	  		
  	  		p.studentusing[i]=st;
			i++; 
		}
		h.close();




		String s1=" __      __     _____                  _        ";
		String s2=" \\ \\    / /    / ____|                | |       ";
		String s3="  \\ \\  / /____| (___  _ __   ___  _ __| |_ ___  ";
		String s4="   \\ \\/ /______\\___ \\| '_ \\ / _ \\| '__| __/ __| ";
		String s5="    \\  /       ____) | |_) | (_) | |  | |_\\__ \\ ";
		String s6="     \\/       |_____/| .__/ \\___/|_|  \\___|___/ ";
		String s7="                     | |                        ";
		String s8="                     |_|                        ";














		while(true)
		{
			p.clrscr();
			
			for(int o=0;o<s1.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s1.charAt(o));	
			}
			System.out.println();

			for(int o=0;o<s2.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s2.charAt(o));	
			}
			System.out.println();

			for(int o=0;o<s3.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s3.charAt(o));	
			}
			System.out.println();

			for(int o=0;o<s4.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s4.charAt(o));	
			}
			System.out.println();

			for(int o=0;o<s5.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s5.charAt(o));	
			}
			System.out.println();
			for(int o=0;o<s6.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s6.charAt(o));	
			}
			System.out.println();
			for(int o=0;o<s7.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s7.charAt(o));	
			}
			System.out.println();
			for(int o=0;o<s8.length();o++)
			{
				for(long k=0;k<3000000;k++);
				System.out.print(s8.charAt(o));	
			}
			System.out.println();


			









			System.out.println("1. Admin ");
			System.out.println("2. Student ");
			System.out.println("3. Exit ");
			System.out.print("Enter your choice :");
			int ch=t.nextInt();

			if(ch==3)
			{
				p.clrscr();
				 System.out.print("\n\n\nThankyou ! \nVisit Again."); 	
				 for( i=0;i<6;i++)
				 {
				 	for(long k=0;k<600000000;k++);
				 	System.out.print(".");
				 }	 
				 System.out.print("\n\n\n"); 
				 p.clrscr();		 
				break;
			}
			switch(ch)
			{
				case 1 : p.adminlogin();
						 break;

				case 2 : p.studentlogin();
						 break;
						 		 
				default : p.clrscr();
				 System.out.print(" Invalid Choice!!\n\n Loading."); 	
				 for( i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
				 }	 		 
			}
		}

		//file storing
		File adpass2 = new File("C:\\Users\\admin\\Desktop\\oopm\\adpass.dat"); 
 		BufferedWriter one = new BufferedWriter(new FileWriter(adpass2));
		one.write(p.adminpass);
		one.newLine();
		one.close();


		//quantity,equipment,password,studentid,usedquantity,usedequipment,studentusing

		File quantity2 = new File("C:\\Users\\admin\\Desktop\\oopm\\quantity.dat"); 
 		BufferedWriter two1 = new BufferedWriter(new FileWriter(quantity2));
 		two1.write("");
 		two1.close();
 		BufferedWriter two2 = new BufferedWriter(new FileWriter(quantity2,true));
		for(i=0;i<100;i++)
		{
			if(p.equipment[i]!=null)
			{
				two2.write(String.valueOf(p.quantity[i]));
				two2.newLine();
			}
		}
		two2.close();

		File equipment2 = new File("C:\\Users\\admin\\Desktop\\oopm\\equipment.dat"); 
		BufferedWriter three1 = new BufferedWriter(new FileWriter(equipment2));
 		three1.write("");
 		three1.close();
 		BufferedWriter three2 = new BufferedWriter(new FileWriter(equipment2,true));
		for(i=0;i<100;i++)
		{
			if(p.equipment[i]!=null)
			{
				three2.write(p.equipment[i]);
				three2.newLine();
			}
		}
		three2.close();


		File password2 = new File("C:\\Users\\admin\\Desktop\\oopm\\password.dat"); 
		BufferedWriter four1 = new BufferedWriter(new FileWriter(password2));
 		four1.write("");
 		four1.close();
 		BufferedWriter four2 = new BufferedWriter(new FileWriter(password2,true));
		for(i=0;i<100;i++)
		{
			if(p.password[i]!=null)
			{
				four2.write(p.password[i]);
				four2.newLine();
			}
		}
		four2.close();

		File studentid2 = new File("C:\\Users\\admin\\Desktop\\oopm\\studentid.dat"); 
		BufferedWriter five1 = new BufferedWriter(new FileWriter(studentid2));
 		five1.write("");
 		five1.close();
 		BufferedWriter five2 = new BufferedWriter(new FileWriter(studentid2,true));
		for(i=0;i<100;i++)
		{
			if(p.studentid[i]!=null)
			{
				five2.write(p.studentid[i]);
				five2.newLine();
			}
		}
		five2.close();

		File usedequipment2 = new File("C:\\Users\\admin\\Desktop\\oopm\\usedequipment.dat"); 
		BufferedWriter six1 = new BufferedWriter(new FileWriter(usedequipment2));
 		six1.write("");
 		six1.close();
 		BufferedWriter six2 = new BufferedWriter(new FileWriter(usedequipment2,true));
		for(i=0;i<100;i++)
		{
			if(p.usedequipment[i]!=null)
			{
				six2.write(p.usedequipment[i]);
				six2.newLine();
			}
		}
		six2.close();


		File usedquantity2 = new File("C:\\Users\\admin\\Desktop\\oopm\\usedquantity.dat"); 
		BufferedWriter seven1 = new BufferedWriter(new FileWriter(usedquantity2));
 		seven1.write("");
 		seven1.close();
 		BufferedWriter seven2 = new BufferedWriter(new FileWriter(usedquantity2,true));
		for(i=0;i<100;i++)
		{
			if(p.usedequipment[i]!=null)
			{
				seven2.write(String.valueOf(p.usedquantity[i]));
				seven2.newLine();
			}
		}
		seven2.close();


		File studentusing2 = new File("C:\\Users\\admin\\Desktop\\oopm\\studentusing.dat"); 
		BufferedWriter eight1 = new BufferedWriter(new FileWriter(studentusing2));
 		eight1.write("");
 		eight1.close();
 		BufferedWriter eight2 = new BufferedWriter(new FileWriter(studentusing2,true));
		for(i=0;i<100;i++)
		{
			if(p.studentusing[i]!=null)
			{
				eight2.write(p.studentusing[i]);
				eight2.newLine();
			}
		}
		eight2.close();












	}
























 	void adminlogin()
	{
		int k=0;
		do
		{	
			clrscr();
			if(k>=1)
			{
				System.out.println("Invalid password !");	
			}
			System.out.print("Enter admin password :");
			char pass[]=console.readPassword();
			String password=new String(pass);
			k++;
			if(password.equals(adminpass))
			{
				System.out.print("Logging in."); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long m=0;m<300000000;m++);
				 	System.out.print(".");
				}
				admin();
				break;
			}
		}while(k<4);
	}

 void studentlogin()
	{
		clrscr();
		String password1;
		System.out.print("Enter Roll number : ");
		String id=t.next();
		int loc,q=0;
		
		for(int i=0;i<100;i++)
		{
			if(studentid[i]!=null&&studentid[i].equals(id))
			{
					int a=0,x=0;
				do
				{	
					if(a>0)
					{
						clrscr();
						System.out.println("Invalid password. Try again !");	
					}
					System.out.print("Enter  password :");
					char pass[]=console.readPassword();
					password1=new String(pass);
					a++;
					if(password[i].equals(password1))
					{
						q=0;
						loc=i;
						System.out.print("Logging in."); 	
						for(int w=0;w<6;w++)
						{
						 	for(long m=0;m<300000000;m++);
						 	System.out.print(".");
						}
						student(loc);
						return;
					}	
				}while(!(password[i].equals(password1))&&a<4);
				break;	
			}
			else
			{
				q=1;
			}
		}

		if(q==1)
		{
			System.out.print("No such Student found ."); 	
						for(int w=0;w<6;w++)
						{
						 	for(long m=0;m<300000000;m++);
						 	System.out.print(".");	
						}
		}
	}
















 void admin()
	{
		while(true)
		{
			clrscr();
			System.out.println("1. Add equipment ");
			System.out.println("2. Delete equipment ");
			System.out.println("3. Equipment in use ");
			System.out.println("4. Add New Student ");
			System.out.println("5. Delete Student ");
			System.out.println("6. Reset Admin password ");
			System.out.println("7. Logout ");
			System.out.print("Enter your choice :");
			int ch=t.nextInt();

			if(ch==7)
			{
				clrscr();
				System.out.print("Logging out."); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
				}break;
			}
			switch(ch) 
			{
				case 1 :
						addequip();
						 break;

				case 2 : deleteequip();
						 break;

				case 3 : usedequip();
						 break;
						 
				case 4 : addstudent();
						 break;

				case 5 : deletestudent();
						 break;

				case 6 : resetadmin();
						 return;


				default : 
				clrscr();
				 System.out.print(" Invalid Choice!!\n\n Loading."); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
			 	}		 		 
					 		 
			}
		}
	}

 void student(int id)
	{
		while(true)
		{	
			clrscr();
			System.out.println("1. Take equipment ");
			System.out.println("2. Return equipment ");
			System.out.println("3. View my equipments ");
			System.out.println("4. Reset Password ");
			System.out.println("5. Logout ");
			System.out.print("Enter your choice :");
			int ch=t.nextInt();

			if(ch==5)
			{
				clrscr();
				System.out.print("Logging out."); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
				}break;
			}
			switch(ch)
			{
				case 1 :take(id);
						 break;

				case 2 : give(id);
						 break;

				case 3 : viewequip(id);
						 break;

				case 4 :resetuser(id);
						return;
				default :clrscr();
				 System.out.print(" Invalid Choice!!\n\n Enter again."); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
			 	}		 		 
			}
		}
	}



 

//back functions
	void usedequip()
	{
		clrscr();
		System.out.println("Sr. No.\t\t\t\t\tStudent\t\t\t\t\t\tEquipment\t\t\t\tQuantity");
		for(int i=0;i<100;i++)
		{
			if(studentusing[i]!=null)
			{
				System.out.println((i+1)+"\t\t\t\t\t"+studentusing[i]+"\t\t\t\t\t"+usedequipment[i]+"\t\t\t\t\t"+usedquantity[i]);
			}
		}	
				for(int j=0;j<50;j++)
				 {
				 	for(long l=0;l<300000000;l++);
				}
	}


	void take(int id)
	{
		clrscr();
		System.out.println("Equipment No.\t\t\tName\t\t\t\t\t\tQuantity");
		System.out.println();
		int j=0;
		for(int i=0;i<100;i++)
		{	
			if(equipment[i]!=null)
			{
				j++;
				if(quantity[i]>0)
				{
					if(equipment[i].length()>7)
						System.out.println("\t"+(i+1)+"\t\t\t"+equipment[i]+"\t\t\t\t\t"+quantity[i]);
					else
						System.out.println("\t"+(i+1)+"\t\t\t"+equipment[i]+"\t\t\t\t\t\t"+quantity[i]);
				}
				
			}
		}
		System.out.print("\n\nEnter Equipment Number to be taken :" );
		int a=t.nextInt();
		if(a>j||a==0)
		{
			System.out.print(" Invalid Choice!! Going Back"); 	
				 for(int i=0;i<6;i++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
			 	}		 	
		}

		else
		{
			System.out.print("Enter quantity :");
			int n=t.nextInt();
			if(n>quantity[a-1])
			{
				System.out.print(" Quantity Exceeded !! Going Back"); 	
				 for(int b=0;b<6;b++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
			 	}		
			}
			else 
			{
						
			 	quantity[a-1]-=n;	
				for(int z=0;z<100;z++)
				{
					if(usedequipment[z]==null)
					{
						usedquantity[z]=n;
						usedequipment[z]=equipment[a-1];
						studentusing[z]=studentid[id];
						System.out.print(" Equipment taken."); 	
						break;
					}
				}
				 for(int b=0;b<6;b++)
				 {
				 	for(long k=0;k<300000000;k++);
				 	System.out.print(".");
			 	}
			}
		}
	}



	void viewequip(int id)
	{
		clrscr();
		System.out.println("Sr. No.\t\t\t\t\tEquipment\t\t\t\t  Quantity\n\n");
		for(int i=0;i<100;i++)
		{
			if(studentusing[i]!=null&& studentusing[i].equals(studentid[id]))
			{
				if(usedequipment[i].length()>7)
				{
					System.out.println((i+1)+"\t\t\t\t\t"+usedequipment[i]+"\t\t\t\t\t"+usedquantity[i]);
				}
				else
					System.out.println((i+1)+"\t\t\t\t\t"+usedequipment[i]+"\t\t\t\t\t\t"+usedquantity[i]);
			}
		}	
				for(int j=0;j<50;j++)
				 {
				 	for(long l=0;l<300000000;l++);
				}
	}
	

	void give(int id)
	{
		clrscr();
		int i;
		System.out.println("Sr. No.\t\t\t\t\tEquipment\t\t\t\t\tQuantity\n\n");
		for( i=0;i<100;i++)
		{
			if(studentusing[i]!=null&& studentusing[i].equals(studentid[id]))
			{
				if(usedequipment[i].length()>7)
				{
					System.out.println((i+1)+"\t\t\t\t\t"+usedequipment[i]+"\t\t\t\t\t"+usedquantity[i]);
				}
				else
					System.out.println((i+1)+"\t\t\t\t\t"+usedequipment[i]+"\t\t\t\t\t\t"+usedquantity[i]);
			}
		}	
		System.out.print("\n\nEnter the Equipment number to be returned : ");
		int k=t.nextInt();
		if(k>i||k==0)
		{
			System.out.print("Error.");
				for(int j=0;j<6;j++)
				 {
				 	for(long l=0;l<300000000;l++);
				 	System.out.print(".");
				}	
		}
		for(int j=0;j<100;j++)
		{
			if(usedequipment[k-1].equals(equipment[j]))
			{
				quantity[j]+=usedquantity[k-1];
			}
		}
		studentusing[k-1]=null;
		usedequipment[k-1]=null;
		usedquantity[k-1]=0;
		System.out.print("Successfully returned.");
				for(int j=0;j<6;j++)
				 {
				 	for(long l=0;l<300000000;l++);
				 	System.out.print(".");
				}
	}


	void addequip()
	{
		clrscr();
		System.out.print("Enter name of equipment : ");
		String name=t.next();
		System.out.print("Enter quantity :");
		int quan=t.nextInt();
		int i;
		for(i=0;i<100;i++)
		{
			if(equipment[i]==null)
			{
				equipment[i]=name;
				quantity[i]=quan;
				break;
			}
		}
		System.out.print("Saving.");
				for(int j=0;j<6;j++)
				 {
				 	for(long l=0;l<300000000;l++);
				 	System.out.print(".");
				}
	}

	void deleteequip()
	{
		clrscr();
		System.out.print("Enter name of equipment : ");
		String name=t.next();
		int e=0;

		for(int i=0;i<100;i++)
		{
			if(equipment[i]!=null)
			{
				if(equipment[i].equalsIgnoreCase(name))
				{	
					for(int y=i;y<99;y++)
					{	
						if(y==99)
						{
							equipment[y]=null;
							quantity[y]=0;
						}
							
							e=1;
							equipment[y]=equipment[y+1];
							quantity[y]=quantity[y+1];
							
					}
					System.out.print("Deleting.");
							for(int j=0;j<6;j++)
							{
			 					for(long l=0;l<1000000000;l++);
			 					System.out.print(".");
							}
					return;
				}
			}
		}
		if(e==0)
		{
			System.out.print("Equipment not found.");
							for(int j=0;j<6;j++)
							{
			 					for(long l=0;l<1000000000;l++);
			 					System.out.print(".");
							}	
		}	
	}
	


	void addstudent()
	{
		clrscr();
		System.out.print("Enter Roll number of student : ");
		String name=t.next();
		int k=0,x=0;
		String pass1="",pass2="";
		while(x==0)
		{
			if(k>0)
			{
				clrscr();System.out.println("Passwords dont Match !");
			}	
			System.out.print(" Set password :");
			 pass1=t.next();
			System.out.print("confirm password :");
			 pass2=t.next();
			if(pass1.equals(pass2))
			{	
				x++;			
				break;
			}
			k++;
			if(k==3)
			{
				return;
			}
		}
			int i;
			for(i=0;i<100;i++)
			{
				if(studentid[i]==null)
				{
					studentid[i]=name;
					password[i]=pass1;
					break;
				}
			}	
			System.out.print("Saving.");
			for(int j=0;j<6;j++)
			{
			 	for(long l=0;l<1000000000;l++);
			 	System.out.print(".");
			}
	}


	void deletestudent()
	{
		clrscr();
		System.out.print("Enter Roll number of student : ");
		String roll=t.next();
		for(int i=0;i<100;i++)
		{
			if(studentid[i]!=null)
			{if(studentid[i].equals(roll))
			{
				for(int j=i;j<=99;j++)
				{
					if(j==99)
					{
						studentid[j]=null;
					}
					else
					{
						studentid[j]=studentid[j+1];
						password[j]=password[j+1];
					}
				}
			}}
			System.out.print("Deleting.");
			for(int j=0;j<6;j++)
			{
			 	for(long l=0;l<1000000000;l++);
			 	System.out.print(".");
			}
			break;
		}

	}


	void resetadmin()
	{
		int k=0,l=0;
		do
		{	
			clrscr();
			if(k>0)
			{
				System.out.println("Invalid password !");	
			}
			System.out.print("Enter admin password :");
			char pass[]=console.readPassword();
			String password=new String(pass);
			k++;
			if(password.equals(adminpass))
			{
				while(l<4)
				{
					clrscr();
					if(l>0)
					{
						System.out.println("passwords donn't match ! ");
					}
					System.out.print("Enter new password :");
					char newpass1[]=console.readPassword();
					String newpassword1=new String(newpass1);
					System.out.print("Confirm password :");
					char newpass2[]=console.readPassword();
					String newpassword2=new String(newpass2);
					if(!newpassword1.equals(newpassword2))
					{	
						l++;
					}
					else
					{
						adminpass=newpassword2;
						System.out.print("Password Changed\nLogin Again."); 	
						for(int i=0;i<6;i++)
						{
				 			for(long m=0;m<300000000;m++);
						 	System.out.print(".");
						}
						return;
					}
				}
				return;
			}
		}while(k<4);
	}


void resetuser(int id)
	{
		int k=0,l=0;
		do
		{	
			clrscr();
			if(k>0)
			{
				System.out.println("Invalid password !");	
			}
			System.out.print("Enter current password :");
			char pass1[]=console.readPassword();
			String pass=new String(pass1);
			k++;
			if(pass.equals(password[id]))
			{
				while(l<4)
				{
					clrscr();
					if(l>0)
					{
						System.out.println("passwords donn't match ! ");
					}
					System.out.print("Enter new password :");
					char newpass1[]=console.readPassword();
					String newpassword1=new String(newpass1);
					System.out.print("Confirm password :");
					char newpass2[]=console.readPassword();
					String newpassword2=new String(newpass2);
					if(!newpassword1.equals(newpassword2))
					{	
						l++;
					}
					else
					{
						password[id]=newpassword2;
						System.out.print("Password Changed\nLogin Again."); 	
						for(int i=0;i<6;i++)
						{
				 			for(long m=0;m<300000000;m++);
						 	System.out.print(".");
						}
						return;
					}
				}
				return;
			}
		}while(k<4);
	}



















	public void clrscr()
	{
//Clears Screen in java
		try 
		{
	    	if (System.getProperty("os.name").contains("Windows"))
	    		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
   			else
       		 	Runtime.getRuntime().exec("clear");
		}	 
		catch (IOException | InterruptedException ex) {}
	}
}