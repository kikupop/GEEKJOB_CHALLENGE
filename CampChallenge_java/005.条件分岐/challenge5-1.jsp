<%-- 
    Document   : challenge5-1
    Created on : 2018/04/23, 14:30:05
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    int num = 1;
    if (num == 1) {
        out.print("1です！");
    }
    else if (num == 2) {
        out.print("プログラミングキャンプ！");
    } else{
        out.print("その他です！");        
    }
    %>