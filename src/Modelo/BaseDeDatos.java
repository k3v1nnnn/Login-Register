package Modelo;

import java.util.Iterator;
import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class BaseDeDatos {
	private MongoClient cliente;
	private MongoDatabase bdCliente;
	private MongoCollection<Document> coleccion;
	public BaseDeDatos() {
		this.cliente=MongoClients.create();
		this.bdCliente=this.cliente.getDatabase("empleados");
		this.coleccion = this.bdCliente.getCollection("empleados");
	}
	
	public void usuarioCorrecto(String nombre,int contrasena) {
		
		Document filterDoc = new Document();

		filterDoc.put("nombre", "andre");

		filterDoc.append("contrasena", contrasena);

		Iterator<Document> iter = this.coleccion.find(filterDoc).iterator(); 
		System.out.println(iter.hasNext());
		
	}
}
