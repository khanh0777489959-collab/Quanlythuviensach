import java.util.Scanner;

class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // Bai 1
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        this.maSach = sc.nextLine();
        System.out.print("Nhập tên sách: ");
        this.tenSach = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.namXuatBan = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextDouble();
        System.out.print("Nhập số lượng: ");
        this.soLuong = sc.nextInt();
        sc.close();
    }

    // Bài 2: Hàm tính thành tiền
    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    // Bài 4: Hàm tính tổng tiền nhập
    public double tinhTongTien() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    public void Xuat() {
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
        System.out.println("Phí vận chuyển: " + tinhPhiVanChuyen());
        System.out.println("Tổng tiền nhập: " + tinhTongTien());
    }
}

public class QuanLySach {
    public static void main(String[] args) {
        Sach s = new Sach();
        s.Nhap();
        s.Xuat();
    }
}