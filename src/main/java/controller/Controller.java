
package controller;
import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DAO;
import model.JavaBeans;
import model.Rank;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 */
@WebServlet(urlPatterns = { "/Controller", "/iniciar", "/proxima", "/gameover", "/rankear", "/novorank", "/rank" })
public class Controller extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The dao. */
	DAO dao = new DAO();
	
	/** The rank. */
	Rank rank = new Rank();
	
	/** The lista. */
	ArrayList<JavaBeans> lista = dao.lerPergunta();
	
	/** The pergunta. */
	JavaBeans pergunta = new JavaBeans();

	/**
	 * Instantiates a new controller.
	 */
	public Controller() {
		super();

	}

	/**
	 * Do get.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();

		if (action.equals("/iniciar")) {
			enviarPergunta(request, response);
		} else {
			if (action.equals("/proxima")) {
				proximaPergunta(request, response);

			} else {
				if (action.equals("/gameover")) {
					enviarPontos(request, response);

				} else {
					if (action.equals("/rankear")) {
						criarRank(request, response);

					} else {
						if (action.equals("/novorank")) {
							novoRank(request, response);

						} else {
							if (action.equals("/rank")) {
								enviarRank(request, response);
							}
						}
					}
				}
			}
		}

	}

	/**
	 * Enviar pergunta.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void enviarPergunta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Collections.shuffle(lista);
		response.sendRedirect("proxima?id=0");
	}

	/**
	 * Proxima pergunta.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void proximaPergunta(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int idnum = Integer.valueOf(request.getParameter("id"));

		request.setAttribute("id", idnum);
		request.setAttribute("pergunta", lista.get(idnum).getPergunta());
		request.setAttribute("resp1", lista.get(idnum).getResp1());
		request.setAttribute("resp2", lista.get(idnum).getResp2());
		request.setAttribute("resp3", lista.get(idnum).getResp3());
		request.setAttribute("resp4", lista.get(idnum).getResp4());
		request.setAttribute("respcerta", lista.get(idnum).getRespcerta());

		RequestDispatcher rd = request.getRequestDispatcher("jogo.jsp");
		rd.forward(request, response);

	}

	/**
	 * Enviar pontos.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void enviarPontos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		request.setAttribute("pontos", request.getParameter("pontos"));

		RequestDispatcher rd = request.getRequestDispatcher("gameover.jsp");
		rd.forward(request, response);

	}

	/**
	 * Criar rank.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void criarRank(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pontos = request.getParameter("pontos");
		request.setAttribute("pontos", pontos);
		RequestDispatcher rd = request.getRequestDispatcher("novorank.jsp");
		rd.forward(request, response);
	}

	/**
	 * Novo rank.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void novoRank(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String pontuacao = request.getParameter("pontos");
		int pontos = Integer.valueOf(pontuacao);
		String nome = request.getParameter("nome");

		rank.setPontos(pontos);
		rank.setNome(nome);

		dao.inserirRank(rank);
		response.sendRedirect("rank");

	}

	/**
	 * Enviar rank.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void enviarRank(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<Rank> rank = dao.enviarRank();
		request.setAttribute("rank", rank);
		RequestDispatcher rd = request.getRequestDispatcher("rank.jsp");
		rd.forward(request, response);

	}
}
