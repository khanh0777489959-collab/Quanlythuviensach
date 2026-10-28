import java.util.Scanner;

public class QuanLySach {
    // Khai báo các biến lưu thông tin sách
    static String maSach;
    static String tenSach;
    static String tacGia;
    static int namXuatBan;
    static double donGia;
    static int soLuong;

    // Khai báo các biến lưu kết quả tính toán
    static double thanhTien;
    static double phiVanChuyen;
    static double tongTienNhap;

    // Hàm nhập thông tin sách sử dụng Scanner sc (Bài 1)
    public static void nhap(Scanner sc) {
        System.out.println("====== NHẬP THÔNG TIN SÁCH ======");
        System.out.print("Nhập mã sách: ");
        maSach = sc.nextLine();

        System.out.print("Nhập tên sách: ");
        tenSach = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        tacGia = sc.nextLine();

        System.out.print("Nhập năm xuất bản: ");
        namXuatBan = sc.nextInt();

        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        soLuong = sc.nextInt();
    }

    // Hàm tính toán các giá trị tiền nhập kho (Bài 2, 3, 4)
    public static void tinhToan() {
        // Bài 2: Thành tiền = đơn giá * số lượng
        thanhTien = donGia * soLuong;

        // Bài 3: Phí vận chuyển = 5% giá trị sách
        phiVanChuyen = thanhTien * 0.05;

        // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        tongTienNhap = thanhTien + phiVanChuyen;
    }

    // Hàm xuất thông tin và hóa đơn ra màn hình
    public static void xuat() {
        System.out.println("\n====== THÔNG TIN NHẬP KHO ======");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.printf("Đơn giá         : %,.0f VNĐ\n", donGia);
        System.out.println("Số lượng        : " + soLuong);
        System.out.println("--------------------------------");
        System.out.printf("Thành tiền (Bài 2)     : %,.0f VNĐ\n", thanhTien);
        System.out.printf("Phí vận chuyển (Bài 3) : %,.0f VNĐ\n", phiVanChuyen);
        System.out.printf("Tổng tiền nhập (Bài 4) : %,.0f VNĐ\n", tongTienNhap);
        System.out.println("================================");
    }

    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner sc
        Scanner sc = new Scanner(System.in);

        // Gọi các hàm thực hiện
        nhap(sc);      // Gọi hàm nhập thông tin
        tinhToan();    // Gọi hàm tính tiền
        xuat();        // Gọi hàm xuất kết quả

        // Đóng Scanner
        sc.close();
    }
}
