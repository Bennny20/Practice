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
public class PhanSo {

    private int tuSO;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSO, int mauSo) {
        this.tuSO = tuSO;
        this.mauSo = mauSo;
    }
    
    public void printPhanSo(){
        System.out.println("phan so 1: " + tuSO + "/" + mauSo);
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void rutGonPS() {
        int i = timUSCLN(tuSO, mauSo);
        tuSO /= i;
        mauSo /= i;
    }

    public void congPhanSo(PhanSo ps) {
        int tu = tuSO * ps.mauSo + mauSo * ps.tuSO;
        int mau = mauSo * ps.mauSo;
        PhanSo newPS = new PhanSo(tu, mau);
        newPS.rutGonPS();
        System.out.println("Tong ca 2 phan so la: " + newPS.tuSO + "/" + newPS.mauSo);
    }

    public void truPhanSo(PhanSo ps) {
        int tu = tuSO * ps.mauSo - mauSo * ps.tuSO;
        int mau = mauSo * ps.mauSo;
        PhanSo newPS = new PhanSo(tu, mau);
        newPS.rutGonPS();
        System.out.println("Hieu ca 2 phan so la: " + newPS.tuSO + "/" + newPS.mauSo);
    }

    public void nhanPhanSo(PhanSo ps) {
        int tu = tuSO * ps.tuSO;
        int mau = mauSo * ps.mauSo;
        PhanSo newPS = new PhanSo(tu, mau);
        newPS.rutGonPS();
        System.out.println("Tich ca 2 phan so la: " + newPS.tuSO + "/" + newPS.mauSo);
    }
    
    public void chiaPhanSo(PhanSo ps) {
        int tu = tuSO * ps.mauSo;
        int mau = mauSo * ps.tuSO;
        PhanSo newPS = new PhanSo(tu, mau);
        newPS.rutGonPS();
        System.out.println("Thuong ca 2 phan so la: " + newPS.tuSO + "/" + newPS.mauSo);
    }

//   public  void cong(PhanSo a)
//    {
//        tu = tu*a.mau + mau*a.tu;
//        mau = mau*a.mau;
//    }
//    void tru(PhanSo a)
//    {
//        tu = tu*a.mau - mau*a.tu;
//        mau = mau*a.mau;
//    }
//    void nhan(PhanSo a)
//    {
//        tu = tu*a.tu;
//        mau = mau*a.mau;
//    }
//    void chia(PhanSo a)
//    {
//        tu = tu*a.mau;
//        mau = mau*a.tu;
}
