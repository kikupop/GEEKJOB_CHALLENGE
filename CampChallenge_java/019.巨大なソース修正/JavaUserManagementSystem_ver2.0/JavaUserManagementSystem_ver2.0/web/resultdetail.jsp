<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" 
        import="jums.UserDataBeans" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    HttpSession hs = request.getSession();
    UserDataDTO udd = (UserDataDTO)request.getAttribute("resultData");
     
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMSユーザー情報詳細画面</title>
    </head>
    <body>
        <h1>詳細情報</h1>
        ID:<%= udd.getUserID()%><br>
        名前:<%= udd.getName()%><br>
        生年月日:<%= udd.getBirthday()%><br>
        種別:<%= udd.getType()%><br>
        電話番号:<%= udd.getTell()%><br>
        自己紹介:<%= udd.getComment()%><br>
        登録日時:<%= udd.getNewDate()%><br>
        

        
        <% 
            hs.setAttribute("resultData",udd);
//            hs.setAttribute("Name", udd.getName());
//           hs.setAttribute("Birth", udd.getBirthday());
//           hs.setAttribute("Type", udd.getType());
//           hs.setAttribute("Tell", udd.getTell());
//           hs.setAttribute("Comment", udd.getComment());
//           hs.setAttribute("NewDay", udd.getNewDate());
        %>
      
        <form action="Update" method="POST">
        <input type="submit" name="update" value="変更" style="width:100px">
        </form>
        <form action="Delete" method="POST">
        <input type="submit" name="delete" value="削除" style="width:100px">
        </form>
        <form>
            <input type="button" value="検索結果に戻る" onClick="history.back()">
<!--        <form action="SearchResult" method="POST">
         <input type="hidden" name="ac"  value="<%-- hs.getAttribute("ac")--%>">
        <input type="submit" name="back" value="検索結果に戻る">-->
        </form>
    </body>
</html>
