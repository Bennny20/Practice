/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practiceDay10.Bai2;

/**
 *
 * @author phien
 */
public class Main {

    public static void main(String[] args) {
        PhanSo ps1 = new PhanSo(16, 3);
        ps1.printPhanSo();
        PhanSo ps2 = new PhanSo(4, 8);
        ps2.printPhanSo();
        ps1.congPhanSo(ps2);
        ps1.truPhanSo(ps2);
        ps1.nhanPhanSo(ps2);
        ps1.chiaPhanSo(ps2);
    }
}
