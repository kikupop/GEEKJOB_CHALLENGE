<%-- 
    Document   : datasounyu
    Created on : 2018/07/06, 13:27:01
    Author     : kiku
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
       Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
  
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST", "kiku", "0615");

            //フォーム受け取り
            request.setCharacterEncoding("UTF-8");
            String getID = request.getParameter("ID");
            String getName = request.getParameter("name");
            String getTel = request.getParameter("tel");
            String getAge = request.getParameter("age");
            String getBirth = request.getParameter("birthday");
            

            //フォーム情報をレコードに挿入
            db_st = db_con.prepareStatement("insert into profiles (profilesID, name, tel, age, birthday) values(?, ?, ?, ?, ?)"); 
            db_st.setString(1, getID);
            db_st.setString(2, getName);
            db_st.setString(3, getTel);
            db_st.setString(4, getAge);
            db_st.setString(5, getBirth);
            int num = db_st.executeUpdate();
            
            //全件検索
            db_st = db_con.prepareStatement("select * from profiles"); 
           
            db_data = db_st.executeQuery();
             while(db_data.next()){
              out.print("IDは" + db_data.getInt("profilesID") + "<br>");
              out.print("名前は" + db_data.getString("name") + "<br>");
              out.print("電話番号は" + db_data.getString("tel") + "<br>");
              out.print("歳は" + db_data.getInt("age") + "<br>");
              out.print("誕生日は" + db_data.getString("birthday") + "<br>");
              out.print("<br>");
             }
           
            db_data.close();
            db_st.close();
            db_con.close();
            
        }catch (SQLException e_sql){
            out.println("接続時にエラーが発生しました："+e_sql.toString());
        }catch(Exception e){
            out.println("接続時にエラーが発生しました:"+e.toString());
        }finally{
            if(db_con != null){
                try{
                    db_con.close();
                }catch(Exception e_con){
                    out.println(e_con.getMessage());
                }
            }
        }
        %>
    </body>
</html>
