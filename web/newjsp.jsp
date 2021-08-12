<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->
        <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="Css/Mystyle.css" rel="stylesheet" type="text/css"/>
        <link href="../src/java/css/newcss.css" rel="stylesheet" type="text/css"/>
        <script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
        crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl" crossorigin="anonymous">
        <style>
            .pagination {

                margin-left: 500px;
            }

            .pagination a {
                color: white;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
                background-color: black;

            }
        </style>
    </head>
    <body style="background-color:#17a2b8" >
        <!--begin of menu-->
        <header>
            <nav id="navbar_top" class="navbar navbar-expand-lg navbar-dark bg-primary">
                <div class="container">
                    <a class="navbar-brand" href="#">Quầy thuốc Tuấn Anh</a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#main_nav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse" id="main_nav">	
                        <ul class="navbar-nav ml-auto">
                            <li class="nav-item"><a class="nav-link" href="Login.jsp"> Đăng nhập </a></li>

                            <li class="nav-item"><a class="nav-link" href="#"> Thống kê </a></li>
                        </ul>
                    </div> <!-- navbar-collapse.// -->
                    <form action="searchP" method="Post" >
                        <input  type="text" placeholder="Bạn tìm kiếm gì" aria-label="Search" name="find">
                        <button type="submit">Search</button>
                    </form>

                </div> <!-- container.// -->
            </nav>
            <nav id="navbar_top" class="navbar navbar-expand-lg navbar-dark bg-dark">
                <div class="container">
                    <a class="navbar-brand" href="list">Trang chủ</a>
                    <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#main_nav" aria-expanded="false">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="navbar-collapse collapse" id="main_nav" style="">
                        <ul class="navbar-nav">


                            <li class="nav-item dropdown">
                                <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false">Bệnh thường gặp </a>
                                <ul class="dropdown-menu">
                                    <c:forEach items ="${listS}" var="o">
                                        <li><a class="dropdown-item" href="#">${o.name}</a></li>
                                        </c:forEach>

                                </ul>

                            </li>
                            <li class="nav-item dropdown">
                                <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false">Thuốc </a>
                                <ul class="dropdown-menu">
                                    <c:forEach items ="${listC}" var="o">
                                        <li><a class="dropdown-item" href="#">${o.name}</a></li>
                                        </c:forEach>

                                </ul>

                            </li>
                        </ul>

                    </div> <!-- navbar-collapse.// -->
                </div>

            </nav>
            <br>
            <br>
            <!--            <div class="container">
                        
                            <div class="col-sm-2">
                                <div class="card bg-light mb-3">
                                    <div class="card-header bg-primary text-white text-uppercase"><i class="fa fa-list"></i> Categories</div>
            
                                    <li class="nav-item dropdown" style="border-style: none none solid none">
                                        <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false"> Dropdown right </a>
                                        <ul class="dropdown-menu dropdown-menu-right">
                                            <li><a class="dropdown-item" href="#"> Submenu item 1</a></li>
                                            <li><a class="dropdown-item" href="#"> Submenu item 2 </a></li>
                                        </ul>
                                    </li>
                                    <li class="nav-item dropdown" style="border-style: none none solid none">
                                        <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false"> Dropdown right </a>
                                        <ul class="dropdown-menu dropdown-menu-right">
                                            <li><a class="dropdown-item" href="#"> Submenu item 1</a></li>
                                            <li><a class="dropdown-item" href="#"> Submenu item 2 </a></li>
                                        </ul>
                                    </li>
            
                                </div>
                            </div>
                          
                        </div>-->

        </header>
        <!--end of menu-->

        <div class="container" style="background-color: buttonface">
            <div class="row">


                <div class="col-sm-12">
                    <form action="adds" method="Post" >

                         Ngày nhập:   <input type="Date" name="Date" id="last_name" class="form-control input-sm" style="width: 200px" >


                        <table class="table table-bordered border-dark">
                            <thead>
                                <tr>
                                    <th>Tên Sản phẩm</th>
                                   
                                    <th>Giá gốc</th>
                                    <th>Giá nhập</th>
                                    <th>Số lượng</th>
                                    <th>Mô tả sản phẩm</th>
                                    <th>Xuất sứ</th>
                                    <th>Hình ảnh</th>
                                    <th>Thể loại</th>
                                    
                                    

                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${import}" var="o">
                                    <tr>
                                        <th scope="row">${o.id}</th>
                                        <th>${o.date}</th>
                                        <th>${o.iprice}</th>
                                        <th>${o.productid}</th>
                                        <th>${o.staffid}</th>

                                    </tr>

                                </c:forEach>
                                <tr>
                                    <th scope="row">  <input type="text" name="Name" id="first_name" class="form-control input-sm" ></th>
                                    
                                    <th scope="row">  <input type="text" name="OPrice" id="email" class="form-control input-sm" ></th>
                                    <th scope="row">  <input type="text" name="IPrice" id="email" class="form-control input-sm" ></th>
                                    <th scope="row">  <input type="text" name="amount" id="email" class="form-control input-sm" ></th>
                                    <th scope="row">  <input type="text" name="Desc" id="email" class="form-control input-sm" ></th>
                                    <th scope="row">  <input type="text" name="Origin" id="email" class="form-control input-sm" ></th>
                                    <th scope="row">  <input type="text" name="Image" id="email" class="form-control input-sm" ></th>
                            <th><select name="select" class="form-select" aria-label="Default select example" style="width: 250px">
                                <option selected>Chọn thể loại</option>
                                <c:forEach items ="${listC}" var="o">
                                    <option value="${o.id}">${o.name}</option>
                                </c:forEach></th>


                            </select>
                            </tr>
                            </tbody>
                        </table>
                        <button type="submit">Thêm </button>
                    </form>

                    <br>
                    <br>
                    <br>

                </div>


            </div>




        </div>
        <div class="clearfix">

            <ul class="pagination">
                <c:if test="${tag>1}">
                    <li class="page-item disabled"><a href="list?index=${tag-1}">Previous</a></li>
                    </c:if>
                    <c:forEach begin="1" end="${endP}" var="i">
                    <li class="page-item ${tag==i?"active":""}"><a href="list?index=${i}" class="page-link">${i}</a></li>
                    </c:forEach>
                    <c:if test="${tag<endP}">
                    <li class="page-item"><a href="list?index=${tag+1}" class="page-link">Next</a></li>
                    </c:if>
            </ul>
        </div>



    </body>
</html>

