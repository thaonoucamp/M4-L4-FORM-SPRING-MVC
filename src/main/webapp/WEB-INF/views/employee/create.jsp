<%--
  Created by IntelliJ IDEA.
  User: thaodangxuan
  Date: 16/07/2021 sau CN
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>CREATE A NEW EMPLOYEE</title>
</head>
<body>
<div align="center">
    <h3>DETAIL EMPLOYEE
    </h3>
    <form:form method="post" action="add" modelAttribute="employee">
        <table>
            <tr>
                <td><form:label path="id">ID </form:label></td>
                <td><form:input path="id"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="name">NAME </form:label></td>
                <td><form:input path="name"></form:input></td>
            </tr>
            <tr>
                <td><form:label path="contactNumber">PHONE</form:label></td>
                <td><form:input path="contactNumber"></form:input></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"></td>
            </tr>
        </table>
    </form:form>
</div>
</body>
</html>
