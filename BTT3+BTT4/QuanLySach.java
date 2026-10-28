import java.util.Scanner;

class Sach {
    // Khai báo thuộc tính
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private int loaiSach; // Bổ sung cho Bài 4

    // Hàm Nhập
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
        // Nhập loại sách (Bài 4)
        System.out.print("Chọn loại sách (1: Sách giáo khoa, 2: Sách tham khảo, 3: Sách chuyên ngành, 4: Sách khác): ");
        this.loaiSach = sc.nextInt();
        sc.close();
    }

    // Hàm tính toán tuần 3
    public double tinhThanhTien() {
        return donGia * soLuong;
    }

    public double tinhPhiVanChuyen() {
        return tinhThanhTien() * 0.05;
    }

    public double tinhTongTien() {
        return tinhThanhTien() + tinhPhiVanChuyen();
    }

    // BÀI TUẦN 4
    // Bài 1: Kiểm tra giá > 0, số lượng >= 0, năm xuất bản hợp lệ
    public boolean kiemTraHopLe() {
        return (donGia > 0 && soLuong >= 0 && namXuatBan > 0 && namXuatBan <= 2026);
    }

    // Bài 2: Phân loại giá (thấp, trung bình, cao, đặc biệt)
    public String phanLoaiGia() {
        if (donGia < 50000) {
            return "Sách giá thấp";
        } else if (donGia <= 100000) {
            return "Sách giá trung bình";
        } else if (donGia <= 200000) {
            return "Sách giá cao";
        } else {
            return "Sách giá đặc biệt";
        }
    }

    // Bài 3: Phân loại tồn kho (hết, sắp hết, còn ít, còn nhiều)
    public String phanLoaiTonKho() {
        if (soLuong == 0) {
            return "Hết sách";
        } else if (soLuong <= 5) {
            return "Sắp hết";
        } else if (soLuong <= 20) {
            return "Còn ít";
        } else {
            return "Còn nhiều";
        }
    }

    // Bài 4: Dùng switch chọn loại sách
    public String layLoaiSach() {
        switch (loaiSach) {
            case 1:
                return "Sách giáo khoa";
            case 2:
                return "Sách tham khảo";
            case 3:
                return "Sách chuyên ngành";
            default:
                return "Sách khác";
        }
    }

    // Hàm Xuất
    public void Xuat() {
        System.out.println("\n--- THÔNG TIN SÁCH ---");
        System.out.println("Mã sách: " + maSach);
        System.out.println("Tên sách: " + tenSach);
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Năm xuất bản: " + namXuatBan);
        System.out.println("Đơn giá: " + donGia);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Thành tiền: " + tinhThanhTien());
        System.out.println("Phí vận chuyển: " + tinhPhiVanChuyen());
        System.out.println("Tổng tiền nhập: " + tinhTongTien());
        System.out.println("\n--- KẾT QUẢ ĐÁNH GIÁ (TUẦN 4) ---");
        System.out.println("Trạng thái hợp lệ: " + (kiemTraHopLe() ? "Hợp lệ" : "Không hợp lệ"));
        System.out.println("Phân loại giá: " + phanLoaiGia());
        System.out.println("Tình trạng tồn kho: " + phanLoaiTonKho());
        System.out.println("Loại sách: " + layLoaiSach());
    }
}

public class QuanLySach {
    public static void main(String[] args) {
        Sach s = new Sach();
        s.Nhap();
        s.Xuat();
    }
}
