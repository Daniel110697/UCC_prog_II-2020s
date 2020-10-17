Proceso pseudocodigo_4
	
	Definir rsp1, rsp2, rsp3, rsp4, k Como Entero;
	
	rsp1 <- 1;
	rsp2 <- 1;
	rsp3 <- 1;
	rsp4 <- 1;
	
	Escribir  "¿Benjamin Franklin invento el pararrayos? (0) Falso, (1) verdadero: ", rsp1;
	Leer  rsp1;
	
	Escribir  "¿Samuel Morse invento el telegrafo? (0) Falso, (1) Verdadero: ", rsp2;
	Leer rsp2;
	
	Escribir  "¿Perú es un pais de suramericano? (0) Falso, (1) Verdadero: ", rsp3;
	Leer  rsp3;
	
	Escribir  "¿El 5 es un numero primo? (0) Falso, (1) Verdadero: ", rsp4;
	Leer rsp4;
	
	si (rsp1 >= rsp2) y (rsp3 == rsp4) Entonces
		k <- 1;
	SiNo
		k <- 0;
	FinSi
	
	Escribir  "El valor final vale. ", k;
	
FinProceso

