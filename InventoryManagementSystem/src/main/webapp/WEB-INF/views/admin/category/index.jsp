<%@include file="../../header.jsp" %>
<title>Category</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
        <h1><u>Category</u></h1>
    <div class="pull-right">
                <p>
                    <a href="${SITE_URL}/admin/category/add" title="Add Category" class="btn btn-primary">
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
                    <th>Category Name</th>
                    <th>Action</th>
                </tr>
                <c:forEach var="cat" items="${category}">
                    <tr>
                        <td>${cat.id}</td>
                        <td>${cat.categoryName}</td>
                        <td>
                            <a href="${SITE_URL}/admin/category/edit/${cat.id}" class="btn btn-success" title="Edit Category">
                                <span class="glyphicon glyphicon-pencil"></span></a>
                            <a href="${SITE_URL}/admin/category/delete/${cat.id}" class="btn btn-danger" title="Delete Category" onclick="return confirm('Are you sure to Delete?')">
                                <span class="glyphicon glyphicon-trash"></span></a>   
                        </td>
                    </tr>
                </c:forEach>
            </table>
    </div>
    
</div>


<%@include file="../../footer.jsp" %>