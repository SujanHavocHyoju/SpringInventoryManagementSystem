<%@include file="../../header.jsp" %>
<title>Products</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
    <h1>Add Product</h1>
        <form action="${SITE_URL}/admin/sales/save" method="post">
                <div class="form-group">
                    <label>Product Id:</label>
                    <input type="text" name="productId" required="required" placeholder="Enter Product Id" class="form-control"/>
                </div>
                
                <div class="form-group">
                    <label>Selling Price:</label>
                    <input type="text" name="sellingPrice" required="required" placeholder="Enter Selling Price" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Quantity:</label>
                    <input type="number" name="quantity" required="required" placeholder="Enter Quantity" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Discount:</label>
                    <input type="text" name="discount" required="required" placeholder="Enter Discount" class="form-control"/>
                </div>
                <div class="form-group">
                    <label>Total Cost</label>
                    <input type="text" name="totalCost" required="required" placeholder="Enter Total Cost" class="form-control" />
                </div>
                
                <div class="form-group">
                    <label>Payment Method:</label>
                    <select name="paymentMethod" class="form-control" required="required">
                        <option value="">Select Payment Method</option>
                        <option value="CASH">CASH</option>
                        <option value="CHEQUE">CHEQUE</option>
                        <option value="CREDIT">CREDIT</option>
                        <option value="E-PAY">E-PAY</option>
                    </select>
                
                <div>
                    <label>Payment Status</label>
                    <select name="status" class="form-control" required="required">
                        <option value="">Select Status</option>
                        <option value="0">Unpaid</option>
                        <option value="1">Paid</option>
                    </select>
                </div>
                </br>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-success">Save</button>
                <button type="reset" class="btn btn-info">Reset</button>
                <a href="${SITE_URL}/admin/sales" class="btn btn-danger">Back</a>
                </br>

            </form>
    
    </div>
    
</div>


<%@include file="../../footer.jsp" %>