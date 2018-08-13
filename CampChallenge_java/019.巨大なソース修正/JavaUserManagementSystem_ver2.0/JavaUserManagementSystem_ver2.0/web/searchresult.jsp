<%@page import="java.util.ArrayList"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataDTO" %>
<%
    JumsHelper jh = JumsHelper.getInstance();
    ArrayList<UserDataDTO> udd = (ArrayList<UserDataDTO>) request.getAttribute("resultData");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS検索結果画面</title>
    </head>
    <body>
        <h1>検索結果</h1>
        <% for(UserDataDTO data : udd){ %>
        <table border=1>
            <tr>
                <th>名前</th>
                <th>生年</th>
                <th>種別</th>
                <th>登録日時</th>
            </tr>        
            <tr>
                    <td><a href="ResultDetail?id=<%= data.getUserID()%>"><%= data.getName()%></a></td>
                    <td><%= data.getBirthday()%></td>
                    <td><%= data.getType()%></td>
                    <td><%= data.getNewDate()%></td>     
            </tr>
             <% } %>
        </table>
    </body>
    <%=jh.home()%>
</html>