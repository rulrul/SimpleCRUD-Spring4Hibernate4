/*
 * @author Rully Andhika a.k.a jarul
 * Copyleft 2015
 */
package com.rulrul.spring4hibernate4.services;

import java.util.List;

import com.rulrul.spring4hibernate4.model.Freelancer;

public interface FreelancerService {
	
	void insertFreelancer(Freelancer freelancer);
	
	void updateFreelancer(Freelancer freelancer);
	
	void deleteFreelancer(Long id);
	
	List<Freelancer> getAllFreelancer();
	
	Freelancer findFreelancerById(Long id);

}
