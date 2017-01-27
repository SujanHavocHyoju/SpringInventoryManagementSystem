<%@include file="../header.jsp" %>
<title>Inventory Index</title>
<%@include file="../navbarlogout.jsp" %>

<div align="center">
    <h2>Welcome ${title}</h2> 
    <br/>
    <div class="container">
        <div class="col-md-3">
            <img src="${SITE_URL}/static/logo/product_logo.png" height="200" width="200" alt="Products" class="img-circle">
            <br/><br/>
            <a href="${SITE_URL}/admin/product" class="btn btn-primary">Products</a>
        </div>
        <div class="col-md-3">
            <img src="${SITE_URL}/static/logo/sales_logo.png" height="200" width="200" alt="Sales" class="img-circle">
            <br/><br/>
            <a href="${SITE_URL}/admin/sales" class="btn btn-primary">Sales</a>
        </div>
        <div class="col-md-3">
            <img src="${SITE_URL}/static/logo/purchase_logo.png" height="200" width="200" alt="Purchases" class="img-circle">
            <br/><br/>
            <a href="${SITE_URL}/admin/purchase" class="btn btn-primary">Purchases</a>
        </div>
        <div class="col-md-3">
            <img src="${SITE_URL}/static/logo/supplier_logo.png" height="200" width="200" alt="Suppliers" class="img-circle">
            <br/><br/>
            <a href="${SITE_URL}/admin/supplier" class="btn btn-primary">Suppliers</a>
        </div>
    </div>
</div>


<%@include file="../footer.jsp" %>