package pruebaAudioVisual.modelo;

// No se necesita "import java.util.ArrayList;"

public class Invitado {
    /*
    Al ser invitado un campo muy similar a actor se reutiliza el codigo de la clase Actor
    reemplazando simplemente las variables de actor a invitado, fomentando reutilizacion
    del codigo y modularidad.
     */
    private String nombreInvitado;
    private String nacionalidadInvitado;
    // (Se eliminó la lista de invitados que estaba aquí)

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
    public Invitado(String nombreInvitado, String nacionalidadInvitado) {
        super();
        this.nombreInvitado = nombreInvitado;
        this.nacionalidadInvitado = nacionalidadInvitado;
        // (Se eliminó la inicialización de la lista de aquí)
    }

}