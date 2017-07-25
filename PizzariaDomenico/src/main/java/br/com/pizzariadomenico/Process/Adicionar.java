/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pizzariadomenico.Process;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonat
 */
@WebServlet(name = "Adicionar", urlPatterns = {"/Adicionar"})
public class Adicionar extends HttpServlet {
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        HttpSession sessao = request.getSession();
        if (sessao.getAttribute("logado") == null) {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/Entrar");
            dispatcher.forward(request, response);
        } else {
            Produto pizza = new Produto();
            if (request.getParameter("nome").equalsIgnoreCase("")) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Manutencao");
                dispatcher.forward(request, response);
            }
            pizza.setNome(request.getParameter("nome"));
            pizza.setDescricao(request.getParameter("descricao"));
            pizza.setPreco(request.getParameter("preco"));
            pizza.setTipo(request.getParameter("tipo"));

            try {
                Utils.inserirPizza(pizza);
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Manutencao");
                response.setContentType("UTF-8");
                dispatcher.forward(request, response);
            } catch (Exception ex) {
                RequestDispatcher dispatcher = request.getRequestDispatcher("/Manutencao");
                dispatcher.forward(request, response);
            }
        }
    }
}
