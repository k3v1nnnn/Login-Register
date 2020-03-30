package Modelo;

import java.util.Iterator;
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
	
	public boolean usuarioCorrecto(String nombre,String contrasena) {
		Document filterDoc = new Document();
		filterDoc.put("nombre", nombre);
		filterDoc.append("contrasena", contrasena);
		Iterator<Document> iter = this.coleccion.find(filterDoc).iterator();
		return iter.hasNext();
	}
	public void agregarUsuario(String nombre,String contrasena,int edad,String pais) {
		Document newDoc = new Document();
		newDoc.put("nombre", nombre);
		newDoc.put("contrasena", contrasena);
		newDoc.put("edad",edad);
		newDoc.append("pais", pais );
		this.coleccion.insertOne(newDoc);
	}
}
