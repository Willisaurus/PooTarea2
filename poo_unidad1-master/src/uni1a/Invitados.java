package uni1a;

import java.util.ArrayList;

public class Invitados {
    /*
    Al ser invitado un campo muy similar a actor se reutiliza el codigo de la clase Actor
    reemplazando simplemente las variables de actor a invitado, fomentando reutilizacion
    del codigo y modularidad.
     */
    private String nombreInvitado;
    private String nacionalidadInvitado;
    private ArrayList<Invitados> invitados;
    //getter y setter para el campo nombreInvitado
    public String getNombreInvitado() {
        return nombreInvitado;
    }

    public void setNombreInvitado(String nombreInvitado) {
        this.nombreInvitado = nombreInvitado;
    }
    //getter y setter para el campo nacionalidadInvi
    public String getNacionalidadInvitado() {
        return nacionalidadInvitado;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidadInvitado = nacionalidadInvitado;
    }
    //constructor Invitadp
    public Invitados(String nombreInvitado, String nacionalidadInvitado) {
        super();
        this.nombreInvitado = nombreInvitado;
        this.nacionalidadInvitado = nacionalidadInvitado;
        this.invitados = new ArrayList<>();
    }


}
