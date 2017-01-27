<%@include file="../../header.jsp" %>
<title>Products</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
        <h1><u>Products</u></h1>
    <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/product/add" title="Add Products" class="btn btn-primary">
                      <span class="glyphicon glyphicon-plus"></span>
                    </a>
                      <a href="${SITE_URL}/admin" title="Back to Admin Page" class="btn btn-danger">
                      <span class="glyphicon glyphicon-home"></span>
                    </a>
                </p>
            </div>
            <table class ="table  table-hover table-condensed">
                <tr>
                    <th>Id</th>
                    <th>Product Name</th>
                    <th>Cost Price</th>
                    <th>Selling Price</th>
                    <th>Discount</th>
                    <th>Quantity</th>
                    <th>Category</th>
                    <th>Supplier Id</th>
                    <th>Added Date</th>
                    <th>in Stock</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="prod" items="${products}">
                    <tr>
                        <td>${prod.id}</td>
                        <td>${prod.productName}</td>
                        <td>${prod.costPrice}</td>
                        <td>${prod.sellingPrice}</td>
                        <td>${prod.discount}</td>
                        <td>${prod.quantity}</td> 
                        <td>${prod.categoryName}</td>
                        <td>${prod.supplierId}</td>
                        <td>${prod.addedDate}</td>   
                        <td>${prod.status}</td>
                        <td>
                            <a href="${SITE_URL}/admin/product/edit/${prod.id}" class="btn btn-success" title="Edit Products">
                                <span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${SITE_URL}/admin/product/delete/${prod.id}" class="btn btn-danger" title="Delete Products" onclick="return confirm('Are you sure to Delete?')">
                                <span class="glyphicon glyphicon-trash"></span></a>
                            <a href="${SITE_URL}/admin/product/reorder/${prod.id}" class="btn btn-info" title="ReOrder Products">
                                <span class="glyphicon glyphicon-shopping-cart"></span></a>    
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </div>
    
</div>


<%@include file="../../footer.jsp" %>