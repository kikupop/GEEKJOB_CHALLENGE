<%-- 
    Document   : formkoushin
    Created on : 2018/07/06, 16:18:41
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form action="./formkoushin">
      <!-- formタグで括られた入力項目はこれら -->
      <div>
          <label for="profilesID">IDを記入</label>
          <input type="text" name="ID">
      </div>
      <div>
          <label for="name">名前を記入</label>
          <input type="text" name="name">
      </div>
      <div>
          <label for="tel">電話番号を記入</label>
          <input type="text" name="tel">
      </div>
      <div>
          <label for="age">年齢を記入</label>
          <input type="text" name="age">
      </div>
      <div>
          <label for="birthday">誕生日を記入</label>
          <input type="text" name="birthday">
      </div>
      <input type="submit" name="btnSubmit">

    </form>
        
        
        
    </body>
</html>
