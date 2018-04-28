<%-- 
    Document   : Eventos
    Created on : 27/04/2018, 21:51:44
    Author     : ice
--%>

<%@page import="java.util.List"%>
<%@page import="br.ufjf.dcc192.Evento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Eventos Cadastrados na Comunidade!</h1>

        <table border = 1  >
            <th>Nome</th>
            <th>Duração</th>
            <th>Limite de Pessoas</th>                    
            <tr>                    
                <%                    
                    for (Evento evento : (List<Evento>) request.getAttribute("evento")) {
                %>   
                <td><%=evento.getNome()%></td>
                <td><%=evento.getNumSemanas()%></td>
                <td><%=evento.getLimite()%></td>                                
            </tr>
            <%
                }
            %>            
        </table>
          <a href="ServletControle.html">Voltar</a>       
    </body>
</html>
