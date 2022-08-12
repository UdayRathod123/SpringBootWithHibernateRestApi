package com.BikkadIT.Repositroy;

import java.util.List;

import com.BikkadIT.model.Employee;

public interface EmployeeDaoI {
	public int saveEmployeeData(Employee employee);

	public List<Employee> getAllUsersService();

	public Employee loginCheck(Employee employee);

	public Employee editUser(int uid);

	public Employee update(Employee employee);

	public Employee delete(int employee);
	
}
