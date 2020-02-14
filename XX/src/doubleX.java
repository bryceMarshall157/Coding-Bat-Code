
public class doubleX {

	public static boolean doubleX(String str) {
		  
		  int index = str.indexOf('x');
		  
		  if(index == -1) return false;
		  
		  if(index + 1 >= str.length()) return false;
		  
		  return (str.charAt(index+1) == 'x');
		  
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "axxbb";
		String test1 = "";
		String test2 = "axaxax";
		String test3 = "x";
		String test4 = "xax";
		String test5 = "abc";
		String test6 = "aaax";
		String test7 = "xx";
		
		System.out.println(doubleX(test));
		System.out.println(doubleX(test1));
		System.out.println(doubleX(test2));
		System.out.println(doubleX(test3));
		System.out.println(doubleX(test4));
		System.out.println(doubleX(test5));
		System.out.println(doubleX(test6));
		System.out.println(doubleX(test7));
		  
	}

}
