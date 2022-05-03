package Controller;

import java.util.ArrayList;

import Logic.Cronometro;
import Logic.Participante;
import Logic.Proyecto;
import Logic.Actividad;
import Logic.TipoActividad;



public class Controlador {

    //Atributos
    //private ArrayList<Proyecto> proyectos;
    private Proyecto proyecto;
    //private ArrayList<Participante> participantes;
    private Cronometro timer = new Cronometro();

    public Controlador() {
        this.proyecto = new Proyecto();
    }

    //Todas estas funciones sirven como mediador entre la consola y la l�gica. Esto es para un menor acoplamiento


    //Este m�todo crea un participante, a partir de los par�metros nombre y correo. Y lo a�ade a la vez a una lista de participantes.
    public Participante crearParticipante(String nombre, String correo) {
        Participante participante = new Participante(nombre, correo);
        proyecto.getParticipantes().add(participante);
        return participante;
    }

    //Este m�todo crea un proyecto, a partir de los par�metros. Y lo a�ade a la vez a una lista de proyectos.
    //Adem�s, se le asigna actum�ticamente el participante propietario del proyecto y se agrega a la lista de participantes.
    /*public Proyecto crearProyecto(String nombreP, String descripcion, String fechaInicio, String fechaFinalizacion, Participante propietario) {
        Proyecto proyecto = new Proyecto(nombreP, descripcion, fechaInicio, fechaFinalizacion, propietario);
        proyecto.agregarParticipante(propietario);
        proyectos.add(proyecto);

        return proyecto;
    }*/

    public Proyecto crearProyecto(String nombreP, String descripcion, String fechaInicio, String fechaFinalizacion) {
        Proyecto proyecto = new Proyecto(nombreP, descripcion, fechaInicio, fechaFinalizacion);
        return proyecto;
    }


    //Este m�todo crea una actividad, a partir de los par�metros. Y lo a�ade a la vez a una lista de actividades en el proyecto.
    public Actividad crearActividad(String titulo, String descripcion, TipoActividad tipo, String fecharealizacion, String horainicio, String horafin, Participante participante) {
        Actividad actividad = new Actividad(titulo, descripcion, tipo, fecharealizacion, horainicio, horafin, participante);
        proyecto.agregarActividad(actividad);
        return actividad;

    }


    //Getters and Setters

    public Participante obtenerParticipante(int idParticipante) {
        return proyecto.getParticipantes().get(idParticipante - 1);
    }

   public Proyecto obtenerProyecto() {
        return proyecto;
    }

    public void startCronometro() {
        timer.startTime();
    }

    public int getTiempo() {
        return timer.tiempoEnMins();
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

}
