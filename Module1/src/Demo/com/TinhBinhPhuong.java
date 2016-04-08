package Demo.com;

public class TinhBinhPhuong {
	static int Sn=0; 
	static int num = 10; 
	public static void BinhPhuong() 
	{ 
	Sn=num*num; 
	System.out.println("Binh phuong cua"+" "+num+" "+"la:"+Sn); 
	} 
	public static void LapPhuong() 
	{ 
	Sn=num*num*num; 
	System.out.println("Lap phuong cua "+" "+num+" "+"la:"+Sn); 
	} 
}
