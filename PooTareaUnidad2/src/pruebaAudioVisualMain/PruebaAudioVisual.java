package pruebaAudioVisualMain;
import pruebaAudioVisualControlador.ControladorProyecto;
import pruebaAudioVisualModelo.*;

public class PruebaAudioVisual
{
	public static void main(String[] args)
    {

        System.out.println("Hello from Eclipse!");

        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios")
        		.agregarActor(new Actor("Sam Worthington", "Australiano"))
                .agregarActor(new Actor("Zoe Saldaña", "Estadounidense"))
                .agregarActor(new Actor("Sigourney Weaver","Estadounidense"))
                .agregarActor(new Actor("Michelle Rodriguez","Estadounidense"));

        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8)
        		.agregarTemporada(new Temporada(1,10))
        		.agregarTemporada(new Temporada(7,7))
        		.agregarTemporada(new Temporada(8,6));

        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy")
        		.agregarInvestigador(new Investigador("Carl Sagan",62,"Estadounidense"))
        		.agregarInvestigador(new Investigador ("Steven Soter",82,"Estadounidense"))
        		.agregarInvestigador(new Investigador ("Neil deGrasse Tyson",67,"Estadounidense"));

        contenidos[3] = new Publicidad("The One new spot", 2, "Comercial", "Dolce & Gabanna", "Martin Scorsese")
                //reutiliazcion de metodos para anadir actores y relacionando neuvamente las clases
                .agregarActor(new Actor("Scarlett Johansson", "Estadounidense"))
                .agregarActor(new Actor("Matthew McConaughey", "Estadounidense"));
        contenidos [4] = new Podcast("COMPUESTOS Podcast", 70, "Finanzas", "Andres Garza", 39)
                    .agregarInvitado(new Invitado("Ari Borovoy", "Mexicano"))
                    .agregarInvitado(new Invitado("Simon Cohen", "Mexicano"));

        ControladorProyecto InstanciacionControlador = new ControladorProyecto(contenidos);
        InstanciacionControlador.mostrarContenidos();
        InstanciacionControlador.guardarDatosEnArchivo();
    }
}