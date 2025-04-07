package com.neosoft.service;

import com.neosoft.entities.Library;

import java.util.List;

public interface LibraryService {

//    save
    public Library saveInfo(Library library);

//    get by id
    public Library getInfo(int id);

//    update
    public Library updateInfo(Library library);

//    delete by id
    public void deleteInfo(int id);

//    get all
    public List<Library> getAllInfo();
}
