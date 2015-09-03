/*
 * @author Rully Andhika a.k.a jarul
 * Copyleft 2015
 */
package com.rulrul.spring4hibernate4.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rulrul.spring4hibernate4.dao.FreelancerDao;
import com.rulrul.spring4hibernate4.model.Freelancer;
import com.rulrul.spring4hibernate4.services.FreelancerService;

@Service("freelancerService")
@Transactional
public class FreelancerServiceImpl implements FreelancerService {
	
	@Autowired
	private FreelancerDao dao;

	public void insertFreelancer(Freelancer freelancer) {
		dao.insert(freelancer);
	}

	public void updateFreelancer(Freelancer freelancer) {
		dao.update(freelancer);
	}

	public void deleteFreelancer(Long id) {
		dao.delete(id);
	}

	public List<Freelancer> getAllFreelancer() {
		return dao.getAll();
	}

	public Freelancer findFreelancerById(Long id) {
		return dao.findById(id);
	}

}
