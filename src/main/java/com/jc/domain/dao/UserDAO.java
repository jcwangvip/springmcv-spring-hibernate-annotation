package com.jc.domain.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.jc.domain.pojo.User;

public class UserDAO extends HibernateDaoSupport{
	
	@SuppressWarnings("unchecked")
	public User login(final String usercode,final String userpswd) throws Exception{
		return (User)this.getHibernateTemplate().execute(new HibernateCallback(){

			public Object doInHibernate(Session session)
					throws HibernateException {
				return session.createCriteria(User.class)
							.add(Restrictions.eq("usercode", usercode))
							.uniqueResult();
			}
		});
		
	}
}
