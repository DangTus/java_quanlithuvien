package dao;

import java.sql.SQLException;
import java.util.List;
import model.Document;

public class DocumentDao {
    public List<Document> getAll(int idLoai) throws ClassNotFoundException, SQLException {
        List<Document> documents = new ArrayList<Document>();
        Connection con = 
    }
    
    public List<String> getCategori() throws SQLException {
        return documentDao.getCategori();
    }
}
