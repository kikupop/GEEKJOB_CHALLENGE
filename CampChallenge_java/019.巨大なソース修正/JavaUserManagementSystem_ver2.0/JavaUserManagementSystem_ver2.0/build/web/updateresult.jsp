<%@page import="jums.UserDataDTO"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
      UserDataBeans udb = (UserDataBeans)request.getAttribute("udb");
      HttpSession hs = request.getSession();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS更新結果画面</title>
    </head>
    <body>
        <h1>変更結果</h1><br>
        <%UserDataDTO udd = new UserDataDTO(); %>
        ID:<%= udd.getUserID()%>
        
        名前:<%= udb.getName()%><br>
        生年月日:<%= udb.getYear()+"年"+udb.getMonth()+"月"+udb.getDay()+"日"%><br>
        種別:<%= jh.exTypenum(udb.getType())%><br>
        電話番号:<%= udb.getTell()%><br>
        自己紹介:<%= udb.getComment()%><br>
        以上の内容で登録しました。<br>
        <form>
            <input type="button" value="詳細画面に戻る" onClick="history.go(-2)">
        </form>
<!--        <input type="button" value="詳細画面へ戻る" onclick="./resultdetail.jsp">
        <input type="hidden" name="ac"  value="<%--= hs.getAttribute("ac")--%>">-->
    </body>
    <%=jh.home()%>
    
</html>
