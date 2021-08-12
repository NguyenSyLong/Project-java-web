<%-- 
    Document   : Login
    Created on : Mar 18, 2021, 8:10:36 AM
    Author     : Lehait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <link href="css/newcss.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <script>
            function myFunction() {
                {
               var user = document.getElementById("username").value;
               var password = document.getElementById("password").value;
               if(user.length == 0 )
               {
                   alert('Username cannot be blank!');
                   return;
               }else if( password.length == 0){
                   alert('Password cannot be blank!');
                   return;
               }
               document.getElementById("frmAdd").submit();
            }
            }
        </script>
        <div id="login">
            <h3 class="text-center text-white pt-5">Login form</h3>
            <div class="container">
                
                <div id="login-row" class="row justify-content-center align-items-center">
                    
                    <div id="login-column" class="col-md-6">
                       
                        <div id="login-box" class="col-md-12">
                            
                            <form id="login-form" class="form" action="login" method="post">
                                
                                <h6 class="text-danger">${mess}</h6> 
                                <div class="form-group">
                                    <label for="username" class="text-info">Username:</label><br>
                                    <input type="text" name="username" id="username" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="password" class="text-info">Password:</label><br>
                                    <input type="text" name="password" id="password" class="form-control">
                                </div>
                                <div class="form-group">
                                    <label for="remember-me" class="text-info"><span>Remember me</span> <span><input id="remember-me" name="remember-me" type="checkbox"></span></label><br>
                                    <input type="submit" name="submit" class="btn btn-info btn-md" value="submit" onclick="myFunction()" >
                                    
                                </div>
                                <div id="register-link" class="text-right">
                                    <a href="Register.jsp" class="text-info">Register here</a>
                                </div>
                                
                            </form>
                            
                        </div>
                        
                    </div>
                </div>
                        
            </div>
    </body>
</html>
