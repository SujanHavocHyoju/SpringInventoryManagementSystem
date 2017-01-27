<%@include file="../../header.jsp" %>
<title>Category</title>
<%@include file="../../navbarlogout.jsp" %>

<div>
    <div class="container">
    <h1>Add Category</h1>
        <form action="${SITE_URL}/admin/category/save" method="post">
                <div class="form-group">
                    <label>Category Name:</label>
                    <input type="text" name="categoryName" required="required" placeholder="Enter Category Name" class="form-control" value="${category.categoryName}"/>
                </div>
                
                
                </br>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-success">Save</button>
                <button type="reset" class="btn btn-info">Reset</button>
                <a href="${SITE_URL}/admin/category" class="btn btn-danger">Back</a>
                </br>

            </form>
    
    </div>
    
</div>


<%@include file="../../footer.jsp" %>