<%@include file="../../header.jsp" %>
<title>Suppliers</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
    <h1>Add Suppliers</h1>
        <form action="${SITE_URL}/admin/supplier/save" method="post">
                <div class="form-group">
                    <label>Supplier Name:</label>
                    <input type="text" name="supplierName" required="required" placeholder="Enter Supplier Name" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Address:</label>
                    <input type="text" name="address" required="required" placeholder="Enter Address" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Contact no:</label>
                    <input type="text" name="contact" required="required" placeholder="Enter Contact no" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Email:</label>
                    <input type="email" name="email" required="required" placeholder="Enter Email" class="form-control"/>
                </div>
                
                <div>
                    <label>Status</label>
                    <select name="status" class="form-control" required="required">
                        <option value="">Select Status:</option>
                        <option value="0">Unavailable</option>
                        <option value="1">Available</option>
                    </select>
                </div>
                </br>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-success">Save</button>
                <button type="reset" class="btn btn-info">Reset</button>
                <a href="${SITE_URL}/admin/supplier" class="btn btn-danger">Back</a>
                </br>

            </form>
    
    </div>
    
</div>


<%@include file="../../footer.jsp" %>