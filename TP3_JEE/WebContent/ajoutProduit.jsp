<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Insert title here</title>
</head>
<body>
  <form action="ajoutControleur" method="post">
    <label>Nom Produit :</label>
    <input type="text"  name="nom" >
    </br>
    <label>Prix Produit :</label>
    <input type="text"  name="prix" >
     </br>
    <input type="submit"  value="OK">
  </form>
  
</body>
</html>