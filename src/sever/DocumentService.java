package sever;

import dao.DocumentDao;
import java.sql.SQLException;
import java.util.List;
import model.Book;
import model.Document;
import model.Magazines;
import model.News;

public class DocumentService {
    private DocumentDao documentDao;
    Book book = null;
    News news = null;
    Magazines magazines = null;

    public DocumentService() {
        documentDao = new DocumentDao();
    }
    
    public List<Document> getAll(int idLoai) throws SQLException {
        return documentDao.getAll(idLoai);
    }
    
    public List<String> getCategori() throws SQLException {
        return documentDao.getCategori();
    }
    
    public int deleteDocument(int id) throws SQLException {
        return documentDao.deleteDocument(id);
    }
}
