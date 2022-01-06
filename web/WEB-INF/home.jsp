<%-- 
    Document   : home
    Created on : 5 janv. 2022, 11:01:31
    Author     : dsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page d'accueil</title>
       
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
                        <c:forEach items="${memos}" var="m">    
                            <tr>
                                <td>${m.id}</td>
                                <td>${m.contenu}</td>
                                <td>${m.createur.prenom} ${m.createur.nom}</td>
                                <td>${m.dateCreation}</td>
                                    <c:if test="${m.before_update != 0}">
                                        <form action="" method="POST">
                                            <td><button type="button" class="btn btn-link"><i class="fas fa-guitar"></i></button></td>
                                        </form>
                                    </c:if>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </body>
</html>
