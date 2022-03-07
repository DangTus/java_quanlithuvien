package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Book;
import model.Magazines;
import model.News;

public class DocumentUpdateDao {

    int rs;
    String sql = "UPDATE tai_lieu SET ten_tai_lieu = ?, ten_nxb = ?, so_luong = ?";

    public DocumentUpdateDao(Book book) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();

        sql += ", ten_tac_gia = ?, so_trang = ? WHERE id = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, book.getTenTaiLieu());
        preparedStatement.setString(2, book.getTenNXB());
        preparedStatement.setInt(3, book.getSoLuong());
        preparedStatement.setString(4, book.getTenTacGia());
        preparedStatement.setInt(5, book.getSoTrang());
        preparedStatement.setInt(6, book.getId());

        rs = preparedStatement.executeUpdate();
    }

    public DocumentUpdateDao(News news) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();

        sql += ", ngay_phat_hanh = ? WHERE id = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, news.getTenTaiLieu());
        preparedStatement.setString(2, news.getTenNXB());
        preparedStatement.setInt(3, news.getSoLuong());
        preparedStatement.setString(4, news.getNgayPhatHanh());
        preparedStatement.setInt(5, news.getId());

        rs = preparedStatement.executeUpdate();
    }

    public DocumentUpdateDao(Magazines magazines) throws SQLException {
        Connection con = JDBCConnection.getJDBCConnection();

        sql += ", so_phat_hanh = ?, thang_phat_hanh = ?, nam_phat_hanh = ? WHERE id = ?";

        PreparedStatement preparedStatement = con.prepareStatement(sql);

        preparedStatement.setString(1, magazines.getTenTaiLieu());
        preparedStatement.setString(2, magazines.getTenNXB());
        preparedStatement.setInt(3, magazines.getSoLuong());
        preparedStatement.setString(4, magazines.getSoPhatHanh());
        preparedStatement.setInt(5, magazines.getThangPhatHanh());
        preparedStatement.setInt(6, magazines.getNamPhatHanh());
        preparedStatement.setInt(7, magazines.getId());

        rs = preparedStatement.executeUpdate();
    }

    public int getRs() {
        return rs;
    }
}
