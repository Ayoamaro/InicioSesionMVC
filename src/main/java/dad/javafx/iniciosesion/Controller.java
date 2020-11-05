package dad.javafx.iniciosesion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import org.apache.commons.codec.digest.DigestUtils;

import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;

/**
 * @author Ayoze Amaro
 *
 */
public class Controller {

	private View view = new View();
	private Model model = new Model();
	private ArrayList<String> linesCSV = new ArrayList<>();
	
	public Controller() {
		// Reading File
		readUsersFile();
		// Get User and Password to Set Model
		Bindings.bindBidirectional(view.getUserField().textProperty(), model.UserProperty());
		Bindings.bindBidirectional(view.getPswdField().textProperty(), model.PswdProperty());
		// Functions Buttons Access and Cancel
		view.getAccess().setOnAction(e -> onAccessButtonAction(e));
		view.getCancel().setOnAction(f -> Platform.exit());
	}
	
	private void readUsersFile() {
		// Save files lines on ArrayList
		try {
		    File file = new File ("src/main/resources/users.csv");
		    FileReader readFile = new FileReader(file, Charset.forName("UTF-8"));
		    BufferedReader usersRead = new BufferedReader(readFile);
		    String lines;
		    
		    // Reading lines until the end
		    while ((lines = usersRead.readLine()) != null) {
		    	linesCSV.add(lines);
		    }
		    usersRead.close();
		}
		catch (IOException error) { 
			error.printStackTrace();
		}
	}
	
	private void onAccessButtonAction(ActionEvent e) {
		// User login and password entered by user
		Boolean verify = false;
		String md5Password = DigestUtils.md5Hex(view.getPswdField().textProperty().get()).toUpperCase();
		String md5User = model.getUser();
		
		// Checking each user and password
		for (int i = 0; i < linesCSV.size(); i++) {
			String[] dataFile = linesCSV.get(i).split(";");
		    String userEach = dataFile[0];
		    String passEach = dataFile[1];

		    if (userEach.equals(md5User) && passEach.equals(md5Password)) { verify = true; }
		}
		// Access Granted
		if (verify == true) { view.getAccessAllowed().showAndWait(); }
		// Access Denied
		else { view.getAccessDenied().showAndWait(); }
	}
	
	public View getView() {
		return this.view;
	}
}