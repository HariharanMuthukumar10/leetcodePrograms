import java.util.*;
public class StringManupulations {
	
	static StringManupulations obj = new StringManupulations();

	public String[] convertToArray(String str) {
		System.out.println("hlo");
		String[]arr=str.split(" ");
		System.out.println(arr);
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the String");
//		String input = sc.next();
		System.out.println("Enter the int");
		int ip = sc.nextInt();
		obj.printDiamond(ip);
//		obj.convertToArray(input);
//		System.out.println("hlo");
//		obj.reverseString(input);
//		byte[] b_arr = {70, 101, 101, 107, 115};
//		String s_byte =new String(b_arr);
//		System.out.println(s_byte);
	}
	
	public void inbuiltOperations(String str) {
		int length=str.length();
		System.out.println("The Length of the String is : "+length);
		char indx = str.charAt(length);
		System.out.println("the Last Letter of the String : "+indx);
		
	}
	
	public void reverseString(String str) {
		char[] c = str.toCharArray();
		int i=0;int j=c.length-1;
		while(i<j) {
			c[i]^=c[j];
			c[j]^=c[i];
			c[i]^=c[j];
			i++;
			j--;
			
			
		}
		for(int k=0;k<c.length;k++) {
			System.out.print(c[k]+" ");
		}
	}
	
	public void anagram(String s,String c) {
		boolean b= s.equalsIgnoreCase(c);
		
	}
     void printDiamond(int n)
    {
        int space = n - 1;
    
        // run loop (parent loop) 
        // till number of rows
        for (int i = 0; i < n; i++)
        {
            // loop for initially space, 
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");
    
            // Print i+1 stars
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
    
            System.out.print("\n");
            space--;
        }
    
        // Repeat again in
        // reverse order
        space = 0;
    
        // run loop (parent loop) 
        // till number of rows
        for (int i = n; i > 0; i--)
        {
            // loop for initially space, 
            // before star printing
            for (int j = 0; j < space; j++)
                System.out.print(" ");
    
            // Print i stars
            for (int j = 0; j < i; j++)
                System.out.print("* ");
    
            System.out.print("\n");
            space++;
        }
    }
	
}

