#pragma once

//Incluciones
#include "Espacios-de-Memoria-Universales.hpp"

//Listado de Funciones
void mostrar_tablero(char mascara[MAX][MAX]);
void minar_tablero(int tablero[MAX][MAX], int cantbombas);
bool control_minado(int tablero[MAX][MAX], int cantbombas);
void realizar_jugada(int tablero[MAX][MAX], char mascara[MAX][MAX]);
int estado_jugador(char mascara[MAX][MAX], int cantbombas);
void inicializar_matrices(int tablero[MAX][MAX], char mascara[MAX][MAX]);
int solicitar_cant_bombas();
int solicitar_filas();
int solicitar_columnas();