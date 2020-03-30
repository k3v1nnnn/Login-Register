package Vista;

import Controlador.GuardarControlador;
import Modelo.BaseDeDatos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorRegistro extends BorderPane{
	
	public ContenedorRegistro(ContenedorInicio inicio,Stage stage,BaseDeDatos bdEmpleados) {
		this.cargarBotones(inicio,stage,bdEmpleados);
	}
	public void cargarBotones(ContenedorInicio inicio,Stage stage,BaseDeDatos bdEmpleados) {
		VBox datosNuevoUsuario = new VBox();
		datosNuevoUsuario.setPadding(new Insets(100));
		datosNuevoUsuario.setSpacing(10);
		Label nombre = new Label("Nombre");
		TextField tNombre = new TextField();
		Label contrasena = new Label("Contraseña");
		TextField tContrasena = new TextField();
		Label repContrasena = new Label("Repetir Contraseña");
		TextField tRepContrasena = new TextField();
		Label edad = new Label("Edad");
		TextField tEdad = new TextField();
		Label pais = new Label("Pais");
		TextField tPais = new TextField();
		Label estado = new Label(); 
		Button guardar = new Button("Guardar");
		GuardarControlador controlGuardar=new GuardarControlador(tNombre,tContrasena,tRepContrasena,tEdad,tPais,estado,inicio,stage,bdEmpleados);
		guardar.setOnAction(controlGuardar);
		datosNuevoUsuario.getChildren().addAll(nombre,tNombre,contrasena,tContrasena,
				repContrasena,tRepContrasena,edad,tEdad,pais,tPais,estado,guardar);
		this.setCenter(datosNuevoUsuario);
	}
}
