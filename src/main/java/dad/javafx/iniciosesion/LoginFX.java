package dad.javafx.iniciosesion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author Ayoze Amaro
 *
 */
public class LoginFX extends Application {

	Controller controller = new Controller();
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		Scene scene = new Scene(controller.getView(), 340, 150);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Inicio de Sesión MVC");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
