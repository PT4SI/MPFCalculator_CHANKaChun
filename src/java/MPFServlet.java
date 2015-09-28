/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author a1
 */
@WebServlet(urlPatterns = {"/MPFServlet"})
public class MPFServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter(); 
       out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MPFServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MPF Calculation Result</h1>");
       
        try  {
            /* TODO output your page here. You may use following sample code. */
            out.println("Nice to meet you " + request.getParameter("fname") + " " + request.getParameter("lname") + "<br>");
            out.println("Your total MPF payment after " + request.getParameter("now") + " years will be $" + (Double.parseDouble(request.getParameter("ms")) *Double.parseDouble(request.getParameter("now")) * 0.05*12));  
                        out.println("<br> <a href=\""+request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+"/MPFCalculator_ChanKaChun/"+"\">Back Page</a>");
        }catch(Exception e){
            out.println("Number convserion error!");
            out.println("<a href=\""+request.getScheme() + "://"+request.getServerName()+":"+request.getServerPort()+"/MPFCalculator_ChanKaChun/"+"\">Back Page</a>");
        }finally{
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
