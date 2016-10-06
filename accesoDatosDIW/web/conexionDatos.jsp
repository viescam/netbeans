<%-- 
    Document   : conexionDatos
    Created on : 06-oct-2016, 13:06:50
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<%
    Connection con;
    PreparedStatement st;
    
    Class.forName("com.mysql.jdbc.Driver");
    String urlBBDD = "jdbc:mysql://localhost:3306/spacex";
    con = (java.sql.DriverManager.getConnection(urlBBDD,"root",""));
    System.out.println("Conexion Realizada");
    
    st=con.prepareStatement("SELECT * FROM cohetes");
    ResultSet rs = st.executeQuery();
    String nombre=rs.getString("nombre");
    String id=rs.getString("idCohete");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
