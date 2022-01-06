/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.solutec.servlet;

import fr.solutec.dao.MemoDAO;
import fr.solutec.model.Memo;
import fr.solutec.model.User;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dsi
 */
@WebServlet(name = "Privee", urlPatterns = {"/Privee"})
public class Privee extends HttpServlet {

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
            out.println("<title>Servlet Privee</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Privee at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        User u = (User) session.getAttribute("userConnect");
        
        String login = ConnexionServlet.login;
        String prenom = ConnexionServlet.u.getPrenom();
        String nom = ConnexionServlet.u.getNom();
        
        request.setAttribute("msg", "Vous êtes désormais connecté ");
        request.setAttribute("login", login);
        request.setAttribute("prenom", prenom);
        request.setAttribute("nom", nom);
        
        
        if (u != null) {
            
            try {
                List<Memo> pmemos = MemoDAO.getPrivateMemo();
                request.setAttribute("memos", pmemos);
                request.setAttribute("user", u);
                request.getRequestDispatcher("WEB-INF/menuprive.jsp").forward(request, response);

            } catch (Exception e) {
                PrintWriter out = response.getWriter();
                out.println("exp : " + e.getMessage());
            }
            
        } else {
            request.setAttribute("msg", "Attention vous devez vous connecter !");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
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
