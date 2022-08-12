package com.BikkadIT.Repositroy;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.BikkadIT.model.Employee;

public class EmployeeDaoImpl implements EmployeeDaoI{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int saveEmployeeData(Employee employee) {
		Session session = sf.openSession();
		session.beginTransaction();
		 int  id = (int) session.save(employee.getUid());
		session.getTransaction().commit();
		
		return id;
	}

	@Override
	public List<Employee> getAllUsersService() {
		Session session = sf.openSession();
		session.beginTransaction();
		String hql="from Employee ";
		Query query = session.createQuery(hql);
		List list = query.list();
		return list;
	}

	@Override
	public Employee loginCheck(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee editUser(int uid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee delete(int employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
