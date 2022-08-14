package organic_store_billing;
import java.util.Scanner;

public class Organic 
{
	Scanner scn = new Scanner(System.in);
	
	int productList()
	{
		System.out.println("==========Available products in the store==========");
		System.out.println("1. Fruits");
		System.out.println("2. Vegetables");
		System.out.println("3. Cosmetics");
		System.out.println("4. Masala Powders");
		System.out.println("===================================================\n");
		System.out.println("What would you like to buy? Select your option:");
		System.out.println("---------------------------------------------------");
		
		return scn.nextInt();
	}
	
	int checkProductCode(int productCategory)
	{
		int productCode=0;
		switch(productCategory)
		{
			case 1:
				productCode = fruits();
				while(!(productCode>=101 && productCode<=106))
				{
					System.out.println("Invalid Input! Try again...");
					productCode=fruits();
				}
				break;
				
			case 2:
				productCode = vegetables();
				while(!(productCode>=201 && productCode<=206))
				{
					System.out.println("Invalid Input! Try again...");
					productCode= vegetables();
				}
				break;
				
			case 3:
				productCode = cosmetics();
				while(!(productCode>=301 && productCode<=306))
				{
					System.out.println("Invalid Input! Try again...");
					productCode= cosmetics();
				}
				break;
			
			case 4:
				productCode = masalaPowders();
				while(!(productCode>=401 && productCode<=406))
				{
					System.out.println("Invalid Input! Try again...");
					productCode= vegetables();
				}
				break;
		}
		
		return productCode;
	}
	
	int fruits()
	{
		
		System.out.println("101---Mango--------1kg---70");
		System.out.println("102---Orange-------1kg---50");
		System.out.println("103---Water Melon--1kg---40");
		System.out.println("104---Pineapple----1kg---90");
		System.out.println("105---Avocado------1kg---150");
		System.out.println("106---Dragon Fruit-1kg---250");
		System.out.println("Please choose your product code:");
		return scn.nextInt();
				
	}
	
	int vegetables()
	{
		System.out.println("201---Okra---------1kg---65");
		System.out.println("202---Potato-------1kg---45");
		System.out.println("203---Onion--------1kg---50");
		System.out.println("204---Tomato-------1kg---40");
		System.out.println("205---Cucumber-----1kg---40");
		System.out.println("206---Ridge Gourd--1kg---35");
		System.out.println("Please choose your product code:");
		return scn.nextInt();
	}
	
	int cosmetics()
	{
		System.out.println("301---Kajal---------1u---95");
		System.out.println("302---Lipstick------1u---120");
		System.out.println("303---Powder--------1u---200");
		System.out.println("304---Sun Screen----1u---350");
		System.out.println("305---Highlighter---1u---270");
		System.out.println("306---Eye Liner-----1u---400");
		System.out.println("Please choose your product code:");
		return scn.nextInt();
	}
	
	int masalaPowders()
	{
		System.out.println("401---Coriander Powder---1kg---130");
		System.out.println("402---Jeera Powder-------1kg---85");
		System.out.println("403---Black Pepper-------1kg---75");
		System.out.println("404---Haldi--------------1kg---90");
		System.out.println("405---Chili Powder-------1kg---100");
		System.out.println("406---Garam Masala-------1kg---65");
		System.out.println("Please choose your product code:");
		return scn.nextInt();
	}
	
