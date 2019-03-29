<%@page import="java.util.Iterator"%>
<%@page import="com.prj.web.model.Staff"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Feed</title>
</head>
<style>
* {
  box-sizing: border-box;
}

body {
  font-family: Arial, Helvetica, sans-serif;
}

/* Style the header */
header {
  background-color: #426ef4;
  padding: 30px;
  text-align: center;
  font-size: 35px;
  color: orange;
}

/* Create two columns/boxes that floats next to each other */
nav {
  float: left;
  width: 30%;
  height: 400px; /* only for demonstration, should be removed */
  background: #00ffff;
  padding: 20px;
}

/* Style the list inside the menu */
nav ul {
  list-style-type: none;
  padding: 0;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #d4f442;
  height: 400px; /* only for demonstration, should be removed */
}

/* Clear floats after the columns */
section:after {
  content: "";
  display: table;
  clear: both;
}

/* Style the footer */
footer {
  background-color: #42d7f4;
  padding: 10px;
  text-align: center;
  color: green;
}

/* Responsive layout - makes the two columns/boxes stack on top of each other instead of next to each other, on small screens */
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
.wrap {
    width: 800px;
}

.wrap table {
    width: 800px;
    table-layout: auto;
}

table tr td {
    padding: 5px;
    border: 1px solid #eee;
    width: 300px;
    word-wrap: break-word;
}

table.head tr td {
    background: #eee;
}

.inner_table {
    height: 325px;
    overflow-y: auto;
}

input[type=submit] {
  padding: 0 18px;
  height: 29px;
  font-size: 12px;
  font-weight: bold;
  color: #527881;
  text-shadow: 0 1px #e3f1f1;
  background: #cde5ef;
  border: 1px solid;
  border-color: #b4ccce #b3c0c8 #9eb9c2;
  border-radius: 16px;
  outline: 0;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  background-image: -webkit-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -moz-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -o-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: linear-gradient(to bottom, #edf5f8, #cde5ef);
  -webkit-box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
  box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
}

input[type=submit]:active {
  background: #cde5ef;
  border-color: #9eb9c2 #b3c0c8 #b4ccce;
  -webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
  box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
}

input[type=submit]:active {
  background: #cde5ef;
  border-color: #9eb9c2 #b3c0c8 #b4ccce;
  -webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
  box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
}

input[type=button] {
  padding: 0 18px;
  height: 29px;
  font-size: 12px;
  font-weight: bold;
  color: #527881;
  text-shadow: 0 1px #e3f1f1;
  background: #cde5ef;
  border: 1px solid;
  border-color: #b4ccce #b3c0c8 #9eb9c2;
  border-radius: 16px;
  outline: 0;
  -webkit-box-sizing: content-box;
  -moz-box-sizing: content-box;
  box-sizing: content-box;
  background-image: -webkit-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -moz-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: -o-linear-gradient(top, #edf5f8, #cde5ef);
  background-image: linear-gradient(to bottom, #edf5f8, #cde5ef);
  -webkit-box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
  box-shadow: inset 0 1px white, 0 1px 2px rgba(0, 0, 0, 0.15);
}

input[type=button]:active {
  background: #cde5ef;
  border-color: #9eb9c2 #b3c0c8 #b4ccce;
  -webkit-box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
  box-shadow: inset 0 0 3px rgba(0, 0, 0, 0.2);
}

</style>
<body>
<header>
  <h1>BHOJ<sup>&reg</sup></h1>
</header>

<%ArrayList<Staff> s1 = (ArrayList<Staff>)request.getAttribute("Staff");%>

<section>
  <nav>
    <ul>
      <li><form method="get" action="GetLogin"><p class="submit"><input type="submit" name="commit" value="Feed"></p></form></li>
      <li><form method="get" action="GetMonSales"><p class="submit"><input type="submit" name="commit" value="Monthly Sales"></p></form></li>
      <li><form method="get" action="GetStocks"><p class="button"><input type="submit" name="commit" value="Stocks" ></p></form></li>
      <li><form method="get" action="GetDiscounts"><p class="button"><input type="submit" name="commit" value="Discounts" ></p></form></li>
      <li><form method="get" action="http://localhost:9090/foodportal/index.jsp"><p class="button"><input type="submit" name="commit" value="Logout" ></p></form></li>
    </ul>
  </nav>
  
  <article>
    <div class="wrap">
    <table class="head">
        <tr>
            <td>Staff ID</td>
            <td>Name</td>
            <td>Mail</td>
        </tr>
    </table>
    <div class="inner_table">
    <table>
    <%
    Iterator<Staff> iter = s1.iterator();
    while(iter.hasNext())
    {
        Staff yp = iter.next();
        %>
        <tr>
            <td><%=yp.getStaffid()%></td>
            <td><%=yp.getStaffname()%></td>
            <td><%=yp.getStaffmail()%></td>
        </tr>
    <%} %>
    </table>
    </div>
</div>
    
  </article>
</section>

<footer>
  <p>All Rights Reserved.</p>
</footer>


</body>
</html>