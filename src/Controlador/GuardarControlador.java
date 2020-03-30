package Controlador;

import Vista.ContenedorInicio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class GuardarControlador implements EventHandler<ActionEvent>{
	private TextField nombre;
	private TextField contrasena;
	private TextField repContrasena;
	private TextField edad;
	private TextField pais;
	private ContenedorInicio inicio;
	private Stage stage;
	
	public GuardarControlador(TextField nombre,TextField contrasena,
			TextField repContrasena,TextField edad,TextField pais,
			ContenedorInicio inicio,Stage stage) {
		this.nombre=nombre;
		this.contrasena=contrasena;
		this.repContrasena=repContrasena;
		this.edad=edad;
		this.pais=pais;
		this.inicio=inicio;
		this.stage=stage;
	}
	@Override
	public void handle(ActionEvent arg0) {
		int con=Integer.parseInt(this.contrasena.getText());
		int reCon=Integer.parseInt(this.repContrasena.getText());
		int ed=Integer.parseInt(this.edad.getText());
		System.out.print(con==reCon);
		this.stage.setTitle("Inicio");
		this.stage.getScene().setRoot(this.inicio);
	}
	

}
