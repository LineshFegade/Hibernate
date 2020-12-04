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
<title>Insert title here</title>
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
<center>
<form>
<marquee style="color:blue; font-size: 35;"><p><h2><i>WELCOME TO GIFTS SHOPS</i></h2></p></marquee>
<br><br><br><br><br><br><br>
<%
int gid=Integer.parseInt(request.getParameter("gid"));
String gname=request.getParameter("gname");
String gcategory=request.getParameter("gcategory");
int gprice=Integer.parseInt(request.getParameter("gprice"));

SessionFactory factory=HibernateUtil.obtainSessionFactory();
Session ses=factory.getCurrentSession();
Transaction txn=(Transaction)ses.beginTransaction();

	Gifts gs=new Gifts();
	gs.setGiftId(gid);
	gs.setGiftName(gname);
	gs.setCategory(gcategory);
	gs.setPrice(gprice);
	ses.save(gs);
%>
<h1 style="color: rgb(0,51,102)"><b><i>Data Save Successfully... </i></b></h1>
<%
txn.commit();
%>
</form>
</center>

</body>
</html>