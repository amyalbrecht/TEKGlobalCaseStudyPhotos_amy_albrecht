<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
  <html>

  <head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register</title>

    <!-- BOOTSTRAP 5.0.0-beta3 EXTERNAL LINKS -->


    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
      integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
      crossorigin="anonymous"></script>

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

    <!-- Custom styles for this template -->
    <link rel="stylesheet" type="text/css" href="../css/main.css">

    <!-- /BOOTSTRAP 5.0.0-beta3 EXTERNAL LINKS -->

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }

      .bg-orange {
        background-color: #ed7d3e !important;
        text-align: left;

      }

      .bg-blue {
        background-color: #6486c4;
        text-align: center;
      }

      .navBreadCrumbs {
        text-align: center;
        display: inline-flex;
      }

      .indexFlexBox {
        display: flex;
      }

      .indexGoTo {
        margin: 10%;
        padding: 5%; 
        background-color: #ed7d3e;
      }
    </style>



  </head>

  <body class="bg-blue">

    <main>
      <nav class="navbar navbar-dark bg-orange" aria-label="First navbar example">
        <div class="container-fluid bg-orange">
          <a class="navbar-brand" href="#">Max's Photos</a>
          <div>
            <a href="#">Not (User)?</a> | <a href="#">Login</a> | <a href="#">Register</a>
          </div>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarsExample01"
            aria-controls="navbarsExample01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>

          <div class="collapse navbar-collapse" id="navbarsExample01">
            <ul class="navbar-nav me-auto mb-2">
              <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="#">Home</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">About</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Albums</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="#">Add Photo</a>
              </li>
            </ul>
          </div>
        </div>
      </nav>

      <div>
          
        <p><h2>Register</h2></p>
        
        <form method="POST">
            <input type="text" name="firstName" placeholder="First Name"><br><br>
            <input type="text" name="lastName" placeholder="Last Name"><br><br>
            <input type="email" name="email" placeholder="Email Address"><br><br>
            <input type="password" name="password" placeholder="Password"><br><br>
            <input type="submit"  name="register" value="Register">
        </form>
        
    </div>


</main>


</body>

</html>