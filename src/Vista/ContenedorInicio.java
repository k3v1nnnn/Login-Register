package Vista;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
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
		datosUsuario.setPadding(new Insets(100));
		datosUsuario.setSpacing(10);
		TextField usuario= new TextField();
		TextField contrasenia= new TextField();
		Button ingresar= new Button("Ingresar");
		datosUsuario.setAlignment(Pos.CENTER);
		datosUsuario.getChildren().addAll(usuario,contrasenia,ingresar);
		this.setCenter(datosUsuario);
	}

}
