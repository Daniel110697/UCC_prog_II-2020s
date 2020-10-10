ALGORITMO algebrin_hombrerico
	
	definir algebrin Como Entero;
	definir dividin Como Entero;
	definir moribundo Como Entero;
	
	algebrin <- 5;
	dividin <- 3;
	moribundo <- algebrin + dividin;
	
	algebrin <- algebrin * 3;
	dividin <- dividin * 3;
	
	moribundo <- algebrin + dividin;
	algebrin <- algebrin - moribundo / 3;
	dividin <- dividin - moribundo  / 3;
	moribundo <- moribundo / 3;
	
	escribir " cuantos pedazos entrego algebrin ", algebrin;
	escribir " cuantos pedazos entrego dividin ", dividin;
	escribir " cuantos pedazos se comio el moribundo ", moribundo;
	escribir " cuantas monedas recibio algebrin ", algebrin;
	escribir " cuantas monedas recibio dividin ", dividin;
	escribir " cuantas monedas entrego el moribundo ", moribundo;
	
	
FinAlgoritmo

	