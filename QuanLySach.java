import java.util.Scanner;

// Lớp Sách chứa các thuộc tính, getter, setter, hàm nhập và hàm xuất
class Sach {
    // 1. Khai báo thuộc tính (private, không dùng static)
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    // Constructor mặc định (hàm khởi tạo)
    public Sach() {
    }

    // Constructor đầy đủ tham số
    public Sach(String maSach, String tenSach, String tacGia, int namXuatBan, double donGia, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namXuatBan = namXuatBan;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // 2. Các hàm Getters và Setters
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
        return getDonGia() * getSoLuong();
    }

    // Bài 3: Phí vận chuyển = 5% giá trị sách (5% của thành tiền)
    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    // Bài 4: Tổng tiền nhập = Thành tiền + Phí vận chuyển
    public double tinhTongTien() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // 4. Hàm nhập: Khởi tạo new Scanner sc ngay bên trong hàm và dùng các hàm set
    public void nhap() {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== NHẬP THÔNG TIN SÁCH ======");
        System.out.print("Nhập mã sách: ");
        setMaSach(sc.nextLine());

        System.out.print("Nhập tên sách: ");
        setTenSach(sc.nextLine());

        System.out.print("Nhập tác giả: ");
        setTacGia(sc.nextLine());

        System.out.print("Nhập năm xuất bản: ");
        setNamXuatBan(sc.nextInt());

        System.out.print("Nhập đơn giá: ");
        setDonGia(sc.nextDouble());

        System.out.print("Nhập số lượng: ");
        setSoLuong(sc.nextInt());
    }

    // 5. Hàm xuất: Dùng các hàm get để hiển thị thông tin ra màn hình
    public void xuat() {
        System.out.println("\n====== THÔNG TIN NHẬP KHO ======");
        System.out.println("Mã sách         : " + getMaSach());
        System.out.println("Tên sách        : " + getTenSach());
        System.out.println("Tác giả         : " + getTacGia());
        System.out.println("Năm xuất bản    : " + getNamXuatBan());
        System.out.printf("Đơn giá         : %,.0f VNĐ\n", getDonGia());
        System.out.println("Số lượng        : " + getSoLuong());
        System.out.println("--------------------------------");
        System.out.printf("Thành tiền (Bài 2)     : %,.0f VNĐ\n", tinhThanhTien());
        System.out.printf("Phí vận chuyển (Bài 3) : %,.0f VNĐ\n", tinhPhiVanChuyen());
        System.out.printf("=> TỔNG TIỀN NHẬP (Bài 4): %,.0f VNĐ\n", tinhTongTien());
        System.out.println("================================");
    }
}

// Lớp chính chứa hàm main để chạy
public class QuanLySach {
    public static void main(String[] args) {
        // new đối tượng Sach
        Sach s = new Sach();

        // Gọi hàm nhập và hàm xuất
        s.nhap();
        s.xuat();
    }
}
