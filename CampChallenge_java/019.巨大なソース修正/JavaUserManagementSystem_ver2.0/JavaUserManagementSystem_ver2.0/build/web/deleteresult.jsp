
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <% HttpSession hs = request.getSession();%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除結果画面</title>
    </head>
    <body>
    <h1>削除確認</h1>
    削除しました。<br>
    <form>
        <input type="button" value="検索結果に戻る" onClick="history.go(-3)">
    </form>
<!--  <input type="button" value="検索結果画面へ戻る" onclick="resultdetail">
  <input type="hidden" name="ac"  value="<%--= hs.getAttribute("ac")--%>">-->
    </body>
</html>
