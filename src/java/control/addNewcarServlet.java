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
import model.Car;

/**
 *
 * @author supam
 */
@WebServlet(name = "addNewcarServlet", urlPatterns = {"/addNewcarServlet"})
public class addNewcarServlet extends HttpServlet {

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
        
             String carName =  request.getParameter("carName");
            out.println("ชื่อรถ:"+carName+"<br>");
    
            String carbrand = request.getParameter("carbrand");
            out.println("ยี่ห้อ:"+carbrand+"<br>");
                    
           String carseat = request.getParameter("carseat");
           out.println("จำนวนที่นั่ง:"+carseat+"ที่นั่ง"+"<br>");
           
            int carcc =Integer.parseInt(request.getParameter("carcc"));
            out.println("ขนาดเครื่องยนต์:" +  carcc  + " cc "+"<br>");
            
            int carprice =Integer.parseInt(request.getParameter("carprice"));
            out.println("ราคา:" +  carprice  + " THB "+"<br>");
            
            HttpSession session = request.getSession();
            
            Car car =new Car();
            car.setCarName(carName);
            car.setCarbrand(carbrand);
            car.setCarseat(carseat);
            car.setCarcc(carcc);
            car.setCarprice(carprice);
            session.setAttribute("car", car);
            
           request.getRequestDispatcher("/updatecar.jsp").forward(request, response);
         
         
         
         
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
