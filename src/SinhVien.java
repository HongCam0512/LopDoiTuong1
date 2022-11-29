import java.util.Scanner;

public class SinhVien {
    private String hoTen;
    private int maSV;
    private int namSinh;

    private String gioiTinh;
    private float diemTrungBinh;
    private String xepLoai;
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public SinhVien() {

    }
    public SinhVien(String hoTen, int maSV, int namSinh, String gioiTinh, float diemToan, float diemLy, float diemHoa) {
        this.hoTen = hoTen;
        this.maSV = maSV;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public void nhapThonTin(Scanner scaner) {
        System.out.print("Nhap ten SV:");
        this.hoTen = scaner.nextLine();
        System.out.print("\nNhap ma so SV:");
        this.maSV = scaner.nextInt();
        System.out.print("\nNhap nam sinh:");
        this.namSinh = scaner.nextInt();
        System.out.print("Nhap gioi tinh SV:");
        this.gioiTinh = scaner.nextLine();
        System.out.print("\nNhap diem Toan:");
        this.diemToan = scaner.nextFloat();
        System.out.print("\nNhap diem Ly:");
        this.diemLy = scaner.nextFloat();
        System.out.print("\nNhap diem Hoa:");
        this.diemHoa = scaner.nextFloat();

    }
    public void xuatThongTin() {
        System.out.print("Ho va ten SV:" +hoTen);
        System.out.print("\nMa so SV:" +maSV);
        System.out.print("\nNam sinh:" +namSinh);
        System.out.print("\nGioi tinh:" +gioiTinh);
        System.out.print("\nDiem Toan:"+diemToan);
        System.out.print("\nDiem Ly:"+diemLy);
        System.out.print("\nDiem Hoa:"+diemHoa);
        System.out.print("\nDiem trung binh:"+diemTrungBinh);
        System.out.print("\nXep loai:"+xepLoai);
    }
    public void tinhDiemTB() {
        diemTrungBinh = (diemToan+diemLy+diemHoa)/3;
        System.out.println("Diem trung binh la: " +diemTrungBinh);
    }
    public void xepLoaiSinhVien() {
        if (diemTrungBinh <5){
            xepLoai = "Yeu";
            System.out.println("Xep loai Yeu");
        } else if (diemTrungBinh>= 5 && diemTrungBinh<6) {
            xepLoai = "TB";
            System.out.println("Xep loai TB");
        } else if (diemTrungBinh>= 6 && diemTrungBinh<7) {
            xepLoai = " TB Kha";
            System.out.println("Xep loai TB Kha");
        } else if (diemTrungBinh >= 7 && diemTrungBinh<8) {
            xepLoai = "Kha";
            System.out.println("Xep loai Kha");
        } else if (diemTrungBinh>= 8 && diemTrungBinh<9) {
            xepLoai = "Gioi";
            System.out.println("Xep loai Gioi");
        } else {
            xepLoai = "Xuat Sac";
            System.out.println("Xep loai Xuat Sac");
        }
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public int getMaSV() {
        return maSV;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }
}
