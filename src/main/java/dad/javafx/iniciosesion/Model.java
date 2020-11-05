package dad.javafx.iniciosesion;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Ayoze Amaro
 *
 */
public class Model {

	StringProperty User = new SimpleStringProperty();
	StringProperty Pswd = new SimpleStringProperty();
	
	public final StringProperty UserProperty() {
		return this.User;
	}
	
	public final String getUser() {
		return this.UserProperty().get();
	}
	
	public final void setUser(final String User) {
		this.UserProperty().set(User);
	}
	
	public final StringProperty PswdProperty() {
		return this.Pswd;
	}
	
	public final String getPswd() {
		return this.PswdProperty().get();
	}
	
	public final void setPswd(final String Pswd) {
		this.PswdProperty().set(Pswd);
	}
}
