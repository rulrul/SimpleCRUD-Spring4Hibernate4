/*
 * @author Rully Andhika a.k.a jarul
 * Copyleft 2015
 */
package com.rulrul.spring4hibernate4.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.rulrul.spring4hibernate4.dao.FreelancerDao;
import com.rulrul.spring4hibernate4.dao.common.DaoTemplate;
import com.rulrul.spring4hibernate4.model.Freelancer;

@Repository("freelancerDao")
public class FreelancerDaoImpl extends DaoTemplate implements FreelancerDao {

	public void insert(Freelancer freelancer) {
		persist(freelancer);
	}

	public void update(Freelancer freelancer) {
		getSession().update(freelancer);
	}

	public void delete(Long id) {
		Query query = getSession().createQuery("delete from Freelancer where id = :id");
		query.setLong("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Freelancer> getAll() {
		Criteria criteria = getSession().createCriteria(Freelancer.class);
		return criteria.list();
	}

	public Freelancer findById(Long id) {
		Criteria criteria = getSession().createCriteria(Freelancer.class);
		criteria.add(Restrictions.eq("id", id));
		return (Freelancer) criteria.uniqueResult();
	}

}
