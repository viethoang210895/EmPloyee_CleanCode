package BAITAP;

public class NhanVien {
    public int maNV;
    public String name;
    public int tuoiNV;
    public int soDienThoai;
    public String email;


    public NhanVien(int maNV, String name, int tuoiNV, int soDienThoai, String email) {
        this.maNV = maNV;
        this.name = name;
        this.tuoiNV = tuoiNV;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


