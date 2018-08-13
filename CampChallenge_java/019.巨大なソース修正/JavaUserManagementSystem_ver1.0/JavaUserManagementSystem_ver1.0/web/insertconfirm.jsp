<%@page import="jums.JumsHelper"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.InsertConfirm"%>
<% UserDataBeans UserData = new UserDataBeans();%>
<%
   HttpSession hs = request.getSession();
   //格納された型を戻す
    UserData = (UserDataBeans) hs.getAttribute("hs");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>     
        <h1>登録確認</h1>
    <% if(UserData.getName().equals("")){ %>
        <% out.print("名前が未入力です"); %><br>
        
    <% }if(UserData.getYear() == 0){ %>
        <% out.print("生年月日:" + "年が未入力です"); %><br>
        
    <% }if(UserData.getMonth() == 0){ %>
        <% out.print("生年月日:" +  "月が未入力です"); %><br>

    <% }if(UserData.getDay() == 0){%>
        <% out.print("生年月日:" + "日が未入力です"); %><br>
        
    <% }if(UserData.getType() == 0){%>
        <% out.print("種別が未入力です"); %><br>
        
    <% }if(UserData.getTell().equals("")){%>
        <% out.print("電話番号が未入力です"); %><br>
        
    <% }if(UserData.getComment().equals("")){%>
        <% out.print("自己紹介が未入力です"); %><br>

        <h1>入力が不完全です</h1>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        
    <% }else{ %>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="submit" name="yes" value="はい">
        </form>
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
