import java.text.*;
import java.util.*;
public class Currency1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("de","DE"));
//		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
	//	NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("en","US"));
		NumberFormat nft=NumberFormat.getCurrencyInstance(new Locale("en","AU"));
		
		String formatted=nft.format(1000000);
		System.out.println(formatted);

	}

}
