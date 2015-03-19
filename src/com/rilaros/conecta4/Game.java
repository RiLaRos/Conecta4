package com.rilaros.conecta4;

import java.util.Random;

public class Game {
	static final int NFILAS = 6;
    static final int NCOLUMNAS = 7;
    static final int VACIO = 0;
    static final int MAQUINA = 1;
    static final int JUGADOR = 2;

    private int tablero[][];

    public Game() {
        tablero = new int[NFILAS][NCOLUMNAS];

        for (int i = 0; i < NFILAS; i++)
            for (int j = 0; j < NCOLUMNAS; j++)
                tablero[i][j] = VACIO;
    }

    /*************************************************************************
     Completa este metodo.
     Parametros: indices i y j del tablero.
     Retorno: cierto si la posicion tablero[i][j] esta vacia (su valor
     es VACIO) y falso en caso contrario
     *************************************************************************/
    public boolean estaVacio(int i, int j) {
        // Aqui debes incluir tu codigo
    	
    	return true;
    }

    /*************************************************************************
     Completa este metodo.
     Parametros: indices i y j del tablero.
     Retorno: cierto si la posicion tablero[i][j] esta ocupada por el
     jugador (su valor es JUGADOR) y falso en caso contrario
     *************************************************************************/
    public boolean estaJugador(int i, int j) {
    	
    	// Aqui debes incluir tu codigo
    	if(tablero[i][j]==JUGADOR){
    		return true;
    	}
    	
        return false;
    }

    public void ponerJugador(int i, int j) {
        tablero[i][j] = JUGADOR;
    }

    public boolean tableroLleno() {
        for (int i=0; i<NFILAS; i++)
            for (int j=0; j<NCOLUMNAS; j++)
                if (tablero[i][j] == VACIO)
                    return false;

        return true;
    }

    /*************************************************************************
     Completa este metodo.
     Parametros: indices i y j del tablero.
     Retorno: cierto si se puede colocar ficha en la posicion (i,j) del
     tablero. Debes comprobar que esa posicion del tablero esta vacia
     (su valor es VACIO) y que es la posicion vacia mas baja del tablero.
     En caso contrario, la funcion debe devolver false.
     *************************************************************************/
    public boolean sePuedeColocarFicha(int i, int j) {
        // Aqui debes incluir tu codigo
    	if (tablero[i][j] == VACIO){
    		return true;
    	}
    	
    	return false;
    }

    public void juegaMaquina() {
        int i;
        int fila = -1, columna;
        Random r = new Random();

        do {
            columna = r.nextInt(NCOLUMNAS);

            for (i = 0; i < NFILAS; i++)
                if (tablero[i][columna] == VACIO) {
                    fila = i;
                    break;
                }
        } while (fila < 0);

        tablero[fila][columna] = MAQUINA;
    }

}
