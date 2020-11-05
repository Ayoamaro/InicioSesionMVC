package dad.javafx.iniciosesion;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
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
	
	private Label UserLabel, PswdLabel;
	private TextField UserField;
	private PasswordField PswdField;
	private Button Access, Cancel;
	private HBox ButtonBox;
	private Alert accessAllowed, accessDenied;
	
	public View() {
		// TextField, Label y Button
		UserLabel = new Label("Usuario: ");
		PswdLabel = new Label("Contraseña: ");
		UserField = new TextField();
		UserField.setPromptText("Usuario");
		PswdField = new PasswordField();
		PswdField.setPromptText("Contraseña");
		Access = new Button("Acceder");
		Access.setDefaultButton(true);
		Cancel = new Button("Cancelar");
		
		// Box with Buttons
		ButtonBox = new HBox();
		ButtonBox.setSpacing(10);
		ButtonBox.setAlignment(Pos.CENTER);
		ButtonBox.setPadding(new Insets(5));
		ButtonBox.getChildren().addAll(Access, Cancel);
		GridPane.setColumnSpan(ButtonBox, 3);
		
		// GridPane 
		this.setPadding(new Insets(15));
		this.setHgap(35);
		this.setVgap(15);
		this.setAlignment(Pos.CENTER);
		this.addRow(0, UserLabel, UserField);
		this.addRow(1, PswdLabel, PswdField);
		this.addRow(2, ButtonBox);
		
		// Alert Allowed
		accessAllowed = new Alert(AlertType.INFORMATION);
		accessAllowed.setTitle("Iniciar Sesión");
		accessAllowed.setHeaderText("Acceso permitido");
		accessAllowed.setContentText("Las credenciales de acceso son válidas.");
		
		// Alert Denied
		accessDenied = new Alert(AlertType.ERROR);
		accessDenied.setTitle("Iniciar Sesión");
		accessDenied.setHeaderText("Acceso denegado");
		accessDenied.setContentText("El usuario y/o la contraseña no son válidos.");
	}
	
	// User TextField
	public TextField getUserField() {
		return UserField;
	}

	public void setUserField(TextField UserField) {
		this.UserField = UserField;
	}
	
	// Password PasswordField
	public TextField getPswdField() {
		return PswdField;
	}

	public void setPswdField(PasswordField PswdField) {
		this.PswdField = PswdField;
	}
	
	// Button Access
	public Button getAccess() {
		return Access;
	}

	public void setAccess(Button Access) {
		this.Access = Access;
	}

	// Button Cancel
	public Button getCancel() {
		return Cancel;
	}

	public void setCancel(Button Cancel) {
		this.Cancel = Cancel;
	}
	
	// Alert accessAllowed
	public Alert getAccessAllowed() {
		return accessAllowed;
	}

	public void setAccessAllowed(Alert accessAllowed) {
		this.accessAllowed = accessAllowed;
	}
	
	// Alert accessDenied
	public Alert getAccessDenied() {
		return accessDenied;
	}

	public void setAccessDenied(Alert accessDenied) {
		this.accessDenied = accessDenied;
	}
}
