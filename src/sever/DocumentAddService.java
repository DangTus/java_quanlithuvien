package sever;

import dao.DocumentAddDao;
import java.sql.SQLException;
import model.Book;
import model.Magazines;
import model.News;

public class DocumentAddService {

    int rs;
    DocumentAddDao documentAddDao;

    public DocumentAddService(Book book) throws SQLException {
        documentAddDao = new DocumentAddDao(book);
        rs = documentAddDao.getRs();
    }

    public DocumentAddService(News news) throws SQLException {
        documentAddDao = new DocumentAddDao(news);
        rs = documentAddDao.getRs();
    }

    public DocumentAddService(Magazines magazines) throws SQLException {
        documentAddDao = new DocumentAddDao(magazines);
        rs = documentAddDao.getRs();
    }

    public int getRs() {
        return rs;
    }
}
