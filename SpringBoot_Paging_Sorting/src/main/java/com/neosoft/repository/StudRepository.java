package com.neosoft.repository;

import com.neosoft.entities.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudRepository extends PagingAndSortingRepository<Student, Integer> {
}
