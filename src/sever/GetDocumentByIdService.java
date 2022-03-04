package sever;

import dao.GetDocumentByIdDao;
import dao.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Book;
import model.Magazines;
import model.News;

public class GetDocumentByIdService {
    Book book = null;
    News news = null;
    Magazines magazines = null;
    int idLoai;
    GetDocumentByIdDao getDocumentByIdDao;
    
    public GetDocumentByIdService(int id) throws SQLException {
        getDocumentByIdDao = new GetDocumentByIdDao(id);
        
        idLoai = getDocumentByIdDao.getIdLoai();
        
        switch(idLoai) {
            case 1:
                book = getDocumentByIdDao.getBook();
            case 2:
                news = getDocumentByIdDao.getNews();
            case 3:
                magazines = getDocumentByIdDao.getMagazines();
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
