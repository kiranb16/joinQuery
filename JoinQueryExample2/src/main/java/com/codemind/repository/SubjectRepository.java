package com.codemind.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codemind.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}
