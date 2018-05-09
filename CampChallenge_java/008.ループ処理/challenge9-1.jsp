<%-- 
    Document   : challenge9-1
    Created on : 2018/05/07, 11:38:22
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<%
    long total=1;
    for( int i= 1; i<20; i++){
         total=total*8;
    }
    out.print(total);

%>