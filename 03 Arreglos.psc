//Realizar un programa que rellene un vector de tama�o N, con valores ingresados por el
//usuario. A continuaci�n, se debe buscar un elemento dentro del arreglo (el n�mero a buscar
//tambi�n debe ser ingresado por el usuario). 
///El programa debe indicar la posici�n donde se encuentra el valor.
// En caso que el n�mero se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el n�mero a buscar no est� adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo sin_titulo
	Definir vector, i, j, h, k, busca Como Entero
	
	
	Escribir "Ingrese la dimensi�n del vector"
	Leer i
	Escribir "Ingrese los valores que estan en el vector"
	
	k=0
	Dimension vector(i)
	Para j <- 0 Hasta i - 1 Con Paso 1 Hacer
		Leer vector(j)
	Fin Para
	Escribir "Ingrese el n�mero que desee buscar"
	Leer busca
	Para h <- 0 Hasta i - 1 Con Paso 1 Hacer
		Si busca = vector(h) Entonces
			Escribir h
			Sino k=k+1 
		FinSi
	Fin Para
	Si k=i entonces 
		Escribir "No encontr� el n�mero"
	FinSi
	 
	
FinAlgoritmo
