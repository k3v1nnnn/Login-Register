package Vista;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class Main extends Application {
 public static void main(String[] args) {
 launch(args);
 }
 @Override
 public void start(Stage stage) throws Exception {
 stage.setTitle("Mi primera ventana");
 StackPane layout = new StackPane();
 Scene scene = new Scene(layout,800,600);
 stage.setScene(scene);
 Button button = new Button();
 button.setText("Texto del botón");
 layout.getChildren().add(button);
 stage.show();
 }
}
