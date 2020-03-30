package Controlador;

import Vista.ContenedorInicio;
import Vista.ContenedorRegistro;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegistroControlador implements EventHandler<ActionEvent>{
	
	public ContenedorInicio inicio;
	public Stage stage;
	
	public RegistroControlador(ContenedorInicio inicio,Stage stage) {
		this.stage=stage;
		this.inicio=inicio;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		this.stage.setTitle("Registro");
		ContenedorRegistro registro=new ContenedorRegistro(this.inicio,this.stage);
		this.stage.getScene().setRoot(registro);
		//Scene scene = new Scene(registro,800,600);
		//this.stage.setScene(scene);
	}

}
