package BAITAP;

public class NhanVienParttime extends NhanVien{
    double soGio;

    public NhanVienParttime(int maNV, String name, int tuoiNV, int soDienThoai, String email, double soGio) {
        super(maNV, name, tuoiNV, soDienThoai, email);
        this.soGio = soGio;
    }
    public double moneyPart(){
        return (soGio*10);
    }


}
