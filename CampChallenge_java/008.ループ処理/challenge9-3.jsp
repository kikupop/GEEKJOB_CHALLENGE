<%-- 
    Document   : challenge9-3
    Created on : 2018/05/07, 11:38:52
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int total = 0;
    for (int i = 0; i <=100; i++){
        total = total + i;
    }
    out.print(total);

%>