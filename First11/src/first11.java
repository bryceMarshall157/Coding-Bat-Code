import java.util.Arrays;

public class first11 {
	
	public static int[] front11(int[] a, int[] b) {
		  
		  int[] newarr = new int[2];
		  System.out.println(Arrays.toString(newarr));
		  
		  if(a.length == 0 && b.length == 0){
		    
		    return newarr;
		    
		  }else if (a.length == 0){
		    
		    newarr[0] = b[0];
		    
		    return  newarr;
		    
		  }else if (b.length == 0){
		    
		    newarr[0] = a[0];
		    
		    return newarr;
		    
		  }else {
		    
		    newarr[0] = a[0];
		    newarr[1] = b[0];
		    
		    return newarr;
		    
		  }
		  
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[] {2,4,5,6};
		int[] b = new int[] {6,5,4,3};
		int[] c = front11(a,b);
		
		System.out.println(Arrays.toString(c));
	}

}
