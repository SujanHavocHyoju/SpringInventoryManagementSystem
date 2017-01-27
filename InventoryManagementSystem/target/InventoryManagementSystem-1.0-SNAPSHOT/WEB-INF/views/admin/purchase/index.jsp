<%@include file="../../header.jsp" %>
<title>Purchase</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
        <h1><u>Purchase</u></h1>
    <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/purchase/add" title="Add Purchase Transactions" class="btn btn-primary">
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
                    <th>Discount</th>
                    <th>Quantity</th>
                    <th>Total Cost</th>
                    <th>Supplier Id</th>
                    <th>Purchase Date</th>
                    <th>Payment Method</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="pur" items="${purchase}">
                    <tr>
                        <td>${pur.id}</td>
                        <td>${pur.productName}</td>
                        <td>${pur.costPrice}</td>
                        <td>${pur.discount}</td>
                        <td>${pur.quantity}</td> 
                        <td>${pur.totalCost}</td>
                        <td>${pur.supplierId}</td>
                        <td>${pur.purchaseDate}</td>   
                        <td>${pur.paymentMethod}</td>
                        <td>${pur.status}</td>
                        <td>
                            <a href="${SITE_URL}/admin/purchase/edit/${pur.id}" class="btn btn-success" title="Edit Purchase Records">
                                <span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${SITE_URL}/admin/purchase/delete/${pur.id}" class="btn btn-danger" title="Delete Purchase" onclick="return confirm('Are you sure to Delete?')">
                                <span class="glyphicon glyphicon-trash"></span></a>   
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </div>
    
</div>


<%@include file="../../footer.jsp" %>