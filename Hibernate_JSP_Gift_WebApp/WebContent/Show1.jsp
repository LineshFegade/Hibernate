<%@page import="org.hibernate.service.ServiceRegistry"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="com.hibernate.model.Gifts"%>
<%@page import="java.util.*"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>
<%@page import="org.hibernate.*"%>
<%@page import="com.hibernate.util.HibernateUtil" %>
<%@page import=" org.hibernate.criterion.Projection"%>
<%@page import= " org.hibernate.criterion.Projections"%>
<%@page import= "org.hibernate.criterion.Restrictions "%>
<%@page  import=" org.hibernate.service.ServiceRegistry"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Gifts</title>
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
<marquee style="color:pink; font-size: 75;"><p><h1><i>WELCOME TO GIFTS SHOPS</i></h1></p></marquee>
<br><br><br><br><br><br><br>
<table  ALIGN='center' BORDER=1 CELLPADDING=15 CELLSPACING=0 WIDTH=100%  style="background-color:aqua;"><th>Gift ID</th><th>Gift Name</th><th>Category</th><th>Gift Price</th>
<%

int mn=Integer.parseInt(request.getParameter("min"));
int mx=Integer.parseInt(request.getParameter("max"));

SessionFactory factory=HibernateUtil.obtainSessionFactory();
Session ses=factory.getCurrentSession();
Transaction txn=(Transaction)ses.beginTransaction();

/* Criteria c=ses.createCriteria(Gifts.class);
Projection prj=Projections.property("price");		
c.setProjection(prj);

c.add(Restrictions.between("price",mn,mx)); */

Query que=ses.createQuery("from Gifts g where g.price between ? and ?");
que.setParameter(0, mn);
que.setParameter(1, mx);
List<Gifts> lst=que.list();
Iterator<Gifts> itr=lst.iterator();
while(itr.hasNext()){
	Gifts g=itr.next();
%>
<tr>
<td><%=g.getGiftId() %></td>
<td><%=g.getGiftName() %></td>
<td><%=g.getCategory() %></td>
<td><%=g.getPrice() %></td>
</tr>
<%}
txn.commit();
%>
</table>
</form>
</center>

</body>
</html>