package hello;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class Ticketmachine{
	
//	private int price = 100;
//	private int balance;
//	private int total;
//	private String name = "";
//	
//	public Ticketmachine(int price) {
//		// TODO Auto-generated constructor stub
//		this.price = price;	
//	}
//	public Ticketmachine(String name) {
//		// TODO Auto-generated constructor stub
//		this.name = name; 
//	}
//	public Ticketmachine(String name,int price) {
//		// TODO Auto-generated constructor stub
//		this(price);
//		this.name = name;
		
//		this(price);
//		this(name);
//		
//	}
//	
//	public void showPrompt()
//	{
//		System.out.println("Welcome to buy"+ name +"Ticket");
//		System.out.println("The price is:"+price);
//	}
//	
//	public void insertMoney(int bill)
//	{
//		balance += bill;
//		showBalance();
//	}
//	
//	public boolean isEnough()
//	{
//			return balance >= price ;
//	}
//	public void printTicket()
//	{
//		if(balance >= price)
//			System.out.println("Ticket");
//		if(balance > price)
//			System.out.println("change :" + (balance-price));
//		balance -= price;	
//	}
//	
//	
//	public void showBalance()
//	{
//		System.out.println("The balance is "+ balance);
//	}
//	public static int explore(int k,int[] a)
//	{
//		int l = 0;
//		int r = a.length;
//		int ret = -1;
//		
//		while(r != l)
//		{
//			int m = (l+r)/2;
//			if(k == a[m])
//				{ret =m;break;}
//				else if(k < a[m])
//					r = m-1;
//				else
//					l = m+1;	
//		}
//		if(k == a[l])
//			ret = l;
//		return ret;
//			
//	}

//	public static int[] explore(int k,int[] a)
//	{
//		int ret = 0;
//		int idx = 0;
//		int[] loc = new int[a.length];
//		for(int i=0; i<loc.length; i++)
//			loc[i] = -1;
//		for(int i=0; i<a.length; i++)
//		  {if(a[i] == k)
//			{
//				loc[idx++] = i;
//			}
//	      }
//		return loc;
//	}
//	
//	public static int factorial(int n)
//	{	
//		int product = 1;
//		int ret = 0;
//		for(int i=1;i <= n;i++)
//		{
//			product *= i;
//			
//			
//		}
//		ret = product;
//		return ret;
//	}
	
	public static void main(String[] args) {
		
		
//		Ticketmachine tm = new Ticketmachine(" blueline ",80);
//		tm.showPrompt();
//		int bill;
//		Scanner in = new Scanner(System.in);
//		do
//		{
//			bill = in.nextInt();
//			tm.insertMoney(bill);
//			if(tm.isEnough())
//			{
//				tm.printTicket();
//				break;
//			} 
//			 
//		}while(true);

			
			
		
//			int[] a = {0,1,2,0,3,4,0,5,6,7,8,9,10,15,20,30};//删除零元素
//			int[] b = new int[a.length];     //生成新数组
//			int idx = 0;
//			int cnt = 0;
//			int ret = 0;
//			for(int i=0; i < a.length;i++)
//			{
//				if((a[i]-1)> -1)
//				
//					b[idx++] = a[i];
//				else if((a[i]-1)==-1)
//				{
//					cnt++;
//				}
//				
//			}
//			ret = cnt++;
//			for(int j=0; j <a.length-ret ;j++)
//			{
//			System.out.print(b[j]+" ");}
			
//			int[] a = {1,2,3,4,5,6,7,8,9};/* 判断奇数偶数  */
//			int x = 0;
//			int y = 0;
//			for(int i=0; i < a.length;i++)
//			{	
//				
//				if(a[i]%2 == 0)
//					x++;
//				else
//					y++;			
//			}
//			System.out.println("数组中的偶数个数为"+x);
//			System.out.println("数组中的奇数个数为"+ y); 
		
//			
//			int sum=0;
//			for(int i=1; i<=9;i++)
//			{
//				sum += factorial(i);
//			}
//
//			System.out.print(sum);
		
//			int[] a = {1,3,32,7,18,11,13,15};
//			System.out.println(explore(11,a));
			
			
//			Scanner in = new Scanner(System.in);
//			int i ;
//			for( i = 1; i<1000; i++)
//			{
//				if(i%5==0 && i%3==0 && i%7==0)
//				System.out.println(i);
//			}
//			public static void bubbleSort(int []arr) {
//        int[] arr = {12,51,34,33,56,78,88};
//        for(int i =0;i<arr.length-1;i++) { 
//        	for(int j=0;j<arr.length-j-1;j++) {//-1为了防止溢出
//         if(arr[j]>arr[j+1]) {
//             int temp = arr[j];
//              
//             arr[j]=arr[j+1];
//              
//             arr[j+1]=temp;
//     }
//     }    
// }     
//			java.util.Arrays.sort(a);
//			for(int i=0; i<a.length; i++)
//			{
//				System.out.print(a[i]+" ");
//			}
			
//        for(int i =0;i<arr.length;i++)
//        {
//        	System.out.println(arr[i]+" ");
//        }
//	        }
	    
//		int i =100;
//		int sum = 0;
//		while( i <= 200)
//		{
//			sum += i;
//			i++;
//			
//		}
//		System.out.println(sum);
//		int n=0;
//		int i;
//		for(i = 1; i<5; i++)
//		{
//			
//			n += i;
//			n = -n;
//		}
//		System.out.println(n);
		
		

			int[] a=new int[]{1,3,1,2,0,4,5,2,6,2,0};
			int n=a.length;
			int i,j,temp;//用来暂存
			for(i=1;i<n;i++){
				temp=a[i];
				j=i-1;
				for(;j>=0&&a[j]>temp;j--)//找到插入位置的同时往一边整体移动数组
					a[j+1]=a[j];
				if(j!=i-1)//j等于i-1的话自然不需要填补了
					a[j+1]=temp;
			}
			print(a);
		}
		public static void print(int[] a){
			int n=a.length;
			for(int i=0;i<n;i++)
				System.out.print(a[i]+" ");


		
 }
}
