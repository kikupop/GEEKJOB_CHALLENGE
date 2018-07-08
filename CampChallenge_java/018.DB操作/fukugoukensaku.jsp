<%-- 
    Document   : fukugoukensaku
    Created on : 2018/07/06, 17:50:57
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
    
         <form action="./fukugoukensaku">
      <!-- formタグで括られた入力項目はこれら -->

      <div>
          <label for="name">名前を記入</label>
          <input type="text" name="name">
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
