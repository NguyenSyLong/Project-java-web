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
                display: inline-block;
                margin-left: 400px;
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
    <body>
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
                            <a class="btn btn-success btn-sm ml-3" href="print">
                                <i class="fa fa-ambulance"></i> Kê đơn
                                <span class="badge badge-danger">${count}</span>
                            </a>
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
                    <a class="navbar-brand" href="#">Brand</a>
                    <button class="navbar-toggler collapsed" type="button" data-toggle="collapse" data-target="#main_nav" aria-expanded="false">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="navbar-collapse collapse" id="main_nav" style="">
                        <ul class="navbar-nav">
                            <li class="nav-item active"> <a class="nav-link" href="#">Tư vấn thuốc </a> </li>
                            <li class="nav-item"><a class="nav-link" href="#"> About </a></li>
                            <li class="nav-item"><a class="nav-link" href="#"> Services </a></li>
                            <li class="nav-item dropdown">
                                <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false">Bệnh thường gặp </a>
                                <ul class="dropdown-menu">
                                    <c:forEach items ="${listS}" var="o">
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
        <div class="container">
            <div class="row">
                <div class="col">
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="managebook.jsp">Trang chủ</a></li>

                            <li class="breadcrumb-item"><a href="list">Sản phẩm</a></li>



                        </ol>
                    </nav>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-sm-3">
                    <div class="card bg-light mb-1">
                        <div class="card-header bg-while text-dark text-uppercase"><i class="fa fa-list"></i> Categories</div>
                        <ul class="list-group category_block">
                            <c:forEach items="${listC}" var="o">
                                <li class="nav-item dropdown" style="border-style: none none solid none">
                                    <a class="nav-link  dropdown-toggle" href="#" data-toggle="dropdown" aria-expanded="false"> ${o.name} </a>
                                    <ul class="dropdown-menu dropdown-menu-right">
                                        <c:forEach items= "${listS}" var="d">
                                            <li><a class="dropdown-item" href="#"> ${d.name} </a></li>
                                            </c:forEach>  
                                    </ul>
                                </li>
                            </c:forEach>

                        </ul>
                    </div>

                </div>

                <div class="col-sm-9">
                    <div class="row">
                        <c:forEach items="${listP}" var="o">
                            <div class="col-12 col-md-6 col-lg-4">
                                <div class="card">
                                    <img class="card-img-top" src="${o.image}" alt="Card image cap">
                                    <div class="card-body">
                                        <h4 class="card-title show_txt"><a href="#" title="View Product">${o.name}</a></h4>
                                        <p class="card-text show_txt">${o.descript}</p>
                                        <div class="row">
                                            <div class="col">
                                                <p class="btn btn-primary btn-block">${o.price} Đồng</p>
                                            </div>


                                            <div class="col">
                                                <a href="prescrip?id=${o.id}" class="btn btn-secondary btn-block">Thêm vào kê đơn</a>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                    <br>
                    <br>
                    <br>

                </div>


            </div>
            <div class="pagination">
                <c:forEach begin="1" end="${endP}" var="i">
                    <a href="list?index=${i}">${i}</a>
                </c:forEach>
            </div>

        </div>




    </body>
</html>

