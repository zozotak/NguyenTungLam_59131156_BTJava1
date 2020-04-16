/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//

import Interface.IQLDS;
import java.main.ArrayList;

/**
 *
 * @author DELL
 */
public class LopHoc {
    // attributes
    // giao vien chu nhiem
    private GiaoVien giaoVienCN = null;
    // danh sach hoc sinh trong lop
    private ArrayList<CaNhan> dsHocSinh = null;
    // danh sach giao vien giang day cua lop
    private ArrayList<CaNhan> dsGVGD = null;
    
    // quan ly hoc sinh
    private IQLDS qlDsGVGD = null;
    // quan ly danh sach giao vien
    private IQLDS qlDsHS = null;

    // conrtructor
    // no params
    public  LopHoc() {
        this.giaoVienCN = new GiaoVien();
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }
    // contructor LopHoc - GV TRuyen Vao
    public LopHoc(GiaoVien gvChuNhiem) {
        this.giaoVienCN = gvChuNhiem;
        this.dsHocSinh = new ArrayList<>();
        this.dsGVGD = new ArrayList<>();
        this.qlDsHS = new QLDS(dsHocSinh);
        this.qlDsGVGD = new QLDS(dsGVGD);
    }

    // getter, setter
    public void setGiaoVienCN(GiaoVien giaoVienCN) { this.giaoVienCN = giaoVienCN; } 
    public GiaoVien getGiaoVienCN() { return giaoVienCN; }
    
    
    // methods Them HS
    public int ThemHocSinh(HocSinh hs) {
      if (qlDsHS.them(hs) == 1) {
        return 1;
      }
      return 0;
    }
    // methods Them GV 
    public int ThemGVGD(GiaoVien gv) {
      if (qlDsGVGD.them(gv) == 1) {
        return 1;
      }
      return 0;
    }
    // In Ds HS
    public int inDSHS() {
        System.out.println("Danh sach hoc sinh:");
        qlDsHS.inDS();
//        for(CaNhan hs : dsHocSinh) {
//            System.out.println(hs.HienThiTT());
//        }
        return 1;
    }
    // In Ds GV
    public int inDSGVGD() {
        System.out.println("Danh sach giao vien giang day:");
        qlDsGVGD.inDS();
//        for (CaNhan gv : dsGVGD) {
//            System.out.println(gv.HienThiTT());
//        }
        return 1;
    }
//    // Xoa SV
//    public int xoaHS(String ten) {
//        if (qlDsHS.xoa(ten) == 1) {
//          return 1;
//        }
//        return 0;
//    }
//    // Xoa GV
//    public int xoaGVGD(String ten) {
//        if (qlDsGVGD.xoa(ten) == 1) {
//          return 1;
//        }
//        return 0;
//    }

    public void ThemHocSinh(HocSinh hs1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}