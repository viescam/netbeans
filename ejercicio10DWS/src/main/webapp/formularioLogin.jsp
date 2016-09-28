<%-- 
    Document   : formularioLogin
    Created on : 28-sep-2016, 20:03:20
    Author     : Vicente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="login" scope="request" class="usuario.Datos" />

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <body>
        <% if((request.getParameter("usuario")==null || request.getParameter("pswd")==null) || 
               (request.getParameter("usuario")=="" || request.getParameter("pswd")==""))  { %>
            <form name="login" action="formularioLogin.jsp" method="POST">
                <h1>Formulario de login de usuarios</h1>
                Nombre de usuario*:<input type="text" name="usuario" value="" size="20" /><br>
                Clave de acceso*:<input type="password" name="pswd" value="" size="20" /><br>
                Recordar datos de acceso:<input type="checkbox" name="recordarDatos" value="si"><br>
                Los campos marcados con asterisco deben rellenarse de forma obligatoria<br>
                <input type="submit" value="Enviar Consulta" />&nbsp<input type="reset" value="Restablecer" />
            </form>
        <% }else{ %>
            <% String nombreUsuario, claveAcceso;
                nombreUsuario=request.getParameter("usuario");
                claveAcceso=request.getParameter("pswd");
            %>
                <jsp:setProperty name="login" property="nombreUsuario" value="<%= nombreUsuario%>"/>
                <jsp:setProperty name="login" property="claveAcceso" value="<%= claveAcceso%>"/>
                <jsp:forward page="/bienvenida.jsp"></jsp:forward>
       <% } %>
    </body>
    
</html>
