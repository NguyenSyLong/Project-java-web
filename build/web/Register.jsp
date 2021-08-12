<%-- 
    Document   : Register.jsp
    Created on : Mar 20, 2021, 5:37:37 PM
    Author     : Lehait
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    </head>
    <body style="background-color: #17a2b8">
        <div class="container" style="margin-top: 150px">
            <div class="row centered-form">
                <div class="col-xs-12 col-sm-8 col-md-4 col-sm-offset-2 col-md-offset-4">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3 class="panel-title">Please sign up for Login <small>It's free!</small></h3>
                        </div>
                        <div class="panel-body">
                            <form role="form" action="register" method="post">
                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                           Name <input type="text" name="Name" id="first_name" class="form-control input-sm" placeholder="Name">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                           DOB <input type="Date" name="Dob" id="last_name" class="form-control input-sm" >
                                        </div>
                                    </div>
                                </div>

                                <div class="form-group">
                                    Phone <input type="text" name="Phone" id="email" class="form-control input-sm" placeholder="Phone">
                                </div>
                                <div class="form-group">
                                   Address <input type="text" name="Address" id="email" class="form-control input-sm" placeholder="Address">
                                </div>
                                <div class="form-group">
                                    <input type="radio" name="gender" value="male"/> Male
                                    <input type="radio" name="gender" value="female"/> Female
                                </div>
                                <div class="form-group">
                                   Username <input type="text" name="Username" id="email" class="form-control input-sm" placeholder="Username">
                                </div>

                                <div class="row">
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                           Password <input type="password" name="password" id="password" class="form-control input-sm" placeholder="Password">
                                        </div>
                                    </div>
                                    <div class="col-xs-6 col-sm-6 col-md-6">
                                        <div class="form-group">
                                         Confirm   <input type="password" name="password_confirmation" id="password_confirmation" class="form-control input-sm" placeholder="Confirm Password">
                                        </div>
                                    </div>
                                </div>

                                <input type="submit" value="Register" class="btn btn-info btn-block">
                                 <div id="login-link" class="text-left">
                                    <a href="Login.jsp" class="text-info">Back to login</a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
