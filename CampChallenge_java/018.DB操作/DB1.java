/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author kiku
 */
public class DB1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DB1</title>");            
            out.println("</head>");
            out.println("<body>");
    
            
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST", "kiku", "0615");

            db_st = db_con.prepareStatement("INSERT INTO profiles (profilesID, name, tel, age, birthday) VALUES(?, ?, ?, ?, ?)");
            db_st.setInt(1, 6);
            db_st.setString(2, "田辺はじめ");
            db_st.setString(3, "000-0000-000");
            db_st.setInt(4, 18);
            db_st.setString(5, "2000-12-24");
            int result = db_st.executeUpdate();
            out.println(result + "行が追加されました。");

            db_st = db_con.prepareStatement("select * from profiles" );
            db_data = db_st.executeQuery();
            while(db_data.next()){
              out.print("ID：" + db_data.getString("profilesID") + "<br>");
              out.print("名前：" + db_data.getString("name") + "<br>");
              out.print("電話番号：" + db_data.getString("tel") + "<br>");
              out.print("歳：" + db_data.getString("age") + "<br>");
              out.print("誕生日：" + db_data.getString("birthday") + "<br>");
            }
            
//            変数 = PreparedStatement変数.executeUpdate();

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
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

