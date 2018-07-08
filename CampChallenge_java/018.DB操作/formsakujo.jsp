<%-- 
    Document   : formsakujo
    Created on : 2018/07/06, 15:39:04
    Author     : kiku
--%>


<%--<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.*"%>--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
<!--        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
  
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST", "kiku", "0615");
     
            //DBからID取得
            db_st = db_con.prepareStatement("select profilesID from profiles"); 
            db_data = db_st.executeQuery();
         
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
        -->
    <form action="./formsakujo">
        <div>
          <label for="profilesID">ID(1-6)を記入</label>
          <input type="text" name="ID">
        </div>
          <input type="submit" name="btnSubmit">
    </form>
    </body>
</html>
