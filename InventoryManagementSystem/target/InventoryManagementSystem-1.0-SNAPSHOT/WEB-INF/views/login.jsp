<%@include file="header.jsp" %>
<title>Inventory Control</title>
<div class="jumbotron" align="center" style=" margin-bottom:auto; height: 650px;  background-image:url('${SITE_URL}/static/logo/background.png') ;  background-repeat: no-repeat; background-size: cover;">
    <h2>${title}</h2>
    <c:if test="${param.error!=null}">
            <div style="color: red"> Invalid Username/Password</div>
        </c:if>
        <form action="" method="post">
            <div class="form-group">
                <label>Username:</label>
                <input type="text" name="username"  required="required" placeholder="enter username"/>
            </div>
            <div class="form-group">
                <label>Password:</label>
                <input type="password" name="password"  required="required" placeholder="enter password"/>
            </div>
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <button class="btn btn-success" type="submit">Login</button>
            <button type="reset" class="btn btn-danger">Reset</button>
            <a href="${SITE_URL}/register" class="btn btn-info">Register</a>
        </form>
    
       
<%@include file="footer.jsp" %>
