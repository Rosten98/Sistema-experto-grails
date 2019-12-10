package analizador;

import java.io.*;
import java.util.ArrayList;

public class Lector {
	public Automata auto_analizador;
	public Arbol arbol;
	public FormaNC convertirFNC;
	public CreadorReglas crearReglas;
	public ForwardChaining forwardChaining;
	public BackwardChaining backwardChaining;

	public ArrayList<String> atomosGeneral;
	public ArrayList<String> atomosFinal;
	public ArrayList<Arbol> arboles;
	public String linea;
	// public String formulas = "";

	public Lector(){
		println "!HOLA MUNDO!"
		auto_analizador = new Automata();
		atomosGeneral = new ArrayList<>();
		atomosFinal = new ArrayList<>();
		arboles = new ArrayList<>();

		main();
	}


	public void main(){
		/*
			1- Lectura de archivo
			2- Analizador
			3- Creación de arboles
		*/
		leer();
		//  4- Impresíón de todos los atomos
		// Imprimir los atomos al finalizar de leer el archivo
		System.out.println("\nAtomos en formulas.txt: " + atomosFinal);
		// 5- Cambio a forma normal conjuntiva
		convertirFNC = new FormaNC(arboles);
		// 6- Crear reglas
		crearReglas = new CreadorReglas(arboles);
		// 7- ForwardChaining
		forwardChaining = new ForwardChaining(crearReglas.obtenerReglas());
		// 8- BackwardChaining
		// backwardChaining = new BackwardChaining(crearReglas.obtenerReglas());
	}

	public void leer(){
		File archivo;
		FileReader fr;
		BufferedReader br;

		try{
			archivo = new File("C:/Users/Gerardo/Desktop/Sistema-experto-grails/grails-app/analizador/_formulas.txt");
			fr = new FileReader(archivo);
			br = new BufferedReader(fr);
			int indice = 0;

			while( (linea = br.readLine()) != null){
				indice++;
				// Si en el analizador da un error, saldrá del programa
				auto_analizador.main(linea, indice);
				atomosGeneral = auto_analizador.getAtomos();

				System.out.println(linea);
				generarListaArboles(linea);

				agregarAtomos();
			}
		}
		// Imprimir la excepción en consola
		catch(Exception e){
			e.printStackTrace();
		}
		// Cerrar el archivo en uso
		finally{
			try{
				if(null != fr){
					fr.close();
				}
			}
			catch(Exception e2){
				e2.printStackTrace();
			}
		}
	}

	public void generarListaArboles(String cadena){
		arbol = new Arbol(cadena);
		arboles.add(arbol);

		System.out.println("Arbol inorden");
		arbol.inorden();
		System.out.println("");
	}

	// Agrega los atomos a un arraylist y revisa que no haya repeticiones
	public void agregarAtomos(){
		boolean encontrado;

		if(atomosFinal.isEmpty()){
			for(String atomo: atomosGeneral){
				atomosFinal.add(atomo);
			}
			atomosGeneral.clear();
		}
		else{
			for(String atomoGral: atomosGeneral){
				encontrado = false;
				for(String atomoFinal: atomosFinal){
					if(atomoGral.equals(atomoFinal)){
						encontrado = true;
						break;
					}
				}
				if(!encontrado)
					atomosFinal.add(atomoGral);
			}
		}
	}
}
