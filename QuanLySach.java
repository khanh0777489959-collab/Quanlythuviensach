import java.util.Scanner;

// Lớp Sách chứa các thuộc tính, getter/setter, hàm nhập và xuất
class Sach {
    // 1. Thuộc tính (dùng private, KHÔNG dùng static)
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    // Constructor mặc định (hàm khởi tạo không tham số)
    public Sach() {
    }

    // Constructor có tham số
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // 2. Các hàm Getter và Setter
    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // 3. Các hàm tính toán
    // Bài 2: Tính thành tiền = đơn giá * số lượng
    public double tinhThanhTien() {
        return this.donGia * this.soLuong;
    }

    // Bài 3: Phí vận chuyển = 5% giá trị sách (5% của thành tiền)
    public double tinhPhiVanChuyen() {
        return this.tinhThanhTien() * 0.05;
    }

    // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
    public double tinhTongTien() {
        return this.tinhThanhTien() + this.tinhPhiVanChuyen();
    }

    // 4. Hàm nhập thông tin bằng Scanner sc (Bài 1)
    public void nhap(Scanner sc) {
        System.out.println("====== NHẬP THÔNG TIN SÁCH ======");
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
    }

    // 5. Hàm xuất thông tin ra màn hình
    public void xuat() {
        System.out.println("\n====== THÔNG TIN NHẬP KHO ======");
        System.out.println("Mã sách         : " + this.maSach);
        System.out.println("Tên sách        : " + this.tenSach);
        System.out.println("Tác giả         : " + this.tacGia);
        System.out.println("Năm xuất bản    : " + this.namXuatBan);
        System.out.printf("Đơn giá         : %,.0f VNĐ\n", this.donGia);
        System.out.println("Số lượng        : " + this.soLuong);
        System.out.println("--------------------------------");
        System.out.printf("Thành tiền (Bài 2)     : %,.0f VNĐ\n", this.tinhThanhTien());
        System.out.printf("Phí vận chuyển (Bài 3) : %,.0f VNĐ\n", this.tinhPhiVanChuyen());
        System.out.printf("=> TỔNG TIỀN NHẬP (Bài 4): %,.0f VNĐ\n", this.tinhTongTien());
        System.out.println("================================");
    }
}

// Lớp chính chứa hàm main để chạy chương trình
public class QuanLySach {
    public static void main(String[] args) {
        // Khởi tạo Scanner sc
        Scanner sc = new Scanner(System.in);

        // Khởi tạo đối tượng sách
        Sach s = new Sach();

        // Gọi hàm nhập và hàm xuất
        s.nhap(sc);
        s.xuat();

        // Đóng scanner
        sc.close();
    }
}
