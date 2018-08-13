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
//import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;
/**
 *
 * @author kiku
 */
public class costomer extends HttpServlet {

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
            out.println("<title>ログイン</title>");            
            out.println("</head>");
            out.println("<body>");
  
        Connection db_con = null;
        PreparedStatement db_st = null;
        ResultSet db_data = null;
  
        try{
        
            Class.forName("com.mysql.jdbc.Driver").newInstance();  
            db_con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST", "kiku", "0615");

            //フォーム受け取り
            request.setCharacterEncoding("UTF-8");
            
             String getName = request.getParameter("user");
             if(null== getName){
                 getName = "";
             }
             String getPass = request.getParameter("pass");
             if(null == getPass){
                 getPass = "";
             }
             
             String UserName = "kiku";
             String UserPass = "0615";
             
             if(UserName.equals(getName) && UserPass.equals(getPass)){
                 //ユーザー情報開示
//              db_st = db_con.prepareStatement("select * from costomer where name = ?"); 
//              db_st.setString(1, getName);

                out.print("ログイン成功");
                 // 商品一覧へ遷移(リダイレクト).
                response.sendRedirect( "./top.jsp" );
                } else {
                // ログインフォームへ遷移(リダイレクト).
                response.sendRedirect( "./costomer.jsp" );
                }
//             }else{ forward = "/costomererr.jsp";
//             }else{
//                 out.print("ログイン失敗");
//             }
            //ログイン　セッション
             HttpSession hs = request.getSession(true);
//            // セッションへ登録
//            hs.setAttribute("Name", getName);
//            // セッションから情報を取得 -- 寿司
//            String Name = hs.getAttribute("Name");
            if(UserName.equals(getName) && UserPass.equals(getPass)){
                // ログイン情報.
//                Map<String, String> map = new HashMap<String, String>();
//                map.put( "NAME", getName );
//                map.put( "PASS", getPass );

                // ログイン情報をセッションに保存.
                hs.setAttribute( "login_user", getName );
                hs.setAttribute( "login_user", getPass );

                // 商品一覧へ遷移(リダイレクト).
//                response.sendRedirect( "./zaiko2.jsp" );
//                } else {
//                // ログインフォームへ遷移(リダイレクト).
//                response.sendRedirect( "./costomer.jsp" );
//                }
//                
            

//            // 既にログイン中.
//            if ( null != map ) {
//            // トップページへ遷移(リダイレクト).
//            response.sendRedirect( "./" );
//            return;
            }

// ログインフォームへ遷移(フォワード).
RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher( "/costomererr.jsp" );
dispatcher.forward( request, response );
             

//            db_data = db_st.executeQuery();
//             while(db_data.next()){
//              out.print("商品番号:" + db_data.getInt("num") + "<br>");
//              out.print("品名:" + db_data.getString("p_name") + "<br>");
//              out.print("値段 " + db_data.getInt("price") + "円" + "<br>");
//              out.print("品種「" + db_data.getString("genre") + "」<br>");
//              out.print("<br>");
//             }
           
//            db_data.close();
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
