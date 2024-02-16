 package com.codemind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codemind.dto.OrderRquest;
import com.codemind.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

 // public  Student save(OrderResponce orderResponce);
	
	@Query("select new com.codemind.dto.OrderRquest( s.name,sub.s_name) FROM student s JOIN s.subject sub")
	public List< OrderRquest> getInforamation();

	//public List<Student> findAll(String string);

}
