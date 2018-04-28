<%-- 
    Document   : SolicitarHospedagem
    Created on : 27/04/2018, 22:07:05
    Author     : ice
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <h1>Cadastro no evento</h1>
        <form method="post">
            <label for="email">Nome do evento</label>
            <input type="text" name="nomeEvento"><br>
            <label for="pwd">Nome do inscrito</label>
            <input type="text"name="nomeInscrito"><br>
            <label for="pwd">Tipo de inscrito</label>
            <input type="text"name="tipo"><br>
            <label for="pwd">Tempo em semanas</label>
            <input type="text"name="tempo">

            <button type="submit" >Salvar</button>
            <button type="reset" >Limpar</button>
        </form>        
        <a href="ServletControle.html">Voltar</a>   
    </body>
</html>
