//Realizar un programa que rellene un vector de tamaño N, con valores ingresados por el
//usuario. A continuación, se debe buscar un elemento dentro del arreglo (el número a buscar
//también debe ser ingresado por el usuario). 
///El programa debe indicar la posición donde se encuentra el valor.
// En caso que el número se encuentre repetido dentro del arreglo se deben
//imprimir todas las posiciones donde se encuentra ese valor.
//Finalmente, en caso que el número a buscar no está adentro del arreglo se debe mostrar un
//mensaje.

Algoritmo sin_titulo
	Definir vector, i, j, h, k, busca Como Entero
	
	
	Escribir "Ingrese la dimensión del vector"
	Leer i
	Escribir "Ingrese los valores que estan en el vector"
	
	k=0
	Dimension vector(i)
	Para j <- 0 Hasta i - 1 Con Paso 1 Hacer
		Leer vector(j)
	Fin Para
	Escribir "Ingrese el número que desee buscar"
	Leer busca
	Para h <- 0 Hasta i - 1 Con Paso 1 Hacer
		Si busca = vector(h) Entonces
			Escribir h
			Sino k=k+1 
		FinSi
	Fin Para
	Si k=i entonces 
		Escribir "No encontré el número"
	FinSi
	 
	
FinAlgoritmo
