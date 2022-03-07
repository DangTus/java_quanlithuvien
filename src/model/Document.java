package model;

public class Document {

    private int id;
    private String tenTaiLieu;
    private String tenNXB;
    private int soLuong;
    private int idLoai;

    public int getId() {
        return id;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }

    public String getTenTaiLieu() {
        return tenTaiLieu;
    }

    public void setTenTaiLieu(String tenTaiLieu) {
        this.tenTaiLieu = tenTaiLieu;
    }
}
