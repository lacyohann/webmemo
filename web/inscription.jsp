<%-- 
    Document   : inscription
    Created on : 5 janv. 2022, 10:12:06
    Author     : dsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Page d'inscription</title>
        <link rel="stylesheet" href="CSS/style.css">
        
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <!-- Google Fonts -->
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
        <!-- Bootstrap core CSS -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet">
        <!-- Material Design Bootstrap -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet">
        
        <!-- JQuery -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!-- Bootstrap tooltips -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js"></script>
        <!-- Bootstrap core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <!-- MDB core JavaScript -->
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"></script>
        
    </head>
    <body>
        
        <div class="mt15-perso">
            <div class="cadre-login">
                <div class="card p-3 my-shadow">
                    
                    <div class="card-header my-card-header">
                        <h4>Inscription</h4>
                    </div>

                    <div class="card-body">
                        <form action="register" method="POST">  
                            <div class="form-group">
                                <label class="grey-text">Login</label>
                                <input type="text" name="login" class="form-control">
                            </div>

                            <div class="form-group">
                                <label class="grey-text">Password</label>
                                <input type="password" name="password" class="form-control">
                            </div>

                            <div class="form-group">
                                <label class="grey-text">Nom</label>
                                <input type="text" name="nom" class="form-control">
                            </div>
                            
                            <div class="form-group">
                                <label class="grey-text">Pr??nom</label>
                                <input type="text" name="prenom" class="form-control">
                            </div>
                            <button type="submit" class="btn btn-secondary btn-block btn-sm">
                                Inscription
                            </button>

                            <button type="button" onclick="location.href='index.jsp'" class="btn btn-link btn-block btn-sm">
                                Se connecter
                            </button>
                        </form>
                        
                        <p class="text-success text-center">${msg}</p>
                    </div>
                    
                </div>
            </div>
        </div>
        
    </body>
</html>
