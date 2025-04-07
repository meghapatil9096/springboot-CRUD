package com.neosoft.controller;

import com.neosoft.entities.Library;
import com.neosoft.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;


    @PostMapping("/save")
    public Library saveData(@RequestBody Library library){
        return libraryService.saveInfo(library);
    }

    @GetMapping("/get/{id}")
    public Library getInfo(@PathVariable int id){
        return  libraryService.getInfo(id);
    }

    @PutMapping("/update")
    public Library updateInfo(@RequestBody Library library){
        return  libraryService.updateInfo(library);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteInfo(@PathVariable int id){
        libraryService.deleteInfo(id);
    }

    @GetMapping("/getAll")
    public List<Library> getAllInfo(){
        return libraryService.getAllInfo();
    }
}
