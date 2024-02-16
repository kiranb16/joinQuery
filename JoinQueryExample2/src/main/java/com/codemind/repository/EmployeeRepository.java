package com.codemind.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.codemind.dto.EmployeeRequest;
import com.codemind.dto.EmployeeRequest2;
import com.codemind.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

    @Query(" select new com.codemind.dto.EmployeeRequest( e.emp_name,a.road) from employee e left join e.address a ")
	public List<EmployeeRequest> getNamesaAndCity();
    
    @Query("select new com.codemind.dto.EmployeeRequest2( e.emp_salary,e.emp_name,a.city) from employee e join e.address a")
    public List<EmployeeRequest2> getInformation();
}

//@Query("select new com.codemind.dto.OrderRquest( s.name,sub.s_name) FROM student s JOIN s.subject sub")
//address

