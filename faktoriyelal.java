package calisma1;

import java.util.Scanner;

public class faktoriyelal {

	public static void yaz(int gelen)//metod
{
	System.out.println(gelen);
}

public static void yaz(double gelen)//metod
{
	System.out.println(gelen);
}

public static void yaz(float gelen)//metod
{
	System.out.println(gelen);
}
public static int okuInt()
{
 Scanner klavye=new Scanner(System.in);
 return klavye.nextInt();
}
public static void yaz(String gelen)//metod
{
	System.out.println(gelen);
}

 public static int faktoriyel_al(int sayi)
 {
	 int faktoriyel=1;
	 for(int i=sayi;i>0;i--)
	 {
	  //yaz(faktoriyel);
	  faktoriyel*=i; // faktoriyel=faktoriyel*i

	 }
	 return faktoriyel;
 }
 public static int faktoriyel(int sayi) {
	 
	if (sayi<=1) 
		return 1;
		else return faktoriyel(sayi-1);
	}
 public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	 int sayi=5; // 5*4*3*2*1*0!
	 int faktoriyel=1;
	
	 yaz("Faktöriyeli alınacak sayıyı giriniz:");
	 sayi=okuInt();
	
	 faktoriyel=faktoriyel_al(sayi);
	 
	 yaz(sayi+" sayısının faktöriyeli: "+faktoriyel);
}
}