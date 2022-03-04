package sever;

import dao.DocumentUpdateDao;
import java.sql.SQLException;
import model.Book;
import model.Magazines;
import model.News;

public class DocumentUpdateService {
    int rs;
    DocumentUpdateDao documentUpdateDao;
    
    public DocumentUpdateService (Book book) throws SQLException{
        documentUpdateDao = new DocumentUpdateDao(book);
        rs = documentUpdateDao.getRs();
    }
    
    public DocumentUpdateService (News news) throws SQLException{
        documentUpdateDao = new DocumentUpdateDao(news);
        rs = documentUpdateDao.getRs();
    }
    
    public DocumentUpdateService (Magazines magazines) throws SQLException{
        documentUpdateDao = new DocumentUpdateDao(magazines);
        rs = documentUpdateDao.getRs();
    }
    
    public int getRs() {
        return rs;
    }
}
