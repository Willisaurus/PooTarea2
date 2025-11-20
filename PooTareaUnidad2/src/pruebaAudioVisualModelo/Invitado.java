package pruebaAudioVisualModelo;

public class Invitado {

    private String nombreInvitado;
    private String nacionalidadInvitado;

    public Invitado(String nombreInvitado, String nacionalidadInvitado) {
        super();
        this.nombreInvitado = nombreInvitado;
        this.nacionalidadInvitado = nacionalidadInvitado;
        // (Se eliminó la inicialización de la lista de aquí)
    }

    public String getNombreInvitado() {
        return nombreInvitado;
    }

    public void setNombreInvitado(String nombreInvitado) {
        this.nombreInvitado = nombreInvitado;
    }

    public String getNacionalidadInvitado() {
        return nacionalidadInvitado;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidadInvitado = nacionalidadInvitado;
    }

}