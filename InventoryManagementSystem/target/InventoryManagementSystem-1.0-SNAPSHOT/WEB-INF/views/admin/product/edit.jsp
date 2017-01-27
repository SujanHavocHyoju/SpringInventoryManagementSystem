<%@include file="../../header.jsp" %>
<title>Products</title>
<%@include file="../../navbarlogout.jsp" %>

<div >
    <div class="container">
    <h1>Edit Product</h1>
        <form action="" method="post">
                <div class="form-group">
                    <label>Product Name:</label>
                    <input type="text" name="productName" required="required" placeholder="Enter Product Name" class="form-control" value="${product.productName}"/>
                </div>
                <div class="form-group">
                    <label>Cost Price:</label>
                    <input type="text" name="costPrice" required="required" placeholder="Enter Cost Price" class="form-control" value="${product.costPrice}"/>
                </div>
                <div class="form-group">
                    <label>Selling Price:</label>
                    <input type="text" name="sellingPrice" required="required" placeholder="Enter Selling Price" class="form-control" value="${product.sellingPrice}"/>
                </div>
                <div class="form-group">
                    <label>Discount:</label>
                    <input type="text" name="discount" required="required" placeholder="Enter Discount" class="form-control" value="${product.discount}"/>
                </div>
                <div class="form-group">
                    <label>Quantity:</label>
                    <input type="number" name="quantity" required="required" placeholder="Enter Quantity" class="form-control" value="${product.quantity}"/>
                </div>
                <div class="form-group">
                    <label>Category Name:</label>
                    <select name="categoryName" class="form-control" required="required">
                        <option value="">Category: ${product.categoryName} - Select New Category:</option>
                        <option value="">Select Category</option>
                        <option value="Apparels & Accessories">Apparels & Accessories</option>
                        <option value="Automobile">Automobile</option>
                        <option value="Beauty & Health">Beauty & Health</option>
                        <option value="Books & Learning">Books & Learning</option>
                        <option value="Computers & Peripherals">Computers & Peripherals</option>
                        <option value="Electronics">Electronics</option>
                        <option value="Food & Nutrition">Food & Nutrition</option>
                        <option value="Mobile & Accessories">Mobile & Accessories</option>
                        <option value="Music Instruments">Music Instruments</option>
                        <option value="Sports & Fitness">Sports & Fitness</option>
                    </select>
                </div>
                <div class="form-group">
                    <label>Supplier:</label>
                    <select name="supplierId" class="form-control" required="required">
                        <option value="">Supplier no: ${product.supplierId} - Select New Supplier:</option>
                        <option value="1">1. NewTech Electronics Suppliers</option>
                        <option value="2">2. Antique Fashion Store</option>
                        <option value="3">3. Havoc Stationery Supplies</option>
                        <option value="4">4. MG Classico Sports Store</option>
                        <option value="5">5. Hulas Group</option>
                        <option value="6">6. NepBike Access</option>
                        <option value="7">7. Juju Curd & Bakery</option>
                    </select>
                </div>
                <div>
                    <label>Availability Status</label>
                    <select name="status" class="form-control" required="required">
                        <option value="">Status: ${product.status} - Select New Status:</option>
                        <option value="0">Unavailable</option>
                        <option value="1">Available</option>
                    </select>
                </div>
                </br>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <button type="submit" class="btn btn-success">Save</button>
                <button type="reset" class="btn btn-info">Reset</button>
                <a href="${SITE_URL}/admin/product" class="btn btn-danger">Back</a>
                </br>

            </form>
    
    </div>
    
</div>


<%@include file="../../footer.jsp" %>