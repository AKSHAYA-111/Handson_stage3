package com.cognizant.LearnTodayRESTAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.LearnTodayRESTAPI.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
