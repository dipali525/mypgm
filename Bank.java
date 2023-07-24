import java.util.Scanner;
class Bank 
{
	String accountHolderName;
	long acctno;
	double bal;
	int gpswd;
	int upigpay;
	int ppay;
	int upipay;
	Scanner sc=new Scanner(System.in);
	Bank(String s1,long a1,double d1,int p1,int p2,int p3,int p4)
	{
		accountHolderName=s1;
		acctno=a1;
		bal=d1;
		gpswd=p1;
		upigpay=p2;
		ppay=p3;
		upipay=p4;

	}
	public void gPay()
	{
		System.out.println("ENter the google pay pass");
		int pswd=sc.nextInt();
		if(pswd==gpswd)
		{
			System.out.println("1.check bal 2. send money");
			int option=sc.nextInt();
			if(option==1)
			{
				checkBalance();
			}
			else if(option==2)
			{
				System.out.println("Enter the contact");
				long cont=sc.nextLong();
				System.out.println("Enter the money");
				double money=sc.nextDouble();
				if(money<bal)
				{
					System.out.println("Enter the google pay upi");
					int upi=sc.nextInt();
					if(upi==upigpay)
					{
						bal=bal-money;
						System.out.println("Transaction Succesfull");
					}
					else
					{
					System.out.println("Invalid pin");	
					}
				}
				else
				{
					System.out.println("Insufficent balance");
				}

			}
			else
			{
				System.out.println("Server is Busy");
			}
		}

	}
	public void  pPay()
	{
        System.out.println("ENter the phone pay pass");
		int pswd1=sc.nextInt();
		if(pswd1==ppay)
		{
			System.out.println("1.check bal 2. send money");
			int option=sc.nextInt();
			if(option==1)
			{
				checkBalance();
			}
			else if(option==2)
			{
				System.out.println("Enter the contact");
				long cont=sc.nextLong();
				System.out.println("Enter the money");
				double money=sc.nextDouble();
				if(money<bal)
				{
					System.out.println("Enter the phone pay upi");
					int upi1=sc.nextInt();
					if(upi1==upipay)
					{
						bal=bal-money;
						System.out.println("Transaction Succesfull");
					}
					else
					{
					System.out.println("Invalid pin");	
					}
				}
				else
				{
					System.out.println("Insufficent balance");
				}

			}
			else
			{
				System.out.println("Server is Busy");
			}
		}


	}
	public void checkBalance()
	{
		System.out.println("Enter the upi");
		int upicb=sc.nextInt();
		if(upicb==upigpay||upicb==upipay)
		{
			System.out.println(bal);
		}
		else
		{
           System.out.println("Incorrect Pin");
		}

	}

}