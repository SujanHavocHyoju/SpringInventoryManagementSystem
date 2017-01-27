<%@include file="header.jsp" %>
<title>Inventory Control</title>
<div class="jumbotron" align="center" style=" margin-bottom:auto; height: 650px;  background-image:url('${SITE_URL}/static/logo/background.png') ;  background-repeat: no-repeat; background-size: cover;">
    <h1>${title}</h1>
    <h2><p>Please Login to continue or Register your FREE account</p></h2>
    <p>
        <a class="btn btn-success btn-lg" href="${SITE_URL}/admin" role="button">Login</a>
        <a class="btn btn-info btn-lg" href="${SITE_URL}/register" role="button">Register</a>
    </p>
</div>
       
<%@include file="footer.jsp" %>
