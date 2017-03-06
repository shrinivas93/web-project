package com.foo.bar.api;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foo.bar.entity.Employee;
import com.foo.bar.service.EmployeeService;
import com.foo.bar.util.UtilHelper;

@Component
@Path("employee")
public class EmployeeApi extends UtilHelper {

	@Autowired
	private EmployeeService employeeService;

	@Path("")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		return responseUtil.getSuccessResponse(employees, "List of all employees", 200);
	}
}
