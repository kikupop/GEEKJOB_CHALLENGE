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
public class hikimodori2 extends HttpServlet {

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
    //一人、住所null
    //引数で受け取った文字列とIDが一致する人の情報配列を戻り値
    String[] getDatas(String prof){
    String[] data1 = {"0", "20001224", null};
    String[] data2 = {"1", "1990220", "234-0987"};
    String[] data3 = {"2", "2010110", "345-0987"};
    
   
    
    if(prof.equals (data1[0])){
    return data1;
    
    }else if(prof.equals (data2[0])){
        return data2;
        
    }else if(prof.equals (data3[0])){
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
            out.println("<title>Servlet hikimodori2</title>");            
            out.println("</head>");
            out.println("<body>");
            
            
            //3人のプロフすべて表示　null部分はcontinueでスキップ
            //Aはdata1群
            
            //for(int j)は表示回数、人数
            //String s = String.valueOf(i);数値を文字列に変換
            
            for (int j = 0; j < 3; j++){
                String id=String.valueOf(j);
                String[] A =getDatas(id);

                for (int i = 0; i < A.length; i++){
                    if(A[i] == null){
                    continue;
                }
                    out.print (A[i]);
                }
            //
            
            
                
            }
            
            out.println("<h1>Servlet hikimodori2 at " + request.getContextPath() + "</h1>");
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
