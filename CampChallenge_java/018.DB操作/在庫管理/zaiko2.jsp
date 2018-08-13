<%-- 
    Document   : zaiko2
    Created on : 2018/07/08, 22:18:47
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>商品情報</title>
    </head>
    <body>
      <form action="./zaiko2">
          <select>
              <option name="db" value="0">商品一覧</option>
          </select>
<!--          <select>
              <option name="info" value="1">本人情報</option>
          </select>
          <select>
              <option name="info" value="2">商品登録</option>
          </select>
          <select>
              <option name="info" value="3">ログイントップ</option>
          </select>
          <select>
              <option name="info" value="4">ログアウト</option>-->
          </select>
          <input type="submit" name="btnSubmit">
      </form>
    </body>
</html>
