package br.ufjf.dcc192;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ice
 */
@WebServlet(urlPatterns = {"/ServletControle.html", "/Eventos.html", "/SolicitarHospedagem.html","/Inscritos.html"})
public class ServletControle extends HttpServlet {

    private RequestDispatcher despachante;
    List<Evento> listaEventos = new ListaEventos().getInstance();
    List<Pessoa> listaInscritos = new ListaInscritos().getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if ("/ServletControle.html".equals(request.getServletPath())) {
            despachante = request.getRequestDispatcher("WEB-INF/jsp/ControleComunidade.jsp");
            despachante.forward(request, response);
        } else if ("/Eventos.html".equals(request.getServletPath())) {
            request.setAttribute("evento", listaEventos);
            despachante = request.getRequestDispatcher("WEB-INF/jsp/Eventos.jsp");
            despachante.forward(request, response);
        } else if ("/SolicitarHospedagem.html".equals(request.getServletPath())) {
            despachante = request.getRequestDispatcher("WEB-INF/jsp/SolicitarHospedagem.jsp");
            despachante.forward(request, response);       
        } else if ("/Inscritos.html".equals(request.getServletPath())) {
            request.setAttribute("inscritos", listaInscritos);
            despachante = request.getRequestDispatcher("WEB-INF/jsp/Inscritos.jsp");
            despachante.forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if ("/SolicitarHospedagem.html".equals(request.getServletPath())) {
            String nomeEvento = request.getParameter("nomeEvento");
            String nomeInscrito = request.getParameter("nomeInscrito");
            String tipo = request.getParameter("tipo");
            Integer tempo = Integer.parseInt(request.getParameter("tempo"));
            
            //verifica se o evento desejado ja se encontra cadastrado e decrementa limite de pessoas
            for (int i = 0; i < listaEventos.size(); i++) {
                if (listaEventos.get(i).getNome() == nomeEvento) {  
                    listaEventos.get(i).decrementarLimite();      
                    listaEventos.get(i).incrementaInscritos();   
                }
            }

            //adiciona a lista de inscritos a pessoa
            listaInscritos.add(new Pessoa(tipo, nomeInscrito, tempo));
            request.setAttribute("evento", listaEventos);
            //request.setAttribute("produto", pedidos.get(id).getLista());
        }
        response.sendRedirect("ServletControle.html");
    }

}
