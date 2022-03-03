package dao;

import java.sql.Connection;
import model.Book;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Magazines;
import model.News;

public class DocumentAddDao {
    int rs;
    String sql = "INSERT INTO tai_lieu(ten_tai_lieu, ten_nxb, so_luong, id_loai";
    
    public DocumentAddDao (Book book) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        
        sql += ", ten_tac_gia, so_trang) values(?, ?, ?, ?, ?, ?)";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        preparedStatement.setString(1, book.getTenTaiLieu());
        preparedStatement.setString(2, book.getTenNXB());        
        preparedStatement.setInt(3, book.getSoLuong());
        preparedStatement.setInt(4, book.getIdLoai());
        preparedStatement.setString(5, book.getTenTacGia());
        preparedStatement.setInt(6, book.getSoTrang());
        
        rs = preparedStatement.executeUpdate();
    }
    
    public DocumentAddDao (News news) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        
        sql += ", ngay_phat_hanh) values(?, ?, ?, ?, ?)";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        preparedStatement.setString(1, news.getTenTaiLieu());
        preparedStatement.setString(2, news.getTenNXB());        
        preparedStatement.setInt(3, news.getSoLuong());
        preparedStatement.setInt(4, news.getIdLoai());
        preparedStatement.setString(5, news.getNgayPhatHanh());
        
        rs = preparedStatement.executeUpdate();
    }
    
    public DocumentAddDao (Magazines magazines) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();
        
        sql += ", so_phat_hanh, thang_phat_hanh, nam_phat_hanh) values(?, ?, ?, ?, ?, ?, ?)";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        
        preparedStatement.setString(1, magazines.getTenTaiLieu());
        preparedStatement.setString(2, magazines.getTenNXB());        
        preparedStatement.setInt(3, magazines.getSoLuong());
        preparedStatement.setInt(4, magazines.getIdLoai());
        preparedStatement.setString(5, magazines.getSoPhatHanh());
        preparedStatement.setInt(6, magazines.getThangPhatHanh());
        preparedStatement.setInt(7, magazines.getNamPhatHanh());
        
        rs = preparedStatement.executeUpdate();
    }
    
    public int getRs() {
        return rs;
    }
}
