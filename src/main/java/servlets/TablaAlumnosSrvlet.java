package servlets;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Alumno;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TablaAlumnosSrvlet
 */
public class TablaAlumnosSrvlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   private List<Alumno> alumnos;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TablaAlumnosSrvlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	@Override
	public void init(ServletConfig config) throws ServletException {
		
		alumnos = new ArrayList<Alumno>();
	}



	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombre= request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String sexo = request.getParameter("sexo");
		String asignatura = request.getParameter("asignatura");
		String descripcion = request.getParameter("mensaje");
		Alumno alumno = new Alumno(nombre,apellido,sexo,asignatura,descripcion);		

        alumnos.add(alumno);
        request.setAttribute("alumno", alumno);
		RequestDispatcher rd = request.getRequestDispatcher("tablaAlumnos.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
