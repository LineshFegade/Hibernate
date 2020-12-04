<%@page import="org.hibernate.service.ServiceRegistry"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="com.hibernate.model.Gifts"%>
<%@page import="java.util.*"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="org.hibernate.*"%>
<%@page import="com.hibernate.util.HibernateUtil" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Choose category</title>
<style type="text/css">
*{
margin: 0;
padding: 0;
}
body{
width: 100%;
height:100vh;
background-image: url("1509507.jpg");
background-repeat: no-repeat;
background-size:100% 100%;
}
</style>
</head>
<body>
<form action="Show2.jsp">
<center>
<br>
<marquee style="color: pink;  font-size: 75;"><p><h2><i><h1>WELCOME TO GIFTS SHOPS</h1></i></h2></p></marquee>
<br><br><br><br>
<label style="color:  rgb(0,51,102)"><h1><b><i>Select Gift Category </i></b></h1></label>
<br><br><br>
<select name="selectCategory ">
<option>---Category---</option>
<%
SessionFactory factory=HibernateUtil.obtainSessionFactory();
Session ses=factory.getCurrentSession();
Transaction txn=(Transaction)ses.beginTransaction();

Query q=ses.createQuery("select DISTINCT (g.category) from Gifts g");
	List	lst=q.list();
	Iterator itr=lst.iterator();
	while(itr.hasNext()){
		String obj=(String)itr.next();
%>
<option><%=obj%></option>
<%
}
	txn.commit();
%>
	
</select>
<br><br>
<button type="submit" name="search"><h2>Search</h2></button>
</center>
</form>
</body>
</html>