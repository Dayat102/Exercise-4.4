import java.util.Scanner;
public class Mango extends Fruit {
    
    protected int quantity;
    protected double price,paid,amountTendered,balance;
    Scanner sc=new Scanner(System.in);
    
    public Mango(String name) { //constructor with arguments
        super(name);
        System.out.println("Price for each Mango is 1.00");
        this.price = 1;
        System.out.println("Please enter quantity that you want to buy");
        this.quantity = sc.nextInt();
        
        //System.out.println("Apple constructor is invoked");
    
        if (this.quantity < 10) {
            totalPrice(); //overloading with no arguments
            System.out.println(name);
            paid=totalPrice();
            System.out.println("If quantity LESS than 10, ");
        
        }
            else if (this.quantity > 10 && this.quantity < 100) {
            System.out.println("Because you buy this Mango more than 10, the price for each Mango will become 0.80");
            double pp = 0.80;
            totalPrice(pp); //overloading with 1 argument
            System.out.println(name);
            paid=totalPrice(pp);
            System.out.println("If quantity MORE than 10, ");
        }
        
            else {
            System.out.println("Because you buy this Mango more than 100, the price for each Mango will become 0.70");
            int qq = 100; //beli la byk mana pun, kuantiti tetap kira 100
            double pp = 0.70;
            totalPrice(qq, pp); //overloading with 2 arguments
            System.out.println(name);
            paid=totalPrice(pp,qq);
			System.out.println("If quantity more than 100, ");
		}
        
        System.out.println("You bought:");
        System.out.printf("\n%1s%30s%13s" , "Fruit" , "Quantity" , "Price (RM)");
	    System.out.print("\n--------------------------------------------------");
	    System.out.printf("\n%1s%24s%14.2f" , this.name , this.quantity , paid);
	    System.out.println();
	    System.out.print("\nPlease enter Amount Tendered: RM ");
        this.amountTendered = sc.nextDouble();
        if (amountTendered >= paid)
        {
           balance = amountTendered - paid;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("\n*******************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        }
        else
        {
           System.out.println("Error. Input cannot less than Amount Tendered!!");
           System.out.print("Please enter Amount Tendered: RM ");
           amountTendered = sc.nextDouble();
           balance = amountTendered - paid;
           System.out.printf("%1s%43.2f" , "Balance" , balance);
           System.out.println("*****************");
           System.out.println("$$$$$$$$$$--THANK YOU. PLEASE COME AGAIN--$$$$$$$$$");
        } 
	}
    
	public double totalPrice() {
		return this.price* this.quantity;
	}
	
	public double totalPrice(double pp) {
		return pp * this.quantity;
	}
	
	public double totalPrice(double qq, double pp) {
		return qq * pp;
	}
	
	public String toString(){
		return("Total Price = RM" + paid);
	}
}