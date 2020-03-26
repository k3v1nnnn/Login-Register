package Vista;

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
	private Stage stage;
	
	public ContenedorInicio (Stage stage) {
		this.stage=stage;
		this.cargarBotones();
	}
	
	public void cargarBotones() {
		VBox datosUsuario = new VBox();
		HBox botonesInicioRegistro=new HBox();
		datosUsuario.setPadding(new Insets(100));
		datosUsuario.setSpacing(10);
		botonesInicioRegistro.setSpacing(10);
		TextField usuario= new TextField();
		PasswordField contrasena= new PasswordField();
		usuario.setPromptText("Nombre de Usuario");
		contrasena.setPromptText("Contraseña");
		Button ingresar= new Button("Ingresar");
		Button registro=new Button("Registrarse");
		Label estado = new Label();
		botonesInicioRegistro.setAlignment(Pos.CENTER);
		botonesInicioRegistro.getChildren().addAll(ingresar,registro);
		datosUsuario.setAlignment(Pos.CENTER);
		datosUsuario.getChildren().addAll(usuario,contrasena,estado,botonesInicioRegistro);
		this.setCenter(datosUsuario);
	}

}
