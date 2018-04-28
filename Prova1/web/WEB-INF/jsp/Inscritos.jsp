<%-- 
    Document   : Eventos
    Created on : 27/04/2018, 21:51:44
    Author     : ice
--%>

<%@page import="br.ufjf.dcc192.Pessoa"%>
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
            <th>Tipo</th>
            <th>Tempo de estadia</th>                    
            <tr>                    
                <%
                    int i=0;
                    for (Pessoa pessoa : (List<Pessoa>) request.getAttribute("inscritos")) {
                %>   
                <td><%=pessoa.getNome()%></td>
                <td><%=pessoa.getTipo()%></td>
                <td><%=pessoa.getTempo()%></td>                                                                                                                
            </tr>
            <%
                i++;
                }
            %>   
            <tr>
                <td>Numero de pessoas cadastradas:</td>
                <td colspan="2"><%=i%></td>
            </tr>
        </table>
        <a href="ServletControle.html">Voltar</a>       
    </body>
</html>
