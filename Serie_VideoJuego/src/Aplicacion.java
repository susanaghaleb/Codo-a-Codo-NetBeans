
public class Aplicacion {
    public static void main(String[] args) {
  
        //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[] = new Serie[5];
        VideoJuego listaVideojuegos[] = new VideoJuego[5];
  
        //Creamos un objeto en cada posicion del array
        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Friends", "David Crane & Marta Kauffman");
        listaSeries[2] = new Serie("The Big Bang Theory", 10, "Comedia", "Chuck Lorre & Bill Prady");
        listaSeries[3] = new Serie("Grey´s Anatomy", 14 ,"Drama", "Shonda Rhimes");
        listaSeries[4] = new Serie("Prison Break", 5, "Drama", "	Paul Scheuring");
  
        listaVideojuegos[0] = new VideoJuego();
        listaVideojuegos[1] = new VideoJuego("Minecraft", 50);
        listaVideojuegos[2] = new VideoJuego("Super Mario Bros", 40, "Plataformas", "Nintendo EAD");
        listaVideojuegos[3] = new VideoJuego("Pokemon Go", 30, "Realidad aumentada", "Niantic, Inc.");
        listaVideojuegos[4] = new VideoJuego("Half-Life", 200,"Disparos en primera persona, ciencia ficción, aventura", "Steam");
        
        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[2].entregar();
        listaVideojuegos[3].entregar();
        
        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos
        int entregados=0;
        for(int i = 0 ; i < listaSeries.length ; i++){
            if(listaSeries[i].isEntregado()){
                entregados += 1;
                listaSeries[i].devolver();
            }
            if(listaVideojuegos[i].isEntregado()){
                entregados += 1;
                listaVideojuegos[i].devolver();
            }
        }
  
        System.out.println("Hay " + entregados + " articulos entregados");
  
        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor = listaSeries[0];
        VideoJuego videojuegoMayor = listaVideojuegos[0];
  
        //Recorremos el array desde la posicion 1, comparando el mayor con las posiciones del array
        for(int i=1 ; i < listaSeries.length ; i++){
            if(listaSeries[i].compareTo(serieMayor) == Serie.MAYOR){
                serieMayor = listaSeries[i];
            }
            if(listaVideojuegos[i].compareTo(videojuegoMayor)== VideoJuego.MAYOR){
                videojuegoMayor = listaVideojuegos[i];
            }
        }
  
        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(serieMayor);
        System.out.println(videojuegoMayor);
    }
    
}
