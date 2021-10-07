/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.calvat;

/**
 *
 * @author supam
 */
@WebServlet(name = "calservlet", urlPatterns = {"/calservlet"})
public class calservlet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {

            int carprice =Integer.parseInt(request.getParameter("carprice"));
            out.println("ราคา(ยอดจัด):" +  carprice  + " THB "+"<br>");
            
            int caryear =Integer.parseInt(request.getParameter("caryear"));
            out.println("ระยะเวลา(ปี):" +  caryear  + " Year "+"<br>");
            
            int carmonth =Integer.parseInt(request.getParameter("carmonth"));
            out.println("ระยะเวลา(เดือน):" +  carmonth  + " Month"+"<br>");
            
            float carvat =Float.parseFloat(request.getParameter("carvat"));
            out.println("ค่าดอกเบี้ย:" +  carvat  + " % "+"<br>");
            
            
            out.println("รวมดอกเบี้ย:" + (( carprice  * carvat )*caryear)+"THB"+"<br>");
            
            out.println("ยอดรวมที่จะต้องจ่ายทั้งหมด:"+(carprice+(( carprice  * carvat )*caryear))+"THB"+"<br>");
           
            out.println("สรุปต้องจ่ายทั้งหมดเดือนละ:"+(carprice+(( carprice  * carvat )*caryear))/carmonth +"THB"+"<br>");
            
             out.println("<a href=\"index.html\">Back to index </a><br>");
            out.println("<h1><marquee>ขอบคุณครับ</marquee></h1>");
           

            HttpSession session = request.getSession();

            calvat cal = new calvat();
            cal.setCarprice(carprice);
            cal.setCaryear(caryear);
            cal.setCarmonth(carmonth);
            cal.setCarvat(carvat);
            session.setAttribute("cal", cal);

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
