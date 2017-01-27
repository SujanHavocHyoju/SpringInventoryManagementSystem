<%@include file="../../header.jsp" %>
<title>Supplier</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
        <h1><u>Supplier</u></h1>
    <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/supplier/add" title="Add Suppliers" class="btn btn-primary">
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
                    <th>Supplier Name</th>
                    <th>Address</th>
                    <th>Contact no</th>
                    <th>Email</th>
                    <th>Added Date</th>
                    <th>Status</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="supp" items="${supplier}">
                    <tr>
                        <td>${supp.id}</td>
                        <td>${supp.supplierName}</td>
                        <td>${supp.address}</td>
                        <td>${supp.contact}</td>
                        <td>${supp.email}</td>
                        <td>${supp.addedDate}</td>  
                        <td>${supp.status}</td>
                        <td>
                            <a href="${SITE_URL}/admin/supplier/edit/${supp.id}" class="btn btn-success" title="Edit Supplier">
                                <span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${SITE_URL}/admin/supplier/delete/${supp.id}" class="btn btn-danger" title="Delete Supplier" onclick="return confirm('Are you sure to Delete?')">
                                <span class="glyphicon glyphicon-trash"></span></a>   
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </div>
    
</div>


<%@include file="../../footer.jsp" %>