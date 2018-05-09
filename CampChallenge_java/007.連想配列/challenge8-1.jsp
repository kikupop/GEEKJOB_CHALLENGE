<%-- 
    Document   : challenge8-1
    Created on : 2018/05/07, 11:08:39
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.util.HashMap" %>
<%
// "1"に"AAA", "hello"に"world", "soeda"に"33", "20"に"20"
HashMap<String, String> challenge =
            new HashMap<String, String>();
challenge.put("1", "AAA");
challenge.put("hello", "world");
challenge.put("soeda", "33");
challenge.put("20", "20");

out.print(challenge);
%>