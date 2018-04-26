<%-- 
    Document   : challenge3-1
    Created on : 2018/04/23, 10:23:02
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    final int BASE = 20;
    int num1 = 10;
   

    
    out.print(++num1);
    out.print("<br>");
    out.print(BASE);
    out.print("<br>");
    
int result = BASE * num1;

out.print(result);
%>