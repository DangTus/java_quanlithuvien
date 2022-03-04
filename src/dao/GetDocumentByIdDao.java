package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Book;
import model.Magazines;
import model.News;

public class GetDocumentByIdDao {
    Book book = null;
    News news = null;
    Magazines magazines = null;
    int idLoai;
    
    public GetDocumentByIdDao(int id) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM tai_lieu WHERE id = ?";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        preparedStatement.setInt(1, id);
        
        ResultSet rs = preparedStatement.executeQuery();
        
        rs.next();
        
        idLoai = rs.getInt("id_loai");
        
        switch(idLoai) {
            case 1:
                book = new Book();
                book.setId(rs.getInt("id"));
                book.setTenTaiLieu(rs.getString("ten_tai_lieu"));
                book.setTenNXB(rs.getString("ten_nxb"));
                book.setSoLuong(rs.getInt("so_luong"));
                book.setIdLoai(rs.getInt("id_loai"));
                book.setTenTacGia(rs.getString("ten_tac_gia"));
                book.setSoTrang(rs.getInt("so_trang"));
            
            case 2:
                news = new News();
                news.setId(rs.getInt("id"));
                news.setTenTaiLieu(rs.getString("ten_tai_lieu"));
                news.setTenNXB(rs.getString("ten_nxb"));
                news.setSoLuong(rs.getInt("so_luong"));
                news.setIdLoai(rs.getInt("id_loai"));
                news.setNgayPhatHanh(rs.getString("ngay_phat_hanh"));
                
            case 3:
                magazines = new Magazines();
                magazines.setId(rs.getInt("id"));
                magazines.setTenTaiLieu(rs.getString("ten_tai_lieu"));
                magazines.setTenNXB(rs.getString("ten_nxb"));
                magazines.setSoLuong(rs.getInt("so_luong"));
                magazines.setIdLoai(rs.getInt("id_loai"));
                magazines.setSoPhatHanh(rs.getString("so_phat_hanh"));
                magazines.setThangPhatHanh(rs.getInt("thang_phat_hanh"));
                magazines.setNamPhatHanh(rs.getInt("nam_phat_hanh"));
        }        
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }

    public Magazines getMagazines() {
        return magazines;
    }

    public void setMagazines(Magazines magazines) {
        this.magazines = magazines;
    }

    public int getIdLoai() {
        return idLoai;
    }

    public void setIdLoai(int idLoai) {
        this.idLoai = idLoai;
    }
}
