/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author kiku
 */
public class hikimodori1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //引数　文字列型
    
   String[] getDatas(String prof){
    String[] data1 = {"tanaka123", "20001224", "123-0987"};
    String[] data2 = {"yamada123", "1990220", "234-0987"};
    String[] data3 = {"suzuki123", "2010110", "345-0987"};
    
    //戻り値　文字列型を要素に持つ配列型
    //もしデータ１の0番目が引数と一致したらデータ1の配列を戻り値として返す
    //文字列profと配列0番目がイコールのとき、データ群を送る
    if(prof.equals (data1[0])){
        return data1;
    }
    else if(prof.equals (data2[0])){
        return data2;
    }
    else if(prof.equals (data3[0])){
        return data3;
    
   }
    
    return null;
   }
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikimodori1</title>");            
            out.println("</head>");
            out.println("<body>");
            
            //String data = {"tanaka123", "20001224", "123-0987"}
            //              {"yamada123", "1990220", "234-0987"}
            //              {"suzuki123", "2010110", "345-0987"}
            
            //data[0] = "tanaka123" IDを表示せずdata1を出力 

            //引数として受け取ったIDと同じ配列
           //メソッドを呼び出す形
 
            String[] a = getDatas("tanaka123");
            //String[] a = {"tanaka123", "20001224", "123-0987"};と一緒
            for (int i = 0; i < a.length; i++){
                if(i == 0){
                    continue;
                }
                out.print(a[i]);
            }
            
            
            out.println("<h1>Servlet hikimodori1 at " + request.getContextPath() + "</h1>");
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
