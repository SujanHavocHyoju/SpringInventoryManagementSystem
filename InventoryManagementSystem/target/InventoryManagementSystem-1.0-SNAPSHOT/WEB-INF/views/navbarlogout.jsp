</head>
<body style=" height: border-box; background-image:url('${SITE_URL}/static/logo/body.jpg');  background-repeat: no-repeat; background-size: cover;>
<nav class="navbar navbar-default">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
        <a class="navbar-brand" href="${SITE_URL}/admin" title="Home"><img alt="Inventory" width="100" height="20" src="${SITE_URL}/static/logo/InvLogo.png"></a>
    </div>

    <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
      <ul class="nav navbar-nav">
        <li><a href="${SITE_URL}/admin/product">Products</a></li>
        <li><a href="${SITE_URL}/admin/sales">Sales</a></li>
        <li><a href="${SITE_URL}/admin/purchase">Purchase</a></li>
        <li><a href="${SITE_URL}/admin/supplier">Supplier</a></li>
        <li><a href="${SITE_URL}/admin/category">Categories</a></li>
        <li class="dropdown">
          <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Returns <span class="caret"></span></a>
          <ul class="dropdown-menu">
            <li><a href="${SITE_URL}/admin/salesreturn">Sales Return</a></li>
            <li><a href="${SITE_URL}/admin/purchasereturn">Purchase Return</a></li>
          </ul>
        </li>
      </ul>
      <form class="navbar-form navbar-right">
          <a href="${SITE_URL}/logout" title="Logout from system" class="btn btn-danger btn-sm">Logout</a>
          <a href="${SITE_URL}/register" title="Register New Account"class="btn btn-info btn-sm">Register</a>
      </form>

    </div>
  </div>
</nav>