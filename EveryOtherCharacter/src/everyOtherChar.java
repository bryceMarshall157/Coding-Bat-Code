
public class everyOtherChar {

	public static String stringBits(String str) {
		  
		  String everyOther = "";
		  //int length = 0;
		  
		  for(int i = 0; i < str.length(); i+=2){
		    everyOther += str.charAt(i);
		  }
		  
		  return everyOther;
		  
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "hello";
		String test1 = "Heart";
		String test2 = "Health";
		String test3 = "Harmoney";
		String test4 = "Excelsior";
		String test5 = "Equanimity";
		
		System.out.println(stringBits(test));
		System.out.println(stringBits(test1));
		System.out.println(stringBits(test2));
		System.out.println(stringBits(test3));
		System.out.println(stringBits(test4));
		System.out.println(stringBits(test5));
		
	}

}
