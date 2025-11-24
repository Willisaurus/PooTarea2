package PruebaAudioVisualDatos;

import pruebaAudioVisualModelo.*;
import java.io.*;
import java.util.ArrayList;

public class GestionDeArchivos
{
    private static final String RutaArchivos = "datos.csv";

    public void guardarDatos(ArrayList<ContenidoAudiovisual> listaDeContenidos)
    {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RutaArchivos)))
        {
            writer.write("TIPO;DATO1;DATO2;DATO3;DATO4");
            writer.newLine();
            for (ContenidoAudiovisual contenido : listaDeContenidos)
            {
                if (contenido instanceof Pelicula)
                {
                    Pelicula p = (Pelicula) contenido;
                    writer.write("PELICULA;" + p.getTitulo() + ";" + p.getDuracionEnMinutos() + ";" + p.getGenero()
                            + ";" + p.getEstudio());
                    writer.newLine();
                    for (Actor actor : p.getActores())
                    {
                        writer.write("ACTOR;" + actor.getNombreActor() + ";" + actor.getNacionalidad());
                        writer.newLine();
                    }
                }
                else if (contenido instanceof SerieDeTV)
                {
                    SerieDeTV s = (SerieDeTV) contenido;
                    writer.write("SERIE;" + s.getTitulo() + ";" + s.getDuracionEnMinutos() + ";" + s.getGenero()
                            + ";" + s.getTemporadas());
                    writer.newLine();
                    for (Temporada t : s.getListaDeTemporadas())
                    {
                        writer.write("TEMPORADA;" + t.getTemporadas() + ";" + t.getCantidadCapitulos());
                        writer.newLine();
                    }
                }
                else if (contenido instanceof Documental)
                {
                    Documental d = (Documental) contenido;
                    writer.write("DOCUMENTAL;" + d.getTitulo() + ";" + d.getDuracionEnMinutos() + ";"
                            + d.getGenero() + ";" + d.getTema());
                    writer.newLine();
                    for (Investigador i : d.getListaDeInvestigadores())
                    {
                        writer.write("INVESTIGADOR;" + i.getNombreInvestigador() + ";" + i.getNacionalidadInvestigador()
                                + ";" + i.getEdadInvestigador());
                        writer.newLine();
                    }
                }
                else if (contenido instanceof Publicidad)
                {
                    Publicidad pub = (Publicidad) contenido;
                    writer.write("PUBLICIDAD;" + pub.getTitulo() + ";" + pub.getDuracionEnMinutos() + ";" + pub.getGenero()
                            + ";" + pub.getAnunciante() + ";" + pub.getProductora());
                    writer.newLine();
                    for (Actor actor : pub.getActores())
                    {
                        writer.write("ACTOR;" + actor.getNombreActor() + ";" + actor.getNacionalidad());
                        writer.newLine();
                    }
                }
                else if (contenido instanceof Podcast)
                {
                    Podcast pod = (Podcast) contenido;
                    writer.write("PODCAST;" + pod.getTitulo() + ";" + pod.getDuracionEnMinutos() + ";" + pod.getGenero()
                            + ";" + pod.getHost() + ";" + pod.getTotalCapitulos());
                    writer.newLine();

                    // Guardamos sus INVITADOS debajo
                    for (Invitado invitado : pod.getInvitados())
                    {
                        writer.write("INVITADO;" + invitado.getNombreInvitado() + ";" + invitado.getNacionalidadInvitado());
                        writer.newLine();
                    }
                }
            }

        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public ArrayList<ContenidoAudiovisual> cargarDatos()
    {
      ArrayList<ContenidoAudiovisual> listaLeida = new ArrayList<>();
      File archivo = new File(RutaArchivos);
      if (!archivo.exists())
      {
          System.out.println("No se encontro ningun archivo de datos");
          return listaLeida;
      }
      try (BufferedReader reader = new BufferedReader(new FileReader(RutaArchivos)))
      {
          String linea;
          ContenidoAudiovisual contenidoActual = null;
          while ((linea = reader.readLine()) != null) {
              if ((linea.trim().isEmpty()) || linea.startsWith("TIPO"))
                  continue;
              String[] partes = linea.split(";");
              String tipo = partes[0];
              if (tipo.equals("PELICULA")) {
                  String titulo = partes[1];
                  int duracion = Integer.parseInt(partes[2]);
                  String genero = partes[3];
                  String estudio = partes[4];

                  Pelicula p = new Pelicula(titulo, duracion, genero, estudio);
                  contenidoActual = p;
                  listaLeida.add(p);
              } else if (tipo.equals("SERIE")) {
                  SerieDeTV s = new SerieDeTV(partes[1], Integer.parseInt(partes[2]), partes[3], Integer.parseInt(partes[4]));
                  contenidoActual = s;
                  listaLeida.add(s);
              } else if (tipo.equals("ACTOR")) {
                  if (contenidoActual instanceof Pelicula) {
                      Actor actor = new Actor(partes[1], partes[2]);
                      ((Pelicula) contenidoActual).agregarActor(actor);
                  } else if (contenidoActual instanceof Publicidad) {
                      Actor actor = new Actor(partes[1], partes[2]);
                      ((Publicidad) contenidoActual).agregarActor(actor);
                  }
              } else if (tipo.equals("TEMPORADA")) {
                  if (contenidoActual instanceof SerieDeTV) {
                      Temporada t = new Temporada(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]));
                      ((SerieDeTV) contenidoActual).agregarTemporada(t);
                  }
              } else if (tipo.equals("DOCUMENTAL")) {
                  Documental d = new Documental(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4]);
                  contenidoActual = d;
                  listaLeida.add(d);
              } else if (tipo.equals("INVESTIGADOR")) {
                  if (contenidoActual instanceof Documental) {
                      Investigador i = new Investigador(partes[1], Integer.parseInt(partes[3]), partes[2]);
                      ((Documental) contenidoActual).agregarInvestigador(i);
                  }
              } else if (tipo.equals("PUBLICIDAD")) {
                  Publicidad pub = new Publicidad(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4], partes[5]);
                  contenidoActual = pub;
                  listaLeida.add(pub);
              } else if (tipo.equals("PODCAST")) {
                  Podcast pod = new Podcast(partes[1], Integer.parseInt(partes[2]), partes[3], partes[4], Integer.parseInt(partes[5]));
                  contenidoActual = pod;
                  listaLeida.add(pod);
              } else if (tipo.equals("INVITADO")) {
                  if (contenidoActual instanceof Podcast) {
                      Invitado invitado = new Invitado(partes[1], partes[2]);
                      ((Podcast) contenidoActual).agregarInvitado(invitado);
                  }
              }
          }
      }
      catch (IOException e)
      {
          System.err.println("Error leyendo el archivo: " + e.getMessage());
      }
      catch (NumberFormatException e)
      {
          System.err.println("Error convirtiendo numeros en el archivo: ");
      }
      return listaLeida;
    }
}

