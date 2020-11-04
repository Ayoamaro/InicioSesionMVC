package dad.javafx.iniciosesion;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * @author Ayoze Amaro
 *
 */
public class View extends GridPane {
	
	private Label userLabel, pswdLabel;
	private TextField user;
	private PasswordField pswd;
	private Button access, cancel;
	private HBox buttonBox;
	
	public View() {
	
		// TextField, Label y Button
		userLabel = new Label("Usuario: ");
		pswdLabel = new Label("Contraseña: ");
		user = new TextField();
		user.setPromptText("Usuario");
		pswd = new PasswordField();
		pswd.setPromptText("Contraseña");
		access = new Button("Acceder");
		access.setDefaultButton(true);
		cancel = new Button("Cancelar");
		
		// Box with Buttons
		buttonBox = new HBox();
		buttonBox.setSpacing(10);
		buttonBox.setAlignment(Pos.CENTER);
		buttonBox.setPadding(new Insets(5));
		buttonBox.getChildren().addAll(access, cancel);
		GridPane.setColumnSpan(buttonBox, 3);
		
		// GridPane 
		this.setPadding(new Insets(15));
		this.setHgap(35);
		this.setVgap(15);
		this.setAlignment(Pos.CENTER);
		this.addRow(0, userLabel, user);
		this.addRow(1, pswdLabel, pswd);
		this.addRow(2, buttonBox);
	}
}
