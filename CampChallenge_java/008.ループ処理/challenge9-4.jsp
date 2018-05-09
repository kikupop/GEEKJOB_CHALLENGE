<%-- 
    Document   : challenge9-4
    Created on : 2018/05/07, 14:35:44
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    int key = 1000;

while(key > 100){
    key = key / 2;
  
}

out.print(key);

%>