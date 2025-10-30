package poo;
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[3];
        /*
         La pelicula es AGREGACIÓN, ya que una apelicula puede existir sin un actor, por ejemplo una animada
         o una pelicula mimica de stopmotion, de igual manera un actor puede existir sin una pelicula actuando
         por ejemplo en obras de teatro.
         */
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios")
        		.agregarActor(new Actor("Sam Worthington", "Australiano"))
                .agregarActor(new Actor("Zoe Saldaña", "Estadounidense"))
                .agregarActor(new Actor("Sigourney Weaver","Estadounidense"))
                .agregarActor(new Actor("Michelle Rodriguez","Estadounidense"));
        /*
         En java no existen palabras reservadas para las relaciones entre clases
         pero aqui se demuestra la COMPOSICIÓN en que el objeto new Temporada es 
         creado por y para la serie, no puede existir por si solo.
         */
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8)
        		.agregarTemporada(new Temporada(1,10))
        		.agregarTemporada(new Temporada(7,7))
        		.agregarTemporada(new Temporada(8,6));
        /*
         Finalmente un documental presenta la misma relación de AGREGACIÓN que una película,
         un investigador puede existir independientemente de un documental y viceversa.
         */
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy")
        		.agregarInvestigador(new Investigador ("Carl Sagan",62,"Estadounidense"))
        		.agregarInvestigador(new Investigador ("Steven Soter",82,"Estadounidense"))
        		.agregarInvestigador(new Investigador ("Neil deGrasse Tyson",67,"Estadounidense"));

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}