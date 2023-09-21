<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.ArrayList ,com.models.Employee"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>EmployeeList</h1>

		<table>
			<tr>
				<th>EmpNum</th>
				<th>DepartmentNo</th>
				<th>EmpName</th>
				<th>EmpJob</th>
				<th>EmpSal</th>
			</tr>
			<tbody>
				<%
				ArrayList<Employee> emplist =( ArrayList<Employee>)request.getAttribute("EmployeeList");
				for (Employee e : emplist) {
				%>
				<tr>
					<td><%=e.getEmpNo()%></td>
					<td><%=e.getDeptNo()%></td>
					<td><%=e.getEName()%></td>
					<td><%=e.getJob()%></td>
					<td><%=e.getSalary()%></td>
				</tr>
				<%
				}
				%>

			</tbody>
		</table>
	</center>
</body>
</html>