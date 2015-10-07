<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Curso Hibernate</title>
    </head>
    <body>
        <h1>Curso Hibernate!</h1>
        
        <% for(model.Usuario usuario : controller.Controller.findAllUsuarios())
        {
            out.print(usuario.toString());
        }
        %>
    </body>
</html>
