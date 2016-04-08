package Demo.com;

import java.awt.Shape;
import java.util.Random;
import java.util.Scanner;


public class HelloWord {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System. out .println( "Bài tập Module 1" );
		System. out .println( "------------------" );
		
		int a[] = new int[10];
		Random ranDom = new Random();
		for (int i = 1; i < a.length; i++) {
			a[i] = ranDom.nextInt(20);
		}
		 xuat(a);
		 System.out.println("\n");
		// sapXep(a);
		// xuat(a);
		System.out.println("\n");
		sapXep3(a);
		xuat(a);
		
		System. out .println( "\n" );
		System. out .println( "---------Phân Số---------" );
		PhanSo a1 = new PhanSo();
		System.out.println(a1.getTu());
		System.out.println(a1.getMau());
		
		PhanSo b = new PhanSo(1, 2);
		/*System.out.println(b.tu);
		System.out.println(b.mau);*/
//		b.Xuat(2, 1);
		b.Xuat();
		
		b.setTu(5);
		b.setMau(0);
		
		PhanSo c=null;
//		System.out.println(c.getTu());
		
		//HonSo honSo = new HonSo();
		//System.out.println(honSo.nguyen);
		//System.out.println(honSo.phanSo.getTu());
		
		System. out .println( "\n" );
		System. out .println( "---------Ép kiểu---------" );
		
		
//		Shape shape = new Shape(10,20);
//		shape.XuatThongTin();
		
		//Triangle triangle = new Triangle(5,6,10,20);
//		triangle.XuatThongTin();
		
		//van de 1: ep kieu tu lop cha ve lop con
//		Triangle temp = (Triangle) shape;
//		temp.XuatThongTin();
		
		//van de 2: ep kieu tu lop con ve lop cha
		//Shape temp = triangle;
		
		//TinhDienTich(triangle);
		
		//Triangle triangle2 = null;
//		System.out.println(triangle2.c);
		//System.out.println(triangle2.TAG);
		//System.out.println(Triangle.TAG);
		
		
		System. out .println( "\n" );
		System. out .println( "---------Số nguyên tố---------" );
		System.out.println("Nhap mot so nguyen n bat ky: ");
		int n = new Scanner(System.in).nextInt();
		System.out.println("Day so nguyen to tu 1 den " + n);
		 for(int j = 2; j<=n; j++){
		 	if(ktSoNguyenTo(j)){
		 		System.out.println(j);
		 		}
		 	}
		 
		 System. out .println( "\n" );
		 System. out .println( "---------tính giai thừa---------" ); 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Hay nhap mot so: ");
		 int n1=input.nextInt();
		 int i=n1-1;
		 while(i>0)
		 {
		 n1=n1*i;
		 i--;
		 }
		 System.out.println("Giai thua: "+n);

		 System. out .println( "\n" );
		 System. out .println( "---------tính lap phuong---------" ); 		
		 
		 
		 TinhBinhPhuong Bp = new TinhBinhPhuong(); 
		 Bp.BinhPhuong(); 
		 TinhBinhPhuong Lp = new TinhBinhPhuong(); 
		 Lp.num = 2; 
		 Lp.LapPhuong(); 
		 
		 System. out .println( "\n" );
		 System. out .println( "---------tính số hoàn hảo---------" ); 		
		 int soTangDan;
	        int soHoanHao = 0;
	        int soLuongSoHoanHao = 0;
	        int tongUocSo;
	        
	        while(soLuongSoHoanHao < 4) {

	            soHoanHao++;
	            
	            tongUocSo = 0;
	            
	            //Vòng For tìm các ước số của soHoanHao.
	            for (soTangDan = 1; soTangDan < soHoanHao; soTangDan++) {
	                
	                //Nếu tìm thấy thì cộng vào tongUocSo;
	                if (soHoanHao%soTangDan == 0) {
	                    tongUocSo += soTangDan;
	                }
	            }
	            
	            //So sánh tongUocSo với soHoanHao đang kiểm tra.
	            //Nếu bằng thì nó là số hoàn hảo ngược lại thì không phải.
	            if (tongUocSo == soHoanHao) {
	                System.out.println(soHoanHao);
	                soLuongSoHoanHao++;
	            }
	            
	        }	        
	        System.exit(0);	    	    		 
	}
	//static double TinhDienTich(Shape shape){
		//return shape.tinhDienTich();
	//}
	
	public static boolean ktSoNguyenTo(int j){
		 for(int i=2; i<j; i++){
		 	if(j%i == 0){
		 		return false;
		 		}
		 }
		 return true;
	}
	
	public static void sapXep(int[] a) {
		for (int i = 1; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void sapXep2(int[] a) {
		for (int i = 1; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] < a[j] && a[j] % 2 == 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i = 1; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] > a[j] && a[j] % 2 == 1) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
	}

	public static void sapXep3(int[] a) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			if (soNguyenTo(a, i) == 1) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] > a[j] && soNguyenTo(a, j) == 1) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
	}

	public static int soNguyenTo(int[] a, int i) {
		int dem = 0;
		for (int j = 1; j < a[i]; j++) {
			if (a[i] % j == 0) {
				++dem;
			}
		}
		if (dem == 2)
			return 1;
		else
			return 0;
	}

	public static void xuat(int[] a) {
		for (int i = 1; i < a.length; i++) {
			System.out.print(" " + a[i]);
		}
	}
}
