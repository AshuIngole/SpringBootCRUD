package com.SpringBootCrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.SpringBootCrud.bean.Subject;

public interface SubjectRepository extends JpaRepository<Subject,String> {

	/*
	 * public void save(Subject subject) {
	 * 
	 * 
	 * }
	 * 
	 * public Iterable<Subject> findAll() {
	 * 
	 * return null; }
	 * 
	 * public void deleteById(String id) { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
