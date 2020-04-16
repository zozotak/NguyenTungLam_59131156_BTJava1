/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author DELL
 */
public interface IQLDS {
    // them ca nhan
    public abstract int Them(CaNhan cn);
    // xoa xa nhan
    public abstract int Xoa(String ten);
    // in ds ca nhan
    public abstract void inDS();
}
