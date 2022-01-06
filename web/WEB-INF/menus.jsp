<%-- 
    Document   : menus
    Created on : 5 janv. 2022, 16:03:07
    Author     : dsi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="CSS/style.css">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
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
        <ul class="nav purple-gradient py-4 mb-4 mb-md-0 font-weight-bold z-depth-1 nav-fill w-100">
            <li class="nav-item">
                <a class="nav-link active white-text" href="#!">Home</a>
            </li>
            <li class="nav-item">
                <a class="nav-link white-text" href="#!">Mémo privé</a>
            </li>
            <li class="nav-item">
                 <a class="nav-link white-text" href="#!">Mémo public</a>
            </li>
            <li class="nav-item">
                 <a class="nav-link white-text" href="logout" style="color: #cc0000 !important"> 
                     <i class="fas fa-power-off"></i> Déconnexion
                 </a>
            </li>
            
        </ul> 
    </body>
</html>
