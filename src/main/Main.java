package main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	 public static void main(String[] args) 
	    {

	        ArrayList <String> cartas = new ArrayList<>();
	        
	        String [] numeracion = {"As de ", "Dos de ", "Tres de ", "Cuatro de ", "Cinco de ", "Seis de ", "Siete de ", "Ocho de ", "Nueve de ", "Diez de ", "Jota de ", "Reina de ", "Rey de "};

	        int i = 0;

	            for(i = 0; i < 13; i++)
	                {
	                    cartas.add(numeracion[i] + "picas");
	                }

	            for(i = 0; i < 13; i++)
	                {
	                    cartas.add(numeracion[i] + "diamantes");
	                }

	            for(i = 0; i < 13; i++)
	                {
	                    cartas.add(numeracion[i] + "treboles");
	                }

	            for(i = 0; i < 13; i++)
	                {
	                    cartas.add(numeracion[i] + "corazones");
	                }
	            
	            for(i = 0; i < cartas.size(); i++) 
	            {
	            	System.out.println(cartas.get(i));
	            }

	        System.out.println("Buenos noches, monsier/madame\nMe da júbilo su vuelta, por aquí, acompáñeme a su mesa");
	        System.out.println("¿Querrá su habitual Caipirinha agitada no removida?\n");

	        Scanner teclado = new Scanner(System.in);

	        String respuesta = "";

	        while(!(respuesta.equalsIgnoreCase("SI") || respuesta.equalsIgnoreCase("NO")))
	            {
	                System.out.println("Responda solo: SI o NO, el resto déjemelo a mi\n");
	                respuesta = teclado.nextLine();
	            }
	        
	        if (respuesta.equalsIgnoreCase("SI")) 
	        {
	            System.out.println("Genial, deme un minuto, mientras elija la mesa que más le guste");
	        }
	        
	        else
	        {
	        	System.out.println("Por supuesto monsier/madame, disculpe mi indiscreción al ofrecérselo\nElijamos mesa entonces");
	        }
	        
	        System.out.println("Ahora mismo solo tenemos disponible la mesa de La Veintiuno, disculpe las molestias");
	        System.out.println("Sientese, voy a explicarle las reglas de La Veintiuno");
	        
	        System.out.println("Reglas del Veintiuno\nEl objetivo es acercarse a 21 puntos más que el crupier sin pasarse.\nPasarse de 21 se llama reventar y resulta en la pérdida inmediata de la apuesta.\nValor de las Carta:\nAs: Vale 1 u 11 puntos (se elige el valor más favorable).\nFiguras (J, Q, K): Valen 10 puntos.\nCartas Numéricas (2 al 10): Valen su valor nominal.\nVeintiuno: Es la suma exacta de 21 puntos conseguida con las dos primeras cartas (un As y una carta de valor 10).\nDesarrollo del Juego\nReparto: El crupier reparte dos cartas boca arriba a cada jugador y dos cartas para sí mismo (una boca arriba y una boca abajo).\nTurno del Jugador: Cada jugador decide qué hacer con su mano.\nOpciones del Jugador\nPedir carta adicional: Siempre disponible hasta reventar.\nPlantarse: terminar el turno y conservar el total actual\nReglas del Crupier:\nEl crupier juega de forma automática siguiendo estas normas:\nEl crupier debe pedir carta si su mano suma 16 o menos.\nEl crupier debe plantarse si su mano suma 17 o más.\nResultados:\nVictoria Normal: el jugador tiene más puntos que el crupier sin reventar.\nEmpate: ambos tienen el mismo total.\nDerrota: el crupier u otro jugador tiene más puntos.");
	    }
	 
}
