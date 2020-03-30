package Vista;

import Controlador.InicioControlador;
import Controlador.RegistroControlador;
import Modelo.BaseDeDatos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorInicio extends BorderPane{
	
	public ContenedorInicio (Stage stage,BaseDeDatos bdEmpleados) {
		this.cargarBotones(stage,bdEmpleados);
	}
	public void cargarBotones(Stage stage,BaseDeDatos bdEmpleados) {
		VBox datosUsuario = new VBox();
		HBox botonesInicioRegistro=new HBox();
		datosUsuario.setPadding(new Insets(100));
		datosUsuario.setSpacing(10);
		botonesInicioRegistro.setSpacing(10);
		TextField usuario= new TextField();
		PasswordField contrasena= new PasswordField();
		usuario.setPromptText("Nombre de Usuario");
		Label estado = new Label();
		contrasena.setPromptText("Contrase�a");
		Button ingresar= new Button("Ingresar");
		Button registro=new Button("Registrarse");
		InicioControlador controlInicio = new InicioControlador(usuario,contrasena,estado,bdEmpleados);
		ingresar.setOnAction(controlInicio);
		RegistroControlador controlRegistro=new RegistroControlador(this,stage,bdEmpleados);
		registro.setOnAction(controlRegistro);
		botonesInicioRegistro.setAlignment(Pos.CENTER);
		botonesInicioRegistro.getChildren().addAll(ingresar,registro);
		datosUsuario.setAlignment(Pos.CENTER);
		datosUsuario.getChildren().addAll(usuario,contrasena,estado,botonesInicioRegistro);
		this.setCenter(datosUsuario);
	}

}
