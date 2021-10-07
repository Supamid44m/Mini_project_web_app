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
import model.Comment;

/**
 *
 * @author supam
 */
@WebServlet(name = "addcommentServlet", urlPatterns = {"/addcommentServlet"})
public class addcommentServlet extends HttpServlet {

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
            
            String commentName=  request.getParameter("commentName");
            out.println("Username:"+commentName+"<br>");
            
            String commentTitle = request.getParameter("commentTitle");
            out.println("Title:"+commentTitle+"<br>");
            
            String commentText = request.getParameter("commentText");
            out.println("Comment:"+commentText+"<br>");
            
            String commentDate = request.getParameter("commentDate");
            out.println("Date:"+commentDate+"<br>");
            
            String commentTime = request.getParameter("commentTime");
            out.println("Time:"+commentTime+"<br>");
            
            
            out.println("<a href=\"addcommentofirebase.jsp\">save to Firebase </a><br>");
            out.println("<a href=\"index.html\">Back to index </a><br>");
            out.println("<h1><marquee>ขอบคุณครับ</marquee></h1>");
            HttpSession session = request.getSession();
            
            Comment comment = new Comment();
            comment.setCommentName(commentName);
            comment.setCommentTitle(commentTitle);
            comment.setCommentText(commentText);
            comment.setCommentDate(commentDate);
            comment.setCommentTime(commentTime);
            session.setAttribute("comment", comment);
            
            ///ไปหน้าอัปเดตข้อมูล
            ///request.getRequestDispatcher("/updatecomment.jsp").forward(request, response);
            
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
