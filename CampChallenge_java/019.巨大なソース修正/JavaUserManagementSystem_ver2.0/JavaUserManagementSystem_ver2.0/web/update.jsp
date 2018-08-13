<%@page import="jums.UserDataDTO"%>
<%@page import="java.util.Date"%>
<%@page import="jums.UserDataBeans"%>
<%@page import="jums.JumsHelper" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
      HttpSession hs = request.getSession();
      UserDataDTO udd = (UserDataDTO)hs.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS変更画面</title>
    </head>
    <body>
    <form action="UpdateResult" method="POST">
        <% //out.print(up.getAttribute("Birth")); 1950-01-02       
//           Object obj = hs.getAttribute("Birth");
           Object obj = udd.getBirthday();
           String birth = obj.toString();
           //year
//           out.println(birth.substring(0,4));
//           out.println(birth.substring(5,7));
//           out.println(birth.substring(8,10));
           //month
//           birth.substring(5,7);
//         //day
//           birth.substring(8,10);
//          01月などの場合、両対応
        %>
        ID:<input type="text" name="id" value="<%= udd.getUserID()%>">
        
        名前:
        <input type="text" name="name" value="<% out.print(udd.getName());%>">
        <br><br>

        生年月日:　
        <select name="year">
            <option value="">----</option>
            <% for(int i = 1950; i<=2010; i++){ 
            String str = String.valueOf(i); %>
            <option value="<%=i%>"  <% if(birth.substring(0,4).equals(str)){out.print("selected = \"selected\"");}%>><%=i%></option>
            <% } %>
        </select>年
        <select name="month">
            <option value="">--</option>
            <% for(int i = 1; i<=12; i++){
            String str = String.valueOf(i); %>
            <option value="<%=i%>" <% if(birth.substring(6,7).equals(str)){out.print("selected = \"selected\"");} %>
                    <%if(birth.substring(5,7).equals(str)){out.print("selected = \"selected\"");} %>><%=i%></option>
            <% } %>
        </select>月
        <select name="day">
            <option value="">--</option>
            <% for(int i = 1; i<=31; i++){ 
            String str = String.valueOf(i); %>
            
            <option value="<%=i%>" <% if(birth.substring(9,10).equals(str)){out.print("selected = \"selected\"");}%>
                    <%if(birth.substring(8,10).equals(str)){out.print("selected = \"selected\"");} %>><%=i%></option>
            <% } %>
        </select>日
        <br><br>

        種別:
        <br>
            <% for(int i = 1; i<=3; i++){ %>
            <input type="radio" name="type" value="<%=i%>"<% if(udd.getType() == i){out.print("checked = \"checked\"");}%>><%=jh.exTypenum(i)%><br>
            <% } %>
        <br>

        電話番号:
        <input type="text" name="tell" value="<%= udd.getTell()%>">
        <br><br>

        自己紹介文
        <br>
        <textarea name="comment" rows=10 cols=50 style="resize:none" wrap="hard"><%= udd.getComment()%></textarea><br><br>
        
        <input type="hidden" name="ac"  value="<%= hs.getAttribute("ac")%>">
        <input type="submit" name="btnSubmit" value="確認画面へ">
        
    </form>
        <form>
        <input type="button" value="詳細画面に戻る" onClick="history.back()">
<!--        <form action="ResultDetails">
        <input type="hidden" name="ac"  value="<%--= hs.getAttribute("ac")--%>">
        <input type="button" value="詳細画面に戻る"> -->
        </form>
        <br>
        <%=jh.home()%>
    </body>
</html>
