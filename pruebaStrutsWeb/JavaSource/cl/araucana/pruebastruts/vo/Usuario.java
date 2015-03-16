/*
 * Creado el 14-12-2007
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package cl.araucana.pruebastruts.vo;

/**
 * @author Alumno
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class Usuario {
	String rut;
	String password;
	
	public Usuario(){}
	
	public Usuario(String r,String p){
		this.rut = r;
		this.password = p;
	}
	
	
	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @return
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param string
	 */
	public void setPassword(String string) {
		password = string;
	}

	/**
	 * @param string
	 */
	public void setRut(String string) {
		rut = string;
	}

}
