/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//

import Interfaces.IQLDS;
import java.main.ArrayList;

//
/**
 *
 * @author DELL
 */
public class QLDS implements IQLDS {
    // attributes
    private ArrayList<CaNhan> dsCaNhan = new ArrayList<>();

    // constructor
    public QLDS(ArrayList<CaNhan> dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
    // methods Them Ca Nhan

    @Override
    public int Them(CaNhan cn) {
      dsCaNhan.add(cn);
      return 1;
    }

    // methods Xoa Ca Nhan
    @Override
    public int Xoa(String ten) {
      if (dsCaNhan.removeIf(cn -> cn.hoTen.equals(ten))) {
        return 1;
      }
      return 0;
    }

    // methods In Ds
    @Override
    public void inDS() {
      dsCaNhan.forEach(cn -> System.out.println(cn.hienThiTT()));
    }
}