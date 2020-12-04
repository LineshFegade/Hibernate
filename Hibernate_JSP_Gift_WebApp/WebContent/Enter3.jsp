<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Gifts</title>
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
<form action="Save.jsp">
<center>
<br>
<marquee style="color: pink;  font-size: 75;"><p><h1><i>WELCOME TO GIFTS SHOPS</i></h1></p></marquee>
<br><br><br><br>
<label style="color: rgb(121,6,4);"><h1>Gift Id</h1></label>
<input type="text" placeholder="Enter gift ID" name="gid">

<label style="color: rgb(121,6,4);"><h1>Gift Name</h1></label>
<input type="text" placeholder="Enter Gift name" name="gname">

<label style="color: rgb(121,6,4);"><h1>Gift Category</h1></label>
<input type="text" placeholder="Enter gift category" name="gcategory">

<label style="color: rgb(121,6,4);"><h1>Gift Price</h1></label>
<input type="text" placeholder="Enter gift price" name="gprice">

<br><br>
<button type="submit" name="btnsave" style="color: rgb(0,51,102);"><h2>Save</h2></button>
</center>

</form>
</body>
</html>