package Controlador;

import Modelo.BaseDeDatos;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class InicioControlador implements EventHandler<ActionEvent> {
	private TextField usuario;
	private PasswordField contrasena;
	private Label estado;
	private BaseDeDatos baseDatos;
	public InicioControlador(TextField usuario,PasswordField contrasena,Label estado,BaseDeDatos baseDatos) {
		this.usuario=usuario;
		this.contrasena=contrasena;
		this.estado=estado;
		this.baseDatos=baseDatos;
	}
	@Override
	public void handle(ActionEvent arg0) {
		 if(baseDatos.usuarioCorrecto(this.usuario.getText(),Integer.parseInt(this.contrasena.getText()))) {
			 this.estado.setText("Ingreso Correctamente");
			 this.estado.setTextFill(Color.web("green"));
		 }else {
			 this.estado.setText("Usuario y/o contraseña incorrectos");
			 this.estado.setTextFill(Color.web("red"));
		 }
		 this.usuario.clear();
		 this.contrasena.clear();
	}

}
