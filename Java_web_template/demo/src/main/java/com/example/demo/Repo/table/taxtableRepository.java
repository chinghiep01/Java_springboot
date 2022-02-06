package com.example.demo.Repo.table;

 

import com.example.demo.Entity.table.Tax;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface taxtableRepository extends JpaRepository<Tax ,Integer> {

}

 
