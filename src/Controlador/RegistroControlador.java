package Controlador;

import Modelo.BaseDeDatos;
import Vista.ContenedorInicio;
import Vista.ContenedorRegistro;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;

public class RegistroControlador implements EventHandler<ActionEvent>{
	
	private ContenedorInicio inicio;
	private Stage stage;
	private BaseDeDatos baseDatos;
	
	public RegistroControlador(ContenedorInicio inicio,Stage stage,BaseDeDatos bdEmpleados) {
		this.stage=stage;
		this.inicio=inicio;
		this.baseDatos=bdEmpleados;
	}
	
	@Override
	public void handle(ActionEvent arg0) {
		this.stage.setTitle("Registro");
		ContenedorRegistro registro=new ContenedorRegistro(this.inicio,this.stage,this.baseDatos);
		this.stage.getScene().setRoot(registro);
	}

}
