/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariadomenico.Process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jonat
 */
@WebServlet(name = "GetSabores", urlPatterns = {"/GetSabores"})
public class GetSabores extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, Exception {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        List<Produto> pizzasComuns = Utils.ListarPizzasPaginaInicialComum();
        List<Produto> pizzasDoces = Utils.ListarPizzasPaginaInicialDoces();
        List<Produto> bebidas = Utils.ListarPizzasPaginaInicialBebidas();
        List<Produto> promo = Utils.ListarPizzasPaginaInicialPromocoes();
        request.setAttribute("salgadas", pizzasComuns);
        request.setAttribute("pizzasdoces", pizzasDoces);
        request.setAttribute("bebidas", bebidas);
        for (Produto prod : promo){
            String promoConvert = prod.getDescricao().replaceAll("\n", "<br/>");
            prod.setDescricao(promoConvert);
        }
        request.setAttribute("promocoes", promo);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(GetSabores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
