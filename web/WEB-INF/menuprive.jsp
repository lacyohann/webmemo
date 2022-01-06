<%--
    Document   : menuprive
    Created on : 6 janv. 2022, 15:32:13
    Author     : dsi
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page Privée</title>
       
    </head>
    <body>
        <%@include file="menus.jsp" %>
        
        <div class="container">
            
            <h1>Bienvenue ${user.login} !</h1>
            <p>${msg} ${user.prenom} ${user.nom}.</p>
            
            <div>
                <table class="table">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Contenu</th>
                            <th>Créateur</th>
                            <th>Date de création</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items="${memos}" var="p">    
                            <tr>
                                <td>${p.id}</td>
                                <td>${p.contenu}</td>
                                <td>${p.createur.prenom} ${p.createur.nom}</td>
                                <td>${p.dateCreation}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>