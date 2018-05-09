<%-- 
    Document   : challenge6-1
    Created on : 2018/04/26, 10:44:42
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int num = 2;
    switch(num){
       case 1:
        out.print("one");
        break;
       case 2:
        out.print("two");
        break;
       default:
        out.print("想定外");
        break;

    }

%>