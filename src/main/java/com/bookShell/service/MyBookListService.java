package com.bookShell.service;

import com.bookShell.entity.MyBookList;
import com.bookShell.repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookListRepository myBookRepository;

    public void saveMyBook(MyBookList book){
        myBookRepository.save(book);
    }

    public List<MyBookList> getAllMyBooks(){
        return myBookRepository.findAll();
    }

    public void deleteById(int id){
        myBookRepository.deleteById(id);
    }
}
