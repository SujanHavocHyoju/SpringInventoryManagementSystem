<%@include file="../../header.jsp" %>
<title>Purchase</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
    <h1>Add Purchases</h1>
        <form action="${SITE_URL}/admin/purchase/save" method="post">
                <div class="form-group">
                    <label>Product Name:</label>
                    <input type="text" name="productName" required="required" placeholder="Enter Product Name" class="form-control" />
                </div>
                <div class="form-group">
                    <label>Cost Price:</label>
                    <input type="text" name="costPrice" required="required" placeholder="Enter Cost Price" class="form-control" />
                </div>
                <div class="form-group">
                    <label>Discount:</label>
                    <input type="text" name="discount" required="required" placeholder="Enter Discount" class="form-control" />
                </div>
                <div class="form-group">
                    <label>Quantity:</label>
                    <input type="number" name="quantity" required="required" placeholder="Enter Quantity" class="form-control" />
                </div>
                <div class="form-group">
                    <label>Total Cost:</label>
                    <input type="text" name="totalCost" required="required" placeholder="Enter Total Cost" class="form-control" />
                </div>
                <div class="form-group">
                    <label>Supplier:</label>
                    <select name="supplierId" class="form-control" required="required">
                        <option value="">Select Suppliers</option>
                        <option value="1">1. NewTech Electronics Suppliers</option>
                        <option value="2">2. Antique Fashion Store</option>
                        <option value="3">3. Havoc Stationery Supplies</option>
                        <option value="4">4. MG Classico Sports Store</option>
                        <option value="5">5. Hulas Group</option>
                        <option value="6">6. NepBike Access</option>
                        <option value="7">7. Juju Curd & Bakery</option>
                    </select>
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
                </div>
                <div>
                    <label>Availability Status</label>
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
                <a href="${SITE_URL}/admin/purchase" class="btn btn-danger">Back</a>
                </br>

            </form>
    
    </div>
    
</div>


<%@include file="../../footer.jsp" %>