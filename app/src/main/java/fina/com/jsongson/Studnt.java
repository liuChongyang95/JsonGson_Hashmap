package fina.com.jsongson;

import java.util.ArrayList;
import java.util.HashMap;

public class Studnt {
    public int id;
    public String nickName;
    public int age;
    public ArrayList<String> books;
    public HashMap<String, String> booksMap;

    public Studnt() {
    }

    public Studnt(String nickName, int id) {
        this.nickName = nickName;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<String> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<String> books) {
        this.books = books;
    }

    public HashMap<String, String> getBooksMap() {
        return booksMap;
    }

    public void setBooksMap(HashMap<String, String> booksMap) {
        this.booksMap = booksMap;
    }
}
