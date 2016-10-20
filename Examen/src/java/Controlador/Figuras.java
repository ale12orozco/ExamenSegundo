
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
//@WebServlet(urlPatterns = {"/Figuras"})
public class Figuras extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            int opcion = Integer.parseInt(request.getParameter("ok"));
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Examen Figuras</title>");            
            out.println("</head>");
            out.println("<body>");
            
            if (opcion == 1){
               out.println("<h1>Cuadrado</h1>");
               out.println("lado");
               
               out.println("<input type='text' name='lado'>");
               out.println("<input type='button' value='area' name='o' >");
               out.println("<input type='button' value='perimetro' name='o' >");
             
               String operacion = request.getParameter("o");
               if (operacion == "area"){
                   int num = Integer.parseInt(request.getParameter("lado"));
                   int result = num*num;
                   out.println("<h1>El Area es:</h1>");
                   out.println(result);
               }
               else if(operacion == "perimetro"){
                   int num = Integer.parseInt(request.getParameter("lado"));
                   int resu = num*4;
                   out.println("<h1>El Perimetro es:</h1>");
                   out.println(resu);
               }
               
            }
            else if (opcion == 2)  {
               out.println("<h1>Circulo</h1>");
               out.println("Diametro");
              
               out.println("<input type='text' name='diam'>");
               out.println("<input type='button' value='area' name='o'>");
               
               
               String operacion = request.getParameter("o");
               if (operacion == "area"){
                   int num = Integer.parseInt(request.getParameter("diam"));
                   double radio = num/2;
                   double resulta = 3.14*radio*radio;
                   out.println("<h1>El Area es:</h1>");
                   out.println(resulta);
               }
             
                
            }
            out.println("<br><br>");
            out.println("<form  action=\"index.html\">");
            out.println("<input type=\"submit\" value=\"Regresar\" name=\"ok\">");
            out.println("</form>");
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
       
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

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

