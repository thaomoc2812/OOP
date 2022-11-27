package hust.soict.dsai.aims.cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered =0; // count dvd
	
	
	//add
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < 20)
		{
			itemsOrdered[qtyOrdered]=disc;
			qtyOrdered ++;
			System.out.println("The disc has been added");
		}
		else
		{
			System.out.println("The cart is almost full");
		}
	}
	

		
		//delete
		public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
			int j=0;
			for(int i=0;i<qtyOrdered;i++)
			{
				if( itemsOrdered[i].getTitle()!=disc.getTitle()) {
					itemsOrdered[j]=itemsOrdered[i];
					j++;
				};
				
			}
			qtyOrdered = j;
		}
		
		//total
		public float totalCost() {
			float sum = 0;
			for(int i=0;i<qtyOrdered;i++)
			{
				sum= sum + itemsOrdered[i].getCost();
				
			}
			return sum;
		}
		
	//week 3
	//Nap chong phuong thuc
	public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList)
	{
		int i=0;
		do {
			itemsOrdered[qtyOrdered]=dvdList[i];
			qtyOrdered ++;
			i++;
			System.out.println("The disc list has been added");
		}while(dvdList[i] != null);
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2)
	{
		if(qtyOrdered < 20)
		{
			itemsOrdered[qtyOrdered]=dvd1;
			qtyOrdered ++;
			System.out.println("The disc has been added");
			if(qtyOrdered < 20)
			{
				itemsOrdered[qtyOrdered]=dvd2;
				qtyOrdered ++;
				System.out.println("The disc has been added");
			}
			else
			{
				System.out.println("The cart is almost full");
			}
		}
		else
		{
			System.out.println("The cart is almost full");
		}
	}
	
	// print Cart su dung toString
	public void print() {
		System.out.println("***********************CART***********************");
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println((i+1)+". " +itemsOrdered[i]);
		}
		System.out.println("Total cost: "+ totalCost());
		System.out.println("***************************************************");
	}
	
	//Search DVD by ID
	public void searchCartId(int id) {
		int count =0;
		for(int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].getId() == id) {
				System.out.println(itemsOrdered[i]);
				count ++;
			}	
		}
		if(count == 0) System.out.println("Not found");
		
	}
	
	//Search DVD by title
	public void searchCartTitle(String title) {
		int count =0;
		for(int i=0;i<qtyOrdered;i++) {
			if(itemsOrdered[i].isMatch(title)) {
				System.out.println(itemsOrdered[i]);
				count ++;
			}	
		}
		if(count == 0) System.out.println("Not found");
		
	}
		
	
}
	
	

