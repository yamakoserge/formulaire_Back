package com.gsoftcode.formonlines.repository;


import jdk.jfr.Description;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormRepository extends JpaRepository<Description, Long> {

}
