/*
 * @author Rully Andhika a.k.a jarul
 * Copyleft 2015
 */
package com.rulrul.spring4hibernate4.dao;

import java.util.List;

import com.rulrul.spring4hibernate4.model.Freelancer;

public interface FreelancerDao {
	
	void insert(Freelancer freelancer);
	
	void update(Freelancer freelancer);
	
	void delete(Long id);
	
	List<Freelancer> getAll();
	
	Freelancer findById(Long id);

}
