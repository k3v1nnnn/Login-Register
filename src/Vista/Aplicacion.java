package Vista;
import Modelo.LecturaCsv;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Aplicacion extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 @Override
 public void start(Stage stage) throws Exception {
	 LecturaCsv hola=new LecturaCsv();
	 hola.leerCsv("C:\\Users\\RetailAdmin\\eclipse-workspace\\Comedor\\src\\Vista\\productos.csv",true);
	 stage.setTitle("Mi primera ventana");
	 StackPane layout = new StackPane();
	 Scene scene = new Scene(layout,800,600);
	 stage.setScene(scene);
	 stage.show();
 }
}
