package entities;

public class Alumno {
	
	private String nombre;
	private String apelllido;
	private String sexo;
	private String asignatura;
	private String descripcion;
	
	public Alumno(String nombre, String apelllido, String sexo, String asignatura, String descripcion) {
		super();
		this.nombre = nombre;
		this.apelllido = apelllido;
		this.sexo = sexo;
		this.asignatura = asignatura;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApelllido() {
		return apelllido;
	}

	public void setApelllido(String apelllido) {
		this.apelllido = apelllido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