	int checkQuantity(int productCode)
	{
		int quantity=0;
		switch(productCode)
		{
			case 101:
				System.out.println("Mango! The King of all fruits! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 102:
				System.out.println("Orange! A great source of vitamic C! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 103:
				System.out.println("A great source of antioxidants! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 104:
				System.out.println("A pineapple has pointy defences, but it's still sweet! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 105:
				System.out.println("A good day starts with an avocado! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 106:
				System.out.println("Turbo sweet, tangled and tropical! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
				
			case 201:
				System.out.println("Okra! Makes the bones stronger! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 202:
				System.out.println("A great source of fiber! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 203:
				System.out.println("Onions are nutrient-dense! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 204:
				System.out.println("Knowledge is knowing that a tomato is a fruit! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 205:
				System.out.println("A very good source of vitamin K! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 206:
				System.out.println("A vegetable with multiple benefits! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
				
			case 301:
				System.out.println("Kajal gives you instant confidence! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 302:
				System.out.println("On a bad day, there's always Lipstick! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 303:
				System.out.println("Trust in God and keep your powder dry! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 304:
				System.out.println("The best beauty secret is sunblock! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 305:
				System.out.println("A good highlighter works on everyone! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 306:
				System.out.println("Smudge-proof and Waterproof! How many would you like to buy?");
				quantity = scn.nextInt();
				break;
								
				
			case 401:
				System.out.println("Coriander Powder-Coriander Powder gives a distinct aroma and colour to dishes! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 402:
				System.out.println("A true pantry staple found all around the world! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 403:
				System.out.println("One of the oldest and important spices in the world! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 404:
				System.out.println("An intrinsic spice for preparing meals! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 405:
				System.out.println("Enhance your regular and exotic dishes with the perfect spiciness! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
				
			case 406:
				System.out.println("Garam Masala-Make every bite aromatic and full of flavour! How many kgs would you like to buy?");
				quantity = scn.nextInt();
				break;
		}
		return quantity;
	}
	
	float checkUnitCost(int productCode)
	{
		float unitCost=0;
		switch(productCode)
		{
			case 101:
				unitCost = 70;break;
			case 102:
				unitCost = 50;break;
			case 103:
				unitCost = 40;break;
			case 104:
				unitCost = 90;break;
			case 105:
				unitCost = 150;break;
			case 106:
				unitCost = 250;break;
				
				
			case 201:
				unitCost = 65;break;
			case 202:
				unitCost = 45;break;
			case 203:
				unitCost = 50;break;
			case 204:
				unitCost = 40;break;
			case 205:
				unitCost = 40;break;
			case 206:
				unitCost = 35;break;
				
				
			case 301:
				unitCost = 95;break;
			case 302:
				unitCost = 120;break;
			case 303:
				unitCost = 200;break;
			case 304:
				unitCost = 350;break;
			case 305:
				unitCost = 270;break;
			case 306:
				unitCost = 400;break;
				
				
			case 401:
				unitCost = 130;break;
			case 402:
				unitCost = 85;break;
			case 403:
				unitCost = 75;break;
			case 404:
				unitCost = 90;break;
			case 405:
				unitCost = 100;break;
			case 406:
				unitCost = 65;break;
		}
		
		return unitCost;
	}
	
	String getProductName(int productCode)
	{
		String productName="";
		
		switch(productCode)
		{
			case 101:
				productName = "Mango";break;
			case 102:
				productName = "Orange";break;
			case 103:
				productName = "Water Melon";break;
			case 104:
				productName = "Pineapple";break;
			case 105:
				productName = "Avocado";break;
			case 106:
				productName = "Dragon Fruit";break;
				
				
			case 201:
				productName = "Okra";break;
			case 202:
				productName = "Potato";break;
			case 203:
				productName = "Onion";break;
			case 204:
				productName = "Tomato";break;
			case 205:
				productName = "Cucumber";break;
			case 206:
				productName = "Ridge Gourd";break;
				
				
			case 301:
				productName = "Kajal";break;
			case 302:
				productName = "Lipstick";break;
			case 303:
				productName = "Powder";break;
			case 304:
				productName = "Sun Screen";break;
			case 305:
				productName = "Highlighter";break;
			case 306:
				productName = "Eye Liner";break;
				
				
			case 401:
				productName = "Coriander Powder";break;
			case 402:
				productName = "Jeera Powder";break;
			case 403:
				productName = "Black Pepper";break;
			case 404:
				productName = "Haldi";break;
			case 405:
				productName = "Chili Powder";break;
			case 406:
				productName = "Garam Masala";break;
		}
		
		return productName;
	}
	
	void generateBill(String data,float totalAmount)
	{
		double d;
		
		System.out.println("Enter your name: ");
		scn.nextLine();
		String name = scn.nextLine();
		
		
		System.out.println("Enter your contact number: ");
		long contactNumber = scn.nextLong();
		
		scn.nextLine();		
		
		System.out.println("Enter your address: ");		
		String address = scn.nextLine();
		
		System.out.println("============Welcome to Organic Store!=============");
		System.out.println("--------------------------------------------------");
		System.out.println("S.No | Quantity |\tProductName\t| Price\n");
		System.out.println("--------------------------------------------------");
		System.out.println(data);
		System.out.println("--------------------------------------------------");
		System.out.println("Total bill of your purchased items: "+totalAmount);
		if(totalAmount>=500)
		{
			d = 0.05*totalAmount;
			System.out.println("Congratulation! You've received a discount of 5% : "+d);
		}
		else d=0;
		System.out.println("Final bill amount: "+(totalAmount-d));
		System.out.println("==========Thankyou for Shopping with us==========");
		System.out.println("Name: "+name);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println("Address: "+address);;
		System.out.println("Java is awesome!!");
	}
	
	public static void main(String[] args) 
	{
		Organic organicObject = new Organic();
		float totalAmount=0;
		int flag = 0;
		String data="";
		int sNo=0;
		
		System.out.println("             Welcome to Organic Store!");
		System.out.println("---------------------------------------------------");
		while(flag==0)
		{
						
			int productCategory = organicObject.productList();
			while(!(productCategory>=1 && productCategory<=4))
			{
				System.out.println("Invalid Input. Try again...\n");
				productCategory = organicObject.productList();
				
			}
			
			int productCode = organicObject.checkProductCode(productCategory);
			
			
			
			String productName = organicObject.getProductName(productCode);
			
		
			float unitCost=organicObject.checkUnitCost(productCode);
			
			int quantity = organicObject.checkQuantity(productCode);
			
			float itemTotal = unitCost*quantity;
			
			totalAmount = totalAmount+itemTotal;
			
			sNo++;
			
			data = data + sNo+"    |    "+quantity+"    |\t"+productName+"\t\t| "+itemTotal+"\n";
			
			int checkForContinueShopping=0;
			int continueShopping=0;
			
			while(checkForContinueShopping==0)
			{
				System.out.println("Would you like to continue shopping?\nEnter 1 for Yes\nEnter 0 for No");
				continueShopping = organicObject.scn.nextInt();
				if(continueShopping == 1)
				{
					flag = 0;
					break;
				}
				else if(continueShopping == 0)
				{
					flag = 1;
					organicObject.generateBill(data,totalAmount);
					break;
				}
				else
				{
					System.out.println("Invalid Input. Try again...");
					checkForContinueShopping=0;
				}
			}
							
		}	
	}
	
}
