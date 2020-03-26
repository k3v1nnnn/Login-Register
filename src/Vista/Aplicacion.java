package Vista;


import Modelo.BaseDeDatos;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Aplicacion extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 @Override
 public void start(Stage stage) throws Exception {
	 //BaseDeDatos b=new BaseDeDatos();
	 //b.usuarioCorrecto("kevin", 1234);
	 //ContenedorInicio contenedorInicio = new ContenedorInicio(stage);
	 ContenedorRegistro contenedorRegis=new ContenedorRegistro(stage);
	 stage.setTitle("Inicio");
	 //Scene scene = new Scene(contenedorInicio,800,600);
	 Scene scene = new Scene(contenedorRegis,800,600);
	 stage.setScene(scene);
	 stage.show();
 }
}
