package Modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
//sacado de https://gist.github.com/inazense/0b5134b65741b3e21bbd95b14e5ea401
public class LecturaCsv {
	private char separador=',';
	public void leerCsv(String path,boolean nombreLinea) throws IOException {
		boolean tieneNombre=nombreLinea; //verifico que la primera linea sea el nombre de los datos
		BufferedReader bufferLectura = new BufferedReader(new FileReader(path));
		// Leo una línea del archivo
		String linea = bufferLectura.readLine();
		
		while (linea != null) {
			if(tieneNombre) {
				tieneNombre=false;
			}
			else {
				// Separa la línea leída con el separador definido previamente
				String[] campos = linea.split(String.valueOf(this.separador));
				System.out.println(campos[0]);
				//System.out.println(Arrays.toString(campos));
				
			}
			// Vuelvo a leer del fichero
			linea = bufferLectura.readLine();
		}
		
		// CIerro el buffer de lectura
		if (bufferLectura != null) {
			bufferLectura.close();
		}
	}
}
