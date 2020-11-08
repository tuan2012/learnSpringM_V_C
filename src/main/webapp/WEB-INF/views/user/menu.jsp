<%--
  Created by IntelliJ IDEA.
  User: phama
  Date: 10/27/2020
  Time: 2:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/common/tablib.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<ul>
    <c:forEach var="item" items="${menu}">
        <li>${item}</li>
    </c:forEach>
</ul>
