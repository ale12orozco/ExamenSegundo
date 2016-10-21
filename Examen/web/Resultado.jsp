<%-- 
    Document   : Resultado
    Created on : 20-oct-2016, 19:26:44
    Author     : Ale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS.css">
        <link href='https://fonts.googleapis.com/css?family=ABeeZee' rel='stylesheet' type='text/css'>

        <title>JSP Page</title>
    </head>
    <body class="fondo">
        <div class="centrado">
        
        <%
            int operacion = Integer.parseInt(request.getParameter("o"));
               if (operacion == 1){
                   int num = Integer.parseInt(request.getParameter("lado"));
                   int result = num*num;
                   out.println("<h1 class='titulo'>El Area es:</h1>");
                   out.println("<font class='texto'>"+result+"</font>");
               }
               else{
                   int num = Integer.parseInt(request.getParameter("lado"));
                   int resu = num*4;
                   out.println("<h1 class='titulo'>El Perimetro es:</h1>");
                   out.println("<font class='texto'>"+resu+"</font>");
               }
               out.println("<br><br>");
            out.println("<form  class='input' action=\"index.html\">");
            out.println("<input  class = 'submit' type=\"submit\" value=\"Regresar\" name=\"ok\">");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        %>
        </div>
    </body>
</html>
