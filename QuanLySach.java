import java.util.Scanner;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   CHƯƠNG TRÌNH QUẢN LÝ NHẬP SÁCH THƯ VIỆN");
        System.out.println("==========================================");

        // BÀI 1: Nhập thông tin sách
        System.out.print("1. Nhập mã sách: ");
        String maSach = scanner.nextLine();

        System.out.print("2. Nhập tên sách: ");
        String tenSach = scanner.nextLine();

        System.out.print("3. Nhập tên tác giả: ");
        String tacGia = scanner.nextLine();

        System.out.print("4. Nhập năm xuất bản: ");
        int namXuatBan = scanner.nextInt();

        System.out.print("5. Nhập đơn giá (VNĐ): ");
        double donGia = scanner.nextDouble();

        System.out.print("6. Nhập số lượng: ");
        int soLuong = scanner.nextInt();

        // BÀI 2: Tính thành tiền = đơn giá * số lượng
        double thanhTien = donGia * soLuong;

        // BÀI 3: Phí vận chuyển = 5% giá trị sách (5% của thành tiền)
        double phiVanChuyen = thanhTien * 0.05;

        // BÀI 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
        double tongTienNhap = thanhTien + phiVanChuyen;

        // HIỂN THỊ KẾT QUẢ
        System.out.println("\n==========================================");
        System.out.println("        THÔNG TIN HÓA ĐƠN NHẬP KHO        ");
        System.out.println("==========================================");
        System.out.println("Mã sách         : " + maSach);
        System.out.println("Tên sách        : " + tenSach);
        System.out.println("Tác giả         : " + tacGia);
        System.out.println("Năm xuất bản    : " + namXuatBan);
        System.out.printf("Đơn giá         : %,.0f VNĐ\n", donGia);
        System.out.println("Số lượng        : " + soLuong);
        System.out.println("------------------------------------------");
        System.out.printf("Thành tiền (Bài 2)     : %,.0f VNĐ\n", thanhTien);
        System.out.printf("Phí vận chuyển (Bài 3) : %,.0f VNĐ\n", phiVanChuyen);
        System.out.printf("=> TỔNG TIỀN NHẬP (Bài 4): %,.0f VNĐ\n", tongTienNhap);
        System.out.println("==========================================");

        scanner.close();
    }
}
