package com.neosoft.service;

import com.neosoft.entities.Library;
import com.neosoft.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImp implements  LibraryService{

    @Autowired
    private LibraryRepository libraryRepository;


    @Override
    public Library saveInfo(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public Library getInfo(int id) {
        return libraryRepository.findById(id);
    }

    @Override
    public Library updateInfo(Library library) {
        return libraryRepository.save(library);
    }

    @Override
    public void deleteInfo(int id) {
        libraryRepository.deleteById(id);
    }

    @Override
    public List<Library> getAllInfo() {
        return libraryRepository.findAll();
    }
}
