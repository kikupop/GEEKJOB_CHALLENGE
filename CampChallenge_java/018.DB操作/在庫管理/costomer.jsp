<%-- 
    Document   : costomer
    Created on : 2018/07/08, 23:06:24
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>フォームトップ</title>
    </head>
    <body>
       
        <h1>フォームログイン認証</h1>
        <form action="./costomer" method="POST">
          
          ユーザーID：<input type="text" name="user" size="16">
          パスワード：<input type="text" name="pass" size="16">
          
          <input type="submit" value="login">
      </form>
        
    </body>
</html>
