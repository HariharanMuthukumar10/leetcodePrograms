package DSAprblms;
import java.util.*;

public class ArrayPrblms {
	
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		ArrayPrblms obj = new ArrayPrblms();
		int n=0;
		while(n<10) {
		System.out.println("Enter the Size of an arr 1:");
		int size=sc.nextInt();
		System.out.println("Enter the target :");
		int target=sc.nextInt();
		int [] input_arr1 = new int[size];
		System.out.println("Enter the Elements of Array1");
		for(int i=0;i<size;i++) {
			input_arr1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Size of an arr 2:");
		int size2=sc.nextInt();
//		System.out.println("Enter the target :");
//		int target=sc.nextInt();
		int [] input_arr2 = new int[size2];
		System.out.println("Enter the Elements of Array2");
		for(int i=0;i<size2;i++) {
			input_arr2[i] = sc.nextInt();
		}
		
		obj.productExceptSelf(input_arr1,size); 
		obj.moveZeros(input_arr1, size);
		obj.sumOfIndex(input_arr1, size,target);
		obj.maxProfit(input_arr1);
		obj.maxArea(input_arr1);
		obj.sortColors(input_arr1);
		obj.minimulLength(input_arr1, target);
		obj.addSortArrays(input_arr1, input_arr2);
		n++;
		System.out.println("ENTER 'C' OR 'B' for continue/break ");
		String b=sc.next();
		if(b.equals("b")||b.equals("B")) {
			break;
		}
		}
	}
	
	static int[] productExceptItself(int[]ip_arr,int n) { //product of array except itself (method 1)
		int [] left = new int[n];
		int [] right = new int [n];
		int [] product = new int [n];
		left[0] = 1;
		right[n-1]=1;
		
		
		for(int i=1;i<n;i++) {
			left[i]=left[i-1]*ip_arr[i-1];
		}
		
		for(int i=n-2;i>=0;i--) {
			right[i]=right[i+1]*ip_arr[i+1];
		}
		
		System.out.println("[ ");
		for(int i=0;i<n;i++) {
			product [i]=left[i]*right[i];
			System.out.println(product[i]+",");
		}
		System.out.println(" ]");
		return product;
		
	}
	
	public int[] productExceptSelf(int[]nums,int n) { //product of array except itself (method 2)
		int [] prod =new int [n];
		int total=1;int zero =0;
		for(int i=0;i<n;i++) {
			if(nums[i]==0) {
				zero++;
			}
			else {
				total *=nums[i];
			}
		}
			total = zero >=2 ? 0:total;
			if(zero==1) {
				for(int i=0;i<n;i++) {
					if(nums[i]!=1) {
						prod[i] = 0;
					}
					else {
						prod[i]=total;
					}
				}
			}
			else if(zero==0) {
				for(int i=0;i<n;i++) {
					prod[i]=total/nums[i];
				}
				}
				else {
					for(int i=0;i<n;i++) {
					prod[i]=0;
					}
				}
			System.out.println("[ ");
			for(int i=0;i<n;i++) {
				System.out.println(prod[i]+",");
			}
			System.out.println(" ]");
			
		return prod;
	}

	 int[] moveZeros(int[]nums,int n) {
		
		int count=0;
		for(int i=0;i<n;i++) 
			if(nums[i]!=0) 
				nums[count++] = nums [i];
			
		
		while(count<n) 
			nums[count]=0;
		
		
		System.out.println("[ ");
		for(int i=0;i<n;i++) {
			System.out.println(nums[i]+",");
		}
		System.out.println(" ]");
		return nums;
		
	}
	 
	 int [] sumOfIndex (int[]a,int n,int target) {
		 int [] ans = new int[2];
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<n;j++) {
				 if(a[i]+a[j]==target) {
					 ans[0]=a[i];
					 ans[1]=a[j];
				 }
			 }
		 }
		 System.out.println("[ ");
			for(int i=0;i<2;i++) {
				System.out.println(ans[i]+",");
			}
			System.out.println(" ]");
		 return ans;
	 }
	 
	  int maxProfit(int[]prices) {  //best time to buy and sell stocks with high profit
		  int buy = prices[0];
		  int profit =0;
		  for(int i=0;i<prices.length;i++) {
			  if(prices[i]<buy) {
				  buy = prices[i];
			  }
			  else if(prices[i]-buy>profit) {
				  profit = prices[i]-buy;
			  }
		  }
		  System.out.println("The best profit : "+profit);
		  return profit;
	  }
	  
	int maxArea(int[]height) {
		int maxArea =0;
		int left =0;
		int right =height.length-1;
		
		while(left< right) {
			maxArea = Math.max(maxArea, (right-left)*Math.min(height[left],height[right]));
			
			if(height[left]<height[right]) {
				left++;
			}
				else {
					right--;
				}
			
		}
		System.out.println("The maximum volume of water can be contained is :"+maxArea);
		return maxArea;
	}
	
	public int[] sortColors(int[]nums) {
		int []count =new int [3];
		for(int num:nums) {
			count[num]++;
		}
		int index=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<count[i];j++) {
				nums[index]=i;
				index++;
			}
		}
		System.out.print("[ ");
		for(int i=0;i<nums.length;i++) {
			System.out.print( nums[i]+" ");
		}
		System.out.println("]");
		
		return nums;
	}
	
	public int minimulLength(int[]nums,int target) {
		int out =0;
		
		for(int i=nums.length-1;i>=0;i--) {
			for(int j=i-1;j>0;j--) {
				if(nums[i]+nums[j]>=target) {
					out = nums[i]+nums[j];
				}
			}
		}
		System.out.println(out);
		return out;
	}
	
	public int[] addSortArrays(int[]a,int[]b) {
		int[] c = new int[a.length+b.length];
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		int j=0;
		for(int i=a.length;i<c.length;i++) {
			c[i]=b[j];
			j++;
		}
		int temp;
		for(int i=0;i<c.length;i++) {
			for(j=1;j<c.length;j++) {
				if(c[j]>=c[i]) {
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
					j=-1;
				}
			}
		}
		
		System.out.println("[ ");
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println(" ]");
		return a;
	}
	
}
