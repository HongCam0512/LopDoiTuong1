import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien();
        sinhVien.nhapThonTin(scanner);
        System.out.print("\n");
        sinhVien.tinhDiemTB();
        System.out.print("\n");
        sinhVien.xepLoaiSinhVien();
        System.out.println("\nThong tin sinh vien:");
        sinhVien.xuatThongTin();
    }
}