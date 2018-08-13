<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper"%>
<%--<%@page import="javax.servlet.http.HttpSession" %>--%>
<%@page import="jums.InsertConfirm"%>
<%UserDataBeans UserData = new UserDataBeans();%>
<%
   HttpSession hs = request.getSession();
    UserData = (UserDataBeans) hs.getAttribute("hs");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録結果画面</title>
    </head>
    <body>
   
    <%-- if(UserData.getName().equals("")){ --%>
        <h1>登録結果</h1><br>
        <% out.print("名前:" + UserData.getName()); %><br>
        <% out.print("生年月日:" + UserData.getYear() +"年"+ UserData.getMonth() +"月"+ UserData.getDay() +"日"); %><br>
        <% out.print("種別:" + UserData.getType()); %><br>
        <% out.print("電話番号:" + UserData.getTell()); %><br>
        <% out.print("自己紹介:" + UserData.getComment()); %><br> 
        以上の内容で登録しました。<br>

<!--        <form action="InsertResult" method="POST">
        <form action="UserDataBeans" method="POST">
            <input type="submit" name="yes" value="はい">-->
<!--        </form>-->
    <%-- }else{ --%>
<!--        <h1>入力が不完全です</h1>-->
    <%-- } --%>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
        </form>
        
        <%=JumsHelper.getInstance().home()%>
    </body>
</html>
