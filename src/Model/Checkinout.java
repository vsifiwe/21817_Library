package Model;
// Generated 10-May-2020 21:35:25 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Checkinout generated by hbm2java
 */
public class Checkinout  implements java.io.Serializable {


     private Integer id;
     private Book book;
     private Users users;
     private Date doneAt;
     private String status;

    public Checkinout() {
    }

    public Checkinout(Book book, Users users, Date doneAt, String status) {
       this.book = book;
       this.users = users;
       this.doneAt = doneAt;
       this.status = status;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Book getBook() {
        return this.book;
    }
    
    public void setBook(Book book) {
        this.book = book;
    }
    public Users getUsers() {
        return this.users;
    }
    
    public void setUsers(Users users) {
        this.users = users;
    }
    public Date getDoneAt() {
        return this.doneAt;
    }
    
    public void setDoneAt(Date doneAt) {
        this.doneAt = doneAt;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }




}


