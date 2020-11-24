package filaPlaylist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FilaPlaylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> fila = new LinkedList<String>();

        //Adicionando Musicas
        fila.add("In the end");
        fila.add("Numb");
        fila.add("Crawling");
        fila.add("Pushing me away");


        //Buscando musicas
        System.out.println("Digite o nome da musica que deseja buscar:");
        String musica = sc.nextLine();
        Boolean temMusica = false;
      
        for (String u : fila) {
        	if (musica.toUpperCase().equals(u.toUpperCase())) {
                System.out.println("A musica " + musica.toUpperCase() + " Está na lista");
                temMusica = true;
            }
		}
        if (temMusica == false) {
			System.out.println("A Musica não consta na lista");
		}
        
      //Remover uma musica
      		if(fila.size() > 0) {
      			fila.remove();
      		}
      		
      		
      		
      		for (String u : fila) {
      			System.out.println(u);
      		}
      		
      		



    }
}
