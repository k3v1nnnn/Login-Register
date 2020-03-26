package Vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ContenedorRegistro extends BorderPane{
	private Stage stage;
	
	public ContenedorRegistro(Stage stage) {
		this.stage=stage;
		this.cargarBotones();
	}
	public void cargarBotones() {
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
		datosNuevoUsuario.getChildren().addAll(nombre,tNombre,contrasena,tContrasena,
				repContrasena,tRepContrasena,edad,tEdad,pais,tPais,estado,guardar);
		this.setCenter(datosNuevoUsuario);
	}
}
