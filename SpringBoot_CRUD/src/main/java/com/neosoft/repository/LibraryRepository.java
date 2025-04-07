package com.neosoft.repository;

import com.neosoft.entities.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Integer> {

    public Library findById(int id);

    public Library deleteById(int id);

}
