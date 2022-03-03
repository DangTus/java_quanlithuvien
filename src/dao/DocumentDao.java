package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Document;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DocumentDao {
    public List<Document> getAll(int idLoai) throws SQLException {
        PreparedStatement preparedStatement;
        
        List<Document> documents = new ArrayList<Document>();
        
        Connection con = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM tai_lieu";
        
        if(idLoai != 0) {
            sql += " WHERE id_loai = ?";
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, idLoai);
        } else {
            preparedStatement = con.prepareStatement(sql);
        }
        
        ResultSet rs = preparedStatement.executeQuery();
        
        while(rs.next()) {
            Document document = new Document();
            document.setId(rs.getInt("id"));
            document.setTenTaiLieu(rs.getString("ten_tai_lieu"));
            document.setTenNXB(rs.getString("ten_nxb"));
            document.setSoLuong(rs.getInt("so_luong"));
            
            documents.add(document);
        }
        
        return documents;
    }
    
    public List<String> getCategori() throws SQLException {        
        List<String> categories = new ArrayList<String>();
        
        Connection con = JDBCConnection.getJDBCConnection();
        
        String sql = "SELECT * FROM loai";
        
        PreparedStatement preparedStatement = con.prepareStatement(sql);        
        
        ResultSet rs = preparedStatement.executeQuery();
        
        while(rs.next()) {
            String categori;
            categori = rs.getString("ten_loai");
            
            categories.add(categori);
        }
        
        return categories;
    }
}
