package Controlador;

import Modelo.BaseDeDatos;
import Vista.ContenedorInicio;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class GuardarControlador implements EventHandler<ActionEvent>{
	private TextField nombre;
	private TextField contrasena;
	private TextField repContrasena;
	private TextField edad;
	private TextField pais;
	private Label estado;
	private ContenedorInicio inicio;
	private Stage stage;
	private BaseDeDatos baseDatos;
	
	public GuardarControlador(TextField nombre,TextField contrasena,
			TextField repContrasena,TextField edad,TextField pais,
			Label estado,ContenedorInicio inicio,Stage stage,BaseDeDatos baseDatos) {
		this.nombre=nombre;
		this.contrasena=contrasena;
		this.repContrasena=repContrasena;
		this.edad=edad;
		this.pais=pais;
		this.estado=estado;
		this.inicio=inicio;
		this.stage=stage;
		this.baseDatos=baseDatos;
	}
	public boolean datosVacios(TextField nombre,TextField contrasena,
			TextField repContrasena,TextField edad,TextField pais) {
		return nombre.getText().isEmpty()||contrasena.getText().isEmpty()||repContrasena.getText().isEmpty()||
				edad.getText().isEmpty()||pais.getText().isEmpty();
		
	}
	@Override
	public void handle(ActionEvent arg0) {
		if(this.datosVacios(this.nombre,this.contrasena,this.repContrasena,this.edad,this.pais)) {
			this.estado.setText("Datos vacios");
			this.estado.setTextFill(Color.web("red"));
		}else {
		if(this.contrasena.getText().equals(this.repContrasena.getText())) {
			this.baseDatos.agregarUsuario(this.nombre.getText(), this.contrasena.getText(),
					Integer.parseInt(this.edad.getText()), this.pais.getText());
			this.stage.setTitle("Inicio");
			this.stage.getScene().setRoot(this.inicio);
		}else {
			this.contrasena.clear();
			this.repContrasena.clear();
			this.estado.setText("La contraseña no coincide");
			this.estado.setTextFill(Color.web("red"));
		}
		}
	}
	

}
