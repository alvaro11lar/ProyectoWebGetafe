package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Alumno;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormularioServlet
 */
public class FormularioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Alumno> caja;

    /**
     * Default constructor. 
     */
    public FormularioServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		caja = new ArrayList<Alumno>();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre= request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		String asignatura = request.getParameter("asignatura");
		String descripcion = request.getParameter("mensaje");
		Alumno alumno = new Alumno(nombre,apellido,sexo,asignatura,descripcion);
		caja.add(alumno);
		response.setContentType("text/html");
		for(Alumno a : caja) {
			response.getWriter().append("<h2> Bienvenido "  + a.getNombre()  + " "  + a.getApelllido() + " " + a.getSexo() + a.getAsignatura() + a.getDescripcion() + "</h2>");
		}
		//System.out.println("Bienvenido" + alumno.getNombre()  + " "  + alumno.getApelllido() );
		//response.setContentType("text/html");
		//response.getWriter().append("<h2> Bienvenido "  + nombre  + " "  + apellido + "</h2>");
	}

}
