<%-- 
    Document   : kadai1-1
    Created on : 2018/06/07, 14:45:07
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
        request.setCharacterEncoding("UTF-8");
        // テキストボックスの情報
        out.print(request.getParameter("名前"));
        // チェックボックスの情報
        //out.print(request.getParameter("chkTest"));
        // ラジオボタンの情報
        out.print(request.getParameter("性別"));
        // ボタンの情報
//        out.print(request.getParameter("btnTest"));
        // コンボボックス（select）の情報
//        out.print(request.getParameter("cmbList"));
        // テキストエリアの情報
        out.print(request.getParameter("趣味"));
        %>
        
    </body>
</html>
