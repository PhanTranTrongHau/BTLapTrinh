/*
* ngày tạo: Jan 03, 2022
*Tác giả: Phan Trần Trọng Hậu 
*/
package com.hauptt2008110093.kiemtracuoiki;


import java.text.ParseException;
import java.util.Scanner;
public class QuanLyTestDrive {
    public static void main(String[] args) throws ParseException {
            int luaChon = -1;
            Scanner sc = new Scanner(System.in);
            DanhSachQuanLy dS = new DanhSachQuanLy();
            HangHoa hangHoa = new SanhSu(1003, "Chen", 10000, 30, "20/12/2018", "TP.HCM", "10cm2");
            HangHoa hangHoa2 = new SanhSu(1004, "To", 20000, 30, "20/12/2019", "Ha Noi", "20cm2");
            HangHoa hangHoa3 = new SanhSu(1010, "Ly", 20000, 30, "20/12/2019", "Lang Son", "15cm2");
            HangHoa hangHoa4 = new SanhSu(1008, "Chum", 6000, 30, "11/11/2019", "Bien Hoa", "3cm2");
            HangHoa hangHoa5 = new SanhSu(1001, "Muong", 9000, 30, "10/10/2019", "TP.HCM", "4cm");
            HangHoa hangHoa6 = new SanhSu(1005, "Dia", 50000, 30, "1/9/2019", "Long An", "30cm2");
            HangHoa hangHoa7 = new DienMay(2009, "May Lanh", 7000000, 200, "11/2/2019", 60, "24 thang");
            HangHoa hangHoa8 = new DienMay(2003, "Tivi", 6000000, 20, "11/12/2019", 55, "24 thang");
            HangHoa hangHoa9 = new DienMay(2007, "Tu Lanh", 8000000, 30, "2/2/2019", 80, "24 thang");
            HangHoa hangHoa10 = new DienMay(2010, "May Quat", 2000000, 14, "10/4/2019", 40, "12 thang");
            HangHoa hangHoa11 = new DienMay(2004, "May Hut Bui", 1000000, 50, "20/2/2019", 30, "12 thang");
            HangHoa hangHoa12 = new DienMay(2011, "Den Led", 700000, 200, "25/8/2019", 15, "3 thang");
            HangHoa hangHoa13 = new DienMay(2015, "Lo Vi Song", 4000000, 200, "9/1/2020", 50, "12 thang");
            HangHoa hangHoa14 = new ThucPham(3007, "Ca rot", 3000, 200, "24/11/2020", "26/11/2020", "Rau cu");
            HangHoa hangHoa15 = new ThucPham(3001, "Ca Chua", 5000, 100, "24/11/2020", "26/11/2020", "Rau cu");
            HangHoa hangHoa16 = new ThucPham(3008, "Gao ", 12000, 300, "10/8/2020", "26/2/2021", "Hat");
            HangHoa hangHoa17 = new ThucPham(3033, "Thit ga", 50000, 20, "9/11/2020", "30/12/2020", "Thit");
            HangHoa hangHoa18 = new ThucPham(3000, "Thit Bo", 80000, 10, "8/11/2020", "30/12/2020", "Thit");
            HangHoa hangHoa19 = new ThucPham(3020, "Trung ", 30000, 150, "10/10/2020", "20/11/2020", "Trung");
            HangHoa hangHoa20 = new ThucPham(3019, "Tom", 90000, 30, "13/11/2020", "1/12/2020", "Hai San");
            dS.them(hangHoa);
            dS.them(hangHoa2);
            dS.them(hangHoa3);
            dS.them(hangHoa4);
            dS.them(hangHoa5);
            dS.them(hangHoa6);
            dS.them(hangHoa7);
            dS.them(hangHoa8);
            dS.them(hangHoa9);
            dS.them(hangHoa10);
            dS.them(hangHoa11);
            dS.them(hangHoa12);
            dS.them(hangHoa13);
            dS.them(hangHoa14);
            dS.them(hangHoa15);
            dS.them(hangHoa16);
            dS.them(hangHoa17);
            dS.them(hangHoa18);
            dS.them(hangHoa19);
            dS.them(hangHoa20);
            dS.inDS();
        
		int x;
		
		while (true) {
			System.out.println("\n=====MENU HANG HOA=====");
			System.out.println("1. Them Hang Hoa");
			System.out.println("2. Xoa Hang Hoa Theo ma");
			System.out.println("3. Sua Hang Hoa");
			System.out.println("4. Tim Kiem Theo Loai ");
			System.out.println("5. Tim Kiem Theo Gia");
			System.out.println("6. Sap Xep Danh Sach Tang Dan Theo Gia ");
			System.out.println("7. Sap Xep Danh Sach Giam Dan Theo Gia ");
			System.out.println("8. Sap Xep Danh Sach Theo Ma Tang Dan ");
			System.out.println("9. Sap Xep Theo Ma Giam Dan");
			System.out.println("10. Tong So Luong Hang Hoa");
			System.out.println("11. Tong Gia Tri Nhap Kho");
			System.out.println("12. Tong So Luong Tung Loai");
			System.out.println("0. Thoat");
			System.out.print("\n\tMoi nhap lua chon: ");
			x = sc.nextInt();
			
			while (x < 0 || x > 12) {
				System.out.print("\nNhap lai lua chon (0-13): ");
				x = sc.nextInt();
			}
			
			switch (x) {
				case 1:
				System.out.println("\nNHAP THONG TIN HANG THUC PHAM NHAP KHO");
                System.out.print("Nhap ma hang hoa : ");
				sc.nextLine();
				String maHH = sc.nextLine();
				System.out.print("Nhap ten hang hoa : ");
				String tenHH = sc.nextLine();
				System.out.print("Nhap so luong ton kho : ");
				int soLuongTonKho = sc.nextInt();
				System.out.print("Nhap don gia : ");
				float donGia = sc.nextInt();				
				System.out.print("Nhap ngay nhap kho (dd/mm/yyyy) : ");
                sc.nextLine();
				String ngayNK = sc.nextLine();
                System.out.print("Nhap ngay het han (dd/mm/yyyy) : ");
				String ngayHH = sc.nextLine();
				HangHoa hangHoa21 = new ThucPham(3030, "Nho ", 80000, soLuongTonKho, "14/12/2020", "31/12/2020", "Trai cay");
				dS.them(hangHoa);
				dS.inDS();
                break;
				
				case 2:
					System.out.println("nhap ma can xoa: ");
					int ma = sc.nextInt();
					if(dS.xoaTheoMa(ma)) {
                        System.out.println("Xoa thanh cong");  
                        dS.inDS();
                    } else {
                        System.out.println("Xoa khong thanh cong");    
                    } 
					break;
				case 3:
					 System.out.print("\nNhap ma hang: ");
	                    sc.nextLine();
	                    int maHang = sc.nextInt();
                        int giaNhapMoi = sc.nextInt();
	                    System.out.print("\nNhap đon gia moi: ");
	                    double donGia_moi = sc.nextDouble();
	                    if (dS.sua(maHang, giaNhapMoi)) {
	                        System.out.println("Sua thanh cong");
	                       dS.inDS();
	                    } else {
	                        System.out.println("Sua khong thanh cong");
	                    }
	                    break;
				case 4:
                    int luaChon1 = -1;
                    Scanner scanner = new Scanner(System.in);
                    int y;
		            while (true) {
                     System.out.println("Tim Thuc Pham");
                     System.out.println("\nTim Sanh Su");
                     System.out.println("\nTim Dien May");   
					 System.out.print("\nNhap Loai Can Tim: ");
					 y = sc.nextInt();
			        while (y < 0 || y > 3) {
			    	System.out.print("\nNhap lai lua chon (1-3): ");
                    switch(y){
                        case 1:
                        dS.timThucPham();
                        break;
                        case 2:
                        dS.timSanhSu();
                        break;
                        case 3:
                        dS.timDienMay();
                        break;
                    }
				    y = sc.nextInt();
                    }
	                System.out.println("Tim thay");
	                dS.inDS();
                    break;
                }
	                    
	                
				case 5:
					dS.timKiemTheoGia();
						dS.inDS();
					break;
				case 6:
					dS.sapXepTheoGiaTangDan();
					dS.inDS();
					break;
				case 7:
					dS.sapXepTheoGiaGiamDan();
					dS.inDS();
					break;
				case 8:
					dS.sapXepNgayTangDan();
					dS.inDS();
					break;
				case 9:
					dS.sapXepNgayGiamDan();
					dS.inDS();
					break;
				case 10 :
					System.out.println("	tong so luong hang hoa  "  + dS.tongsoluonghanghoa());
					break;
				case 11 :
					System.out.println("	tong so tung loai hang hoa  " + dS.tongtungloai());
					break;
				case 12:
					System.out.println("	tong so hang hoa " + dS.getsize());
				case 0:
					sc.close();
					System.out.println("\nKet thuc");
					return;
				}
			}
		}
	}
