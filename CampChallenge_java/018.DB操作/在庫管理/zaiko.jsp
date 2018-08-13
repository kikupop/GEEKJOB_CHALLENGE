<%-- 
    Document   : zaiko
    Created on : 2018/07/06, 19:06:54
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品情報登録</title>
    </head>
    <body>
        
         <form action="./zaiko">
      <!-- formタグで括られた入力項目はこれら -->

      <div>
          <label for="num">製品番号</label>
          <input type="text" name="num">
      </div>
      <div>
          <label for="name">商品名</label>
          <input type="text" name="name">
      </div>
      <div>
          <label for="price">値段</label>
          <input type="text" name="price">
      </div>
      <div>
          <label for="genre">品種</label>
          <input type="text" name="genre">
      </div>
      <input type="submit" name="btnSubmit">

    </form>
        
        
        
    </body>
</html>
