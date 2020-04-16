/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyentunglam_59131156_btjava1;
//

import java.main.Scanner;
import main.GiaoVien;
import main.HocSinh;
import main.LopHoc;

//
/**
 *
 * @author DELL
 */
public class NguyenTungLam_59131156_BTJava1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Tao GVCN
        GiaoVien gvch = new GiaoVien();
        gvch.setHoTen("GV CN");
        gvch.setTuoi(30);
        gvch.setDiaChi("Nha Trang - Khanh Hoa");
        gvch.setSdt("0123456789");
        gvch.setMonDay("Lap Trinh 1");
        gvch.setToBoMon("CNTT");

        // Tao Lop Hoc - GVCN
        LopHoc lopHoc = new LopHoc(gvch);

        // them DS HS Vao Lop
        //Tao HS (set value)
        HocSinh hs1 = new HocSinh();
        hs1.setHoTen("Nguyen HS 1");
        hs1.setTuoi(12);
        hs1.setDiaChi("Nha Trang - Khanh Hoa");
        hs1.setSdt("0123458329");
        hs1.setLop("LT1");
        hs1.setNangKhieu("Nhay");
        // Them HS Vao Lop
        lopHoc.ThemHocSinh(hs1);

        // Tạo Them HS Bang Khoi Tao
        HocSinh hs2 = new HocSinh("Nguyen HS 2", 12, "Tuy Hoa - Phu Yen", "0231546794", "LT2", "Hat");
        lopHoc.ThemHocSinh(hs2);

        Scanner input = new Scanner(System.in);
        // Tao Them HS  (input user)
        HocSinh hs3 = new HocSinh();
        System.out.println("Nhap Thong Tin Hoc Sinh: ");
        System.out.print("Ten Hoc Sinh: ");
        hs3.setHoTen(input.nextLine());
        System.out.print("Tuoi: ");
        hs3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("Dia Chi: ");
        hs3.setDiaChi(input.nextLine());
        System.out.print("SDT: ");
        hs3.setSdt(input.nextLine());
        System.out.print("Lop: ");
        hs3.setLop(input.nextLine());
        System.out.print("Nang Khieu: ");
        hs3.setNangKhieu(input.nextLine());
        // Them HS Vao Lop
        lopHoc.ThemHocSinh(hs3);

        // Them GV Vao Lop
        // Tao GV (set value)
        GiaoVien gv1 = new GiaoVien();
        gv1.setHoTen("GV 1");
        gv1.setTuoi(30);
        gv1.setSdt("023164794");
        gv1.setDiaChi("Nha Trang - Khanh Hoa");
        gv1.setMonDay("Lap Trinh 11");
        gv1.setToBoMon("Lap trinh 22");
        lopHoc.ThemGVGD(gv1);

        // Tao Them GB(Khoi Tao)
        GiaoVien gv2 = new GiaoVien("GV 2", 32, "Song Cau - Phu Yen", "0316942787", "Lap Trinh 33", "Lap Trinh 44");
        lopHoc.ThemGVGD(gv2);

        // Tao Them GV (input user)
        GiaoVien gv3 = new GiaoVien();
        System.out.println("\nnhap thong tin giao vien giang day: ");
        System.out.print("ten giao vien giang day: ");
        gv3.setHoTen(input.nextLine());
        System.out.print("tuoi: ");
        gv3.setTuoi(input.nextInt());
        input.nextLine();
        System.out.print("dia chi: ");
        gv3.setDiaChi(input.nextLine());
        System.out.print("so dien thoai: ");
        gv3.setSdt(input.nextLine());
        System.out.print("mon day: ");
        gv3.setMonDay(input.nextLine());
        System.out.print("to bo mon: ");
        gv3.setToBoMon(input.nextLine());
        // them hs vao lop
        lopHoc.ThemGVGD(gv3);

        // In Ds Hs 
        lopHoc.inDSHS();

        // IN Ds GV
        lopHoc.inDSGVGD();

//        // Xoa SV Ten X Khoi Lop
//        lopHoc.xoaHS("Nguyen Sinh Hai");
//
//        // Xoa GV X Kho Lop
//        lopHoc.xoaGVGD("Nguyen Giao Mot");
//
//        // In Ds HS
//        lopHoc.inDSHS();
//
//        // In Ds Gv
//        lopHoc.inDSGVGD();
    }
}