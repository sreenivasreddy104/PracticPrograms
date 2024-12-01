package core.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	int eid;
	String ename;
	double salary;
	String dept;

	public Employee(int eid, String ename, int salary, String dept) {
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dept=" + dept + "]";
	}

}

public class FindSecondHighestSalaryFromDepartment {
	public static void main(String[] args) {
		ArrayList<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee(1, "sree", 10000, "IT"));
		arrayList.add(new Employee(2, "sree", 40000, "CSC"));
		arrayList.add(new Employee(3, "sree", 20000, "IT"));
		arrayList.add(new Employee(4, "sree", 10000, "ADMIN"));
		arrayList.add(new Employee(5, "sree", 50000, "HR"));
		arrayList.add(new Employee(6, "sree", 23000, "SALES"));
		arrayList.add(new Employee(7, "sree", 30000, "SALES"));
		arrayList.add(new Employee(8, "sree", 60000, "ABC"));

		Map<String, List<Employee>> collect = arrayList.stream().collect(Collectors.groupingBy(Employee::getDept));
		
		List<Employee> collect2 = collect.values().stream().flatMap(
				deptEmp -> deptEmp.stream().sorted(
						Comparator.comparingDouble(Employee::getSalary).reversed()))
		.distinct().skip(1).limit(1).collect(Collectors.toList());
		
		System.out.println(collect2);
	}

}
