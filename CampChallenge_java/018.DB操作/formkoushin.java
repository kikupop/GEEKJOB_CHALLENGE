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
public class formkoushin extends HttpServlet {

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
            out.println("<title>Servlet formkoushin</title>");            
            out.println("</head>");
            out.println("<body>");
 
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

             //指定されたIDのカラム更新                   
            db_st = db_con.prepareStatement("update profiles set age = ?, name = ?, tel = ?,  birthday = ? where profilesID = ?"); 
            db_st.setString(5, getID);
            db_st.setString(1, getAge);
            db_st.setString(2, getName);
            db_st.setString(3, getTel);
            db_st.setString(4, getBirth);
            
            int num = db_st.executeUpdate();
           
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
