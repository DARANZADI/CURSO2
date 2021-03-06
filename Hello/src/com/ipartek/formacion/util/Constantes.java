package com.ipartek.formacion.util;

/**
 * Clase que sirve para almacenar las constantes del proyecto.
 *
 * @author Administrador.
 */
public final class Constantes {

  private Constantes() {
  }

  // ATRIBUTOS

  /**
   * Atributo que sirve para guardar el dni.
   */
  public static final String ATT_DNI = "dni";
  /**
   * Atributo que sirve para guardar la fecha de nacimiento.
   */
  public static final String ATT_FNACIMIENTO = "fnacimiento";
  /**
   * Atributo que sirve para guardar una <code>List</code> de <code>Curso</code>.
   */
  public static final String ATT_LISTADO_CURSOS = "listado_cursos";
  /**
   * Atributo que sirve para guardar una <code>List</code> de <code>Alumno</code>.
   */
  public static final String ATT_LISTADO_ALUMNOS = "listado_alumnos";
  /**
   * Atributo que sirve para guardar una <code>List</code> de <code>Convocatoria</code>.
   */
  public static final String ATT_LISTADO_CONVOCATORIAS = "listado_convocatoria";
  /**
   * Atributo que sirve para guardar un objeto <code>Mensaje</code>.
   */
  public static final String ATT_MENSAJE = "mensaje";
  /**
   * Atributo que sirve para guardar un objeto <code>Usuario</code>.
   */
  public static final String ATT_USUARIO = "usuario";
  /**
   * Atributo que sirve para guardar un objeto <code>Alumno</code>.
   */
  public static final String ATT_ALUMNO = "alumno";
  /**
   * Atributo que sirve para guardar un objeto <code>Curso</code>.
   */
  public static final String ATT_CURSO = "curso";
  /**
   * Atributo que sirve para guardar un objeto <code>Convocatoria</code>.
   */
  public static final String ATT_CONVOCATORIA = "convocatoria";
  // PARAMETROS
  /**
   * Parametro que sirve para pedir el campo user.
   */
  public static final String PAR_USUARIO = "user";
  /**
   * Parametro que sirve para pedir el campo password.
   */
  public static final String PAR_PASSWORD = "pass";
  /**
   * Parametro que sirve para pedir el campo clave.
   */
  public static final String PAR_CODIGO = "id";
  /**
   * Parametro que sirve para pedir el nombre.
   */
  public static final String PAR_NOMBRE = "nombre";
  /**
   * Parametro que sirve para pedir el apellidos.
   */
  public static final String PAR_APELLIDOS = "apellidos";
  /**
   * Parametro que sirve para pedir el numero de hermanos.
   */
  public static final String PAR_NHERMANOS = "numero_hermanos";
  /**
   * Parametro que sirve para pedir el nombre de la convocatoria.
   */
  public static final String PAR_NOMBRE_CONVOCATORIA = "nombre";
  // URLS O DIRECCIONES WEB
  /**
   * Direcci�n de la p�gina de login.
   */
  public static final String JSP_PAGINA_LOGIN = "login.jsp";
  /**
   * Direcci�n del Servlet que hace login.
   */
  public static final String SERVLET_LOGIN = "login.do";
  /**
   * Direcci�n del Servlet que hace logout.
   */
  public static final String SERVLET_LOGOUT = "logout.do";
  /**
   * Direcci�n del Servlet de <code>Alumno</code>.
   */
  public static final String SERVLET_ALUMNOS = "alumnos.do";
  /**
   * Direcci�n del Servlet de <code>Curso</code>.
   */
  public static final String SERVLET_CURSOS = "curso.do";
  /**
   * Direcci�n del Servlet de <code>Convocatoria</code>.
   */
  public static final String SERVLET_CONVOCATORIAS = "convocatorias.do";
  /**
   * Direcci�n de la carpeta del backoffice.
   */
  public static final String RUTA_BACKUP = "backup/";

  /**
   * Direcci�n de la p�gina principal del back.
   */
  public static final String JSP_BACK_INDEX = Constantes.RUTA_BACKUP + "index.jsp";
  /**
   * Direcci�n del formulario de alumnos.
   */
  public static final String JSP_BACK_ALUMNO_FORM = Constantes.RUTA_BACKUP + "alumnos/form.jsp";
  /**
   * Direcci�n del listado de alumnos.
   */
  public static final String JSP_BACK_INDEX_ALUMNO = Constantes.RUTA_BACKUP + "alumnos/alumnos.jsp";
  /**
   * Direcci�n del formulario de cursos.
   */
  public static final String JSP_BACK_CURSO_FORM = Constantes.RUTA_BACKUP + "cursos/formulario.jsp";
  /**
   * Direcci�n del listado de cursos.
   */
  public static final String JSP_BACK_CURSO_LISTADO = Constantes.RUTA_BACKUP + "cursos/listado.jsp";
  /**
   * Direcci�n del listado de convocatorias.
   */
  public static final String JSP_BACK_CONVOCATORIA_LISTADO = Constantes.RUTA_BACKUP
      + "convocatorias/listado.jsp";
  /**
   * Direcci�n del formulario de convocatorias.
   */
  public static final String JSP_BACK_CONVOCATORIA_FORM = Constantes.RUTA_BACKUP
      + "convocatorias/form.jsp";

  // OPERACIONES
  /**
   * Atributo o parametro para que indica el nombre del valor operacion.
   */
  public static final String OP_KEY = "operation";
  /**
   * Operaci�n de actualizar todos los registros.
   */
  public static final int OP_UPDATE = 0; // Actualizar Registro
  /**
   * Operaci�n de eliminar todos los registros.
   */
  public static final int OP_DELETE = 1; // Eliminar Registro
  /**
   * Operaci�n de crear todos los registros.
   */
  public static final int OP_LIST = 2; // Listar todos los Regsitros
  /**
   * Operacion de vista de detalle por id.
   */
  public static final int OP_DETAIL = 3; // Mostrar Detalle Registro
  /**
   * Operacion de vista de crear un nuevo registro.
   */
  public static final int OP_CREATE = 4; // Crear o insertar Registro

}
