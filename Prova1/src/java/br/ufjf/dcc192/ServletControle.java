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
@WebServlet(urlPatterns = {"/ServletControle.html", "/Eventos.html", "/SolicitarHospedagem.html"})
public class ServletControle extends HttpServlet {

    private RequestDispatcher despachante;
    List<Evento> evento = new ListaEventos().getInstance();
    List<Pessoa> listaInscritos = new ListaInscritos().getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if ("/ServletControle.html".equals(request.getServletPath())) {
            despachante = request.getRequestDispatcher("WEB-INF/jsp/ControleComunidade.jsp");
            despachante.forward(request, response);
        } else if ("/Eventos.html".equals(request.getServletPath())) {
            request.setAttribute("evento", evento);
            despachante = request.getRequestDispatcher("WEB-INF/jsp/Eventos.jsp");
            despachante.forward(request, response);
        } else if ("/SolicitarHospedagem.html".equals(request.getServletPath())) {
            despachante = request.getRequestDispatcher("WEB-INF/jsp/SolicitarHospedagem.jsp");
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

            for (int i = 0; i < evento.size(); i++) {
                if (evento.get(i).getNome() == nomeEvento) {
                    evento.get(i).decrementarLimite();      //decrementa 1 no limite de pessoas no evento
                }
            }

            listaInscritos.add(new Pessoa(tipo, nomeInscrito, tempo));
            request.setAttribute("evento", evento);
            //request.setAttribute("produto", pedidos.get(id).getLista());
        }
        response.sendRedirect("ServletControle.html");
    }

}
