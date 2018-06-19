<%-- 
    Document   : session2
    Created on : 2018/06/18, 17:06:16
    Author     : kiku
--%>
<%@ page import="javax.servlet.http.HttpSession"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
    request.setCharacterEncoding("UTF-8");
        out.print(request.getParameter("名前"));
        
        request.getParameter("性別");
            if("性別".equals("0")){
                out.print("男");
            }else{
                out.print("女");
            }
        out.print(request.getParameter("趣味"));
        
        Cookie a = new Cookie("名前", request.getParameter());
        Cookie b = new Cookie("性別", request.getParameter());
        Cookie c = new Cookie("趣味", request.getParameter());
        response.addCookie(a);
        response.addCookie(b);
        response.addCookie(c);
        

 
        
        
//        HttpSession hs = request.getSession();
//        hs.setAttribute("名前", request.getParameter("名前"));
//        hs.setAttribute("性別", request.getParameter("性別"));
//        hs.setAttribute("趣味", request.getParameter("趣味"));
//        
//        String A = (String)hs.getAttribute("名前");
//        String B = (String)hs.getAttribute("性別");
//        String C = (String)hs.getAttribute("趣味");
        %>
    </body>
</html>
