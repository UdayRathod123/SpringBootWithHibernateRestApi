package com.BikkadIT.Service;

import java.util.List;

import com.BikkadIT.model.Employee;

public interface Servicei {

	public int saveEmployeeData(Employee employee);

	public List<Employee> getAllUsersService();

	public Employee loginCheck(Employee employee);

	public Employee editUser(int uid);

	public Employee update(Employee employee);

	public Employee delete(int employee);
}
