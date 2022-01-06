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
                            </tr>
                        </c:forEach>
                            
                    <br>
                    <br>
                    
                    </tbody>
                </table>
            </div>
        </div>
        
        <br>
        <br>
        <form action="AjouterMemo" method="POST">
            
        
        <div class="modal fade" id="modalLoginForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
            aria-hidden="true">
            <div class="modal-dialog" role="document">
              <div class="modal-content">
                <div class="modal-header text-center">
                  <h4 class="modal-title w-100 font-weight-bold">Insérer texte</h4>
                  <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                  </button>
                </div>
                <div class="modal-body mx-3">
                  <div class="md-form mb-5">
                    <i class="prefix"></i>
                    <input name="nouveaumemo" type="text" >
    
                  </div>

                  

                </div>
                <div class="modal-footer d-flex justify-content-center">
                    <button type="submit" class="btn btn-default">Valider</button>
                </div>
              </div>
            </div>
          </div>

          <div class="text-center">
            <a href="" class="btn btn-default btn-rounded mb-4" data-toggle="modal" data-target="#modalLoginForm">Ajouter
                memo</a>
          </div>
          </form>
        
    </body>
</html>
