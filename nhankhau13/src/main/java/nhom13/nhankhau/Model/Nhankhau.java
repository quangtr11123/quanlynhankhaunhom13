package nhom13.nhankhau.Model;

import java.sql.Date;


public class Nhankhau {
    int Manhankhau;
    String Hovaten;
    String CCCD;
    Date Ngaysinh;
    String Noisinh;
    String Dantoc;
    String Tongiao;
    Boolean Gioitinh;
    String Trinhdovanhoa;
    String Nghenghiep;
    String Noilamviec;
    Date Ngaydangkythuongtru;
    String Quanhevoichuho;
    int Mahokhau;
    String Ghichu;


    public Nhankhau(int manhankhau, String hovaten, String CCCD, Date ngaysinh, String noisinh, String dantoc, String tongiao, Boolean gioitinh, String trinhdovanhoa, String nghenghiep, String noilamviec, Date ngaydangkythuongtru, String quanhevoichuho, int mahokhau, String ghichu) {
        this.Manhankhau = manhankhau;
        this.Hovaten = hovaten;
        this.CCCD = CCCD;
        this.Ngaysinh = ngaysinh;
        this.Noisinh = noisinh;
        this.Dantoc = dantoc;
        this.Tongiao = tongiao;
        this.Gioitinh = gioitinh;
        this.Trinhdovanhoa = trinhdovanhoa;
        this.Nghenghiep = nghenghiep;
        this.Noilamviec = noilamviec;
        this.Ngaydangkythuongtru = ngaydangkythuongtru;
        this.Quanhevoichuho = quanhevoichuho;
        this.Mahokhau = mahokhau;
        this.Ghichu = ghichu;
    }


    public int getManhankhau() {
        return Manhankhau;
    }

    public void setManhankhau(int manhankhau) {
        Manhankhau = manhankhau;
    }

    public String getHovaten() {
        return Hovaten;
    }

    public void setHovaten(String hovaten) {
        Hovaten = hovaten;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public Date getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        Ngaysinh = ngaysinh;
    }

    public String getNoisinh() {
        return Noisinh;
    }

    public void setNoisinh(String noisinh) {
        Noisinh = noisinh;
    }

    public String getDantoc() {
        return Dantoc;
    }

    public void setDantoc(String dantoc) {
        Dantoc = dantoc;
    }

    public String getTongiao() {
        return Tongiao;
    }

    public void setTongiao(String tongiao) {
        Tongiao = tongiao;
    }

    public Boolean getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(Boolean gioitinh) {
        Gioitinh = gioitinh;
    }

    public String getTrinhdovanhoa() {
        return Trinhdovanhoa;
    }

    public void setTrinhdovanhoa(String trinhdovanhoa) {
        Trinhdovanhoa = trinhdovanhoa;
    }

    public String getNghenghiep() {
        return Nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        Nghenghiep = nghenghiep;
    }

    public String getNoilamviec() {
        return Noilamviec;
    }

    public void setNoilamviec(String noilamviec) {
        Noilamviec = noilamviec;
    }

    public Date getNgaydangkythuongtru() {
        return Ngaydangkythuongtru;
    }

    public void setNgaydangkythuongtru(Date ngaydangkythuongtru) {
        Ngaydangkythuongtru = ngaydangkythuongtru;
    }

    public String getQuanhevoichuho() {
        return Quanhevoichuho;
    }

    public void setQuanhevoichuho(String quanhevoichuho) {
        Quanhevoichuho = quanhevoichuho;
    }

    public int getMahokhau() {
        return Mahokhau;
    }

    public void setMahokhau(int mahokhau) {
        Mahokhau = mahokhau;
    }

    public String getGhichu() {
        return Ghichu;
    }

    public void setGhichu(String ghichu) {
        Ghichu = ghichu;
    }


}



