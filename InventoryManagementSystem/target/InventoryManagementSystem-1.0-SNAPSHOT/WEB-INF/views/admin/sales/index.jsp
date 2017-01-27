<%@include file="../../header.jsp" %>
<title>Sales</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
        <h1><u>Sales</u></h1>
    <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/sales/add" title="Add Sales Records" class="btn btn-primary">
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
                    <th>Product ID</th>
                    <th>Selling Price</th>
                    <th>Quantity</th>
                    <th>Discount</th>
                    <th>Total Cost</th>
                    <th>Sales Date</th>
                    <th>Payment Method</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="sales" items="${sales}">
                    <tr>
                        <td>${sales.id}</td>
                        <td>${sales.productId}</td>
                        <td>${sales.sellingPrice}</td>
                        <td>${sales.quantity}</td> 
                        <td>${sales.discount}</td>
                        <td>${sales.totalCost}</td>
                        <td>${sales.salesDate}</td>
                        <td>${sales.paymentMethod}</td>   
                        <td>${sales.status}</td>
                        <td>
                            <a href="${SITE_URL}/admin/sales/edit/${sales.id}" class="btn btn-success" title="Edit Sales Transaction">
                                <span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${SITE_URL}/admin/sales/delete/${sales.id}" class="btn btn-danger" title="Delete Sales Transaction" onclick="return confirm('Are you sure to Delete?')">
                                <span class="glyphicon glyphicon-trash"></span></a>    
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </div>
    
</div>


<%@include file="../../footer.jsp" %>