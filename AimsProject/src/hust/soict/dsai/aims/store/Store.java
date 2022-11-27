package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[100] ;
	private static int count;
	

	//add
	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore[count]=disc;
		count ++;
	}
	
	//delete
	public void removeDVD(DigitalVideoDisc disc) {
		int j=0;
		for(int i=0;i<count;i++)
		{
			if( itemsInStore[i].getId()!=disc.getId()) {
				itemsInStore[j]=itemsInStore[i];
				j++;
			};
					
		}
		count = j;
	}
	
	public void print() {
		System.out.println("***********************STORE***********************");
		for(int i=0;i<count ;i++) {
			System.out.println((i+1)+". " +itemsInStore[i]);
		}
		System.out.println("***************************************************");
	}
}
